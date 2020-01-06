package seller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class CouponDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	DataSource ds;

	public CouponDAO() {
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

	public void insertCoupon(String coupon_name, String startdate, String enddate, int discount, String id) {

		try {
			conn = ds.getConnection();
			String sql = "insert into coupon values(?,?,?,?,?)";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coupon_name);
			pstmt.setString(2, startdate);
			pstmt.setString(3, enddate);
			pstmt.setInt(4, discount);
			pstmt.setString(5, id);

			pstmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}// end insertCoupon

	public ArrayList<CouponVO> getAllCoupon(String seller_id) {// namecard table에 있는 모든 레코드를 넘겨줌
		ArrayList<CouponVO> botari = new ArrayList<CouponVO>();

		String SQL = "select * from coupon where seller_id=?";
		CouponVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, seller_id);
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new CouponVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setCoupon_name(rs.getString("coupon_name"));
				vo.setStartdate(rs.getTimestamp("start_date"));
				vo.setEnddate(rs.getTimestamp("end_date"));
				vo.setDiscount(rs.getInt("discount"));
				vo.setSeller_id(rs.getString("seller_id"));

				botari.add(vo);
				
				
			}
			
			for(CouponVO vo1 : botari) {
				System.out.println(vo1.getCoupon_name());
				System.out.println(vo1.getDiscount());
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;
	}

	public int getCouponCount(String seller_id) {
		int x = 0;
		try {
			conn = ds.getConnection();
			String sql = "select count(*) from coupon where seller_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, seller_id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				x = rs.getInt(1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		closeDB();

		return x;
	}// getArticleCount end

}
