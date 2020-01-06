package Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class CartDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	DataSource ds;

	public CartDAO() {
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

	/*********************************************/
	public void insertCart(cartVO vo) {

		try {
			conn = ds.getConnection();

			String sql = "insert into cart(cus_id, product_num, amount) values(?,?,?)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, vo.getCus_id());
			pstmt.setInt(2, vo.getProduct_num());
			pstmt.setInt(3, vo.getAmount());

			pstmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeDB();
		}

	}

	public ArrayList<cartVO> getAllCart(String cus_id) {// namecard table에 있는 모든 레코드를 넘겨줌
		ArrayList<cartVO> botari = new ArrayList<cartVO>();

		String SQL = "SELECT c.*,p.*,p.price,(c.amount * p.PRICE) pro_price FROM cart c, product p WHERE c.product_num = p.PRODUCT_NUM  and c.cus_id=?";
		cartVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, cus_id);
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new cartVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setProduct_num(rs.getInt("product_num"));
				vo.setAmount(rs.getInt("amount"));
				vo.setPrice(rs.getInt("price"));
				vo.setSize(rs.getString("size"));
				vo.setColor(rs.getString("color"));
				vo.setProduct_img(rs.getString("product_img"));
				vo.setProduct_name(rs.getString("product_name"));
				vo.setPro_price(rs.getInt("pro_price"));
				vo.setCart_id(rs.getInt("cart_id"));

				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;
	}

	public ArrayList<cartVO> getTotal(String cus_id) {// namecard table에 있는 모든 레코드를 넘겨줌
		ArrayList<cartVO> botari = new ArrayList<cartVO>();

		String SQL = "SELECT sum(c.amount) total_amount, SUM(c.amount * p.PRICE) total_price  FROM cart c,  product p WHERE  c.product_num = p.PRODUCT_NUM AND c.cus_id=?";
		cartVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, cus_id);
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new cartVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setTotal_amount(rs.getInt("total_amount"));
				vo.setTotal_price(rs.getInt("total_price"));

				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;
	}

	public int ProductCheck(String id, int num) {

		int check = -1;// 아이디 없음

		try {
			conn = ds.getConnection();
			String SQL = "SELECT * FROM  cart  WHERE product_num=? AND cus_id=?";
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, num);
			pstmt.setString(2, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {

				check = 1;

			}

			else {
				check = 0;

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}

		return check;
	}// end productCheck

	;

	public int ProductAmountCheck(String id, int num) {

		int check = 0;// 아이디 없음

		try {
			conn = ds.getConnection();
			String SQL = "SELECT SUM(amount) count FROM  cart  WHERE product_num=? AND cus_id=?";
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, num);
			pstmt.setString(2, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {

				check = rs.getInt("count");

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		System.out.println("결과" + check);
		return check;
	}// end productCheck

	public void update(int amount, int product_num) {
		try {
			conn = ds.getConnection();
			String SQL = "update cart set amount=amount+? where product_num=?";
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, amount);
			pstmt.setInt(2, product_num);

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}

	}

	public void multidelete(String id) {

		try {
			conn = ds.getConnection();
			String SQL = "delete from cart where cart_id = ?";
			pstmt = conn.prepareStatement(SQL);

			pstmt.setString(1, id);

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}

	}// end 체크박스로 여러개 삭제

	public void updateAmount(int amount, String id) {

		try {
			conn = ds.getConnection();
			String SQL = "update  cart set amount=? where cart_id = ?";
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, amount);
			pstmt.setString(2, id);

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}

	}
}
