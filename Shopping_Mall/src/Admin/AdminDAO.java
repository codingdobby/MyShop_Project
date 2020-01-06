package Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import member.MemberVO;
import seller.CouponVO;
import seller.SellerVO;

public class AdminDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	DataSource ds;

	public AdminDAO() {
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

	// 회원 목록 보기
	public ArrayList<MemberVO> getAllCustomer() {// namecard table에 있는 모든 레코드를 넘겨줌
		ArrayList<MemberVO> botari = new ArrayList<MemberVO>();

		String SQL = "select * from member";
		MemberVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new MemberVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setPhone(rs.getString("phone"));
				vo.setReg_date(rs.getTimestamp("reg_date"));
				vo.setPOINT(rs.getInt("point"));

				botari.add(vo);

			}

			for (MemberVO vo1 : botari) {
				System.out.println(vo1.getName());
				System.out.println(vo1.getId());

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;

	}// end getAllCustomer

	// 총회원수
	public int countCustomer() {
		int count = 0;
		String SQL = "select count(*) from member";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				count = rs.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return count;
	}// end countCustomer

	// 신규회원수
	public int countNewCustomer() {
		int count = 0;
		String SQL = "SELECT count(*) from member where STR_TO_DATE(reg_date,'%Y-%m-%d') = CURDATE()";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				count = rs.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return count;
	}// end countNewCustomer
	/*******************************************************************************/

	// 판매자
	/********************************************************************************/
	// 판매자
	public ArrayList<SellerVO> getAllSeller() {// namecard table에 있는 모든 레코드를 넘겨줌
		ArrayList<SellerVO> botari = new ArrayList<SellerVO>();

		String SQL = "select * from seller order by reg_date desc";
		SellerVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new SellerVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setSeller_id(rs.getString("seller_id"));
				vo.setSeller_company(rs.getString("seller_company"));
				vo.setReg_date(rs.getTimestamp("reg_date"));
				vo.setPhone(rs.getString("phone"));
				vo.setVerify(rs.getString("verify"));

				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;

	}// end getAllCustomer

	public ArrayList<SellerVO> getVerifySeller() {// namecard table에 있는 모든 레코드를 넘겨줌
		ArrayList<SellerVO> botari = new ArrayList<SellerVO>();

		String SQL = "select * from seller where verify='x' order by reg_date asc";
		SellerVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new SellerVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setSeller_id(rs.getString("seller_id"));
				vo.setSeller_company(rs.getString("seller_company"));
				vo.setReg_date(rs.getTimestamp("reg_date"));
				vo.setPhone(rs.getString("phone"));
				vo.setVerify(rs.getString("verify"));

				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;

	}// end getVerifySeller

	// 총 판매자
	public int countSeller() {
		int count = 0;
		String SQL = "select count(*) from seller";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				count = rs.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return count;
	}// end countCustomer

	// 신규 판매자
	public int countNewSeller() {
		int count = 0;
		String SQL = "SELECT count(*) from seller where STR_TO_DATE(reg_date,'%Y-%m-%d') = CURDATE()";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				count = rs.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return count;
	}// end countNewCustomer
	/*********************************************************************************/

	// 관리자 승인 기능

	/**************************************************************************/

	public void admit(String pnum) {

		String SQL = "update seller set verify='o' where seller_id=?";

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, pnum);
			pstmt.executeUpdate(); // insert, update, delete 문에 사용
		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeDB();
	}

}
