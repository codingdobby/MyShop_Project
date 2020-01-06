package Pay;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import Product.cartVO;

public class PayDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	DataSource ds;

	public PayDAO() {
		try {
			Context context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/mariaDB");
		} catch (Exception e) {
			System.out.println("DB connection err:" + e);
		}
	}// DBconnect

	public void closeDB() {
		try {
			if (pstmt != null)
				pstmt.close();
			if (rs != null)
				rs.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("SQL오류(close)");
			e.printStackTrace();
		}

	}// DBClose
	
	
	
	public ArrayList<cartVO> selectCart(String cus_id,String id) {// namecard table에 있는 모든 레코드를 넘겨줌
		ArrayList<cartVO> botari = new ArrayList<cartVO>();

		String SQL = "SELECT c.*,p.* ,(c.amount*p.price) tot_price FROM cart c, product p WHERE c.product_num = p.product_num and c.cus_id=? AND cart_id=?";
		cartVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, cus_id);
			
			pstmt.setString(2, id);
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new cartVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setProduct_num(rs.getInt("product_num"));
				vo.setAmount(rs.getInt("amount"));
				vo.setCart_id(rs.getInt("cart_id"));
				vo.setPro_price(rs.getInt("tot_price"));
				vo.setProduct_name(rs.getString("product_name"));
				vo.setProduct_img(rs.getString("product_img"));
					
				botari.add(vo);
				System.out.println(vo.getAmount());
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;
	}
		
	
}
