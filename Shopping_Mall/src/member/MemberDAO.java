package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import Board.BoardVO;
import Product.cartVO;
import seller.CouponVO;

public class MemberDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	DataSource ds;

	public MemberDAO() {
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

	// 기능 구현

	// 회원가입
	public int insertInfo(MemberVO vo) {

		int result = 0;
		try {
			conn = ds.getConnection();

			String sql = "insert into member(id, pwd, name,nickname, phone, zipcode, email, address1, address2,birth) values(?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPwd());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getNickname());
			pstmt.setString(5, vo.getPhone1() + vo.getPhone2() + vo.getPhone3());
			pstmt.setString(6, vo.getZipcode());
			pstmt.setString(7, vo.getEmail());
			pstmt.setString(8, vo.getAddress1());
			pstmt.setString(9, vo.getAddress2());
			pstmt.setString(10, vo.getBirth());

			result = pstmt.executeUpdate();
			result = 1;
		} catch (SQLException e) {
			result = 0;
			e.printStackTrace();
		} finally {
			closeDB();
		}

		return result;
	}// insertInfo end

	// 비회원 로그인
	public int non_member_check(String non_pwd, String non_name, String phone) {

		int result = 0;
		try {
			conn = ds.getConnection();
			Random ran = new Random();

			int ran_id = (ran.nextInt(9999999) + 1);
			String ran_String_id = Integer.toString(ran_id);

			String sql = "insert into member(id, pwd, name, phone) values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ran_String_id);
			pstmt.setString(2, non_pwd);
			pstmt.setString(3, non_name);
			pstmt.setString(4, phone);
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			result = 0;
			e.printStackTrace();
		} finally {
			closeDB();
		}

		return result;
	}// insertInfo end

	// Login Function

	public int LoginCheck(String id, String pass) {
		System.out.println("로그인 실패 ");
		int check = -1;// 아이디 없음

		try {
			conn = ds.getConnection();
			String SQL = "select pwd from member where id=?";
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {

				String dbPass = rs.getString("pwd");
				if (pass.equals(dbPass)) {
					check = 1;
					System.out.println(check);
				} // 로그인 성공
				else {
					check = 0;
					System.out.println(check);
				} // 비밀번호 오류

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}

		return check;
	}// end LoginCheck

	public String findNickname(String id) {
		String nickname = "";

		try {
			conn = ds.getConnection();
			String SQL = "select nickname from member where id=?";
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				nickname = rs.getString("nickname");

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}

		return nickname;
	}// end LoginCheck

	// 우편번호 탐색 : 동 이름으로 우편번호 탐색
	public Vector<ZipCodeVO> zipcodeRead(String dong) {
		Vector<ZipCodeVO> vecList = new Vector<ZipCodeVO>();
		try {
			conn = ds.getConnection();
			String Query = "select * from zipcode where dong like '" + dong + "%'";
			pstmt = conn.prepareStatement(Query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ZipCodeVO tempZipcode = new ZipCodeVO();
				tempZipcode.setZipcode(rs.getString("zipcode"));
				tempZipcode.setSido(rs.getString("sido"));
				tempZipcode.setGugun(rs.getString("gugun"));
				tempZipcode.setDong(rs.getString("dong"));
				tempZipcode.setRi(rs.getString("ri"));
				tempZipcode.setBunji(rs.getString("bunji"));

				vecList.addElement(tempZipcode);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e2) {

				}

			if (pstmt != null)
				try {
					rs.close();
				} catch (Exception e2) {

				}

			if (conn != null)
				try {
					rs.close();
				} catch (Exception e2) {

				}
		}
		return vecList;

	}// zipcodeRead end

	public MemberVO findId(String name, String phone) {
		MemberVO vo = null;

		try {
			conn = ds.getConnection();

			String sql = "select id from member where name=? and phone=?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, name);
			pstmt.setString(2, phone);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new MemberVO();
				vo.setId(rs.getString("id"));

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeDB();
		}

		return vo;

	}// end findID

	public MemberVO findPwd(String id, String phone) {
		MemberVO vo = null;

		try {
			conn = ds.getConnection();

			String sql = "select pwd from member where id=? and phone=?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, id);
			pstmt.setString(2, phone);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new MemberVO();
				vo.setPwd(rs.getString("pwd"));

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeDB();
		}

		return vo;

	}// end findPWD

	public MemberVO MemberInfo(String id) {
		MemberVO vo = null;

		try {
			conn = ds.getConnection();

			String sql = "select * from member where id=? ";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, id);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new MemberVO();
				vo.setName(rs.getString("name"));
				vo.setNickname(rs.getString("nickname"));

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeDB();
		}

		return vo;

	}// end findPWD

	public int find_Coupon_user(String coupon_name) {
		int result = 0;// 기본
		try {
			conn = ds.getConnection();

			String sql = "select coupon_name from user_coupon where coupon_name=?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, coupon_name);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = 1;// 성공-중복이란뜻

			} else if (!rs.next()) {

				result = 0;// 실패
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeDB();
		}

		return result;

	}

	// 판매자가 등록한 쿠폰 찾기
	public int find_Coupon(String coupon_name) {
		int result = 0;// 기본
		try {
			conn = ds.getConnection();

			String sql = "select coupon_name from coupon where coupon_name=?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, coupon_name);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = 1;// 성공

			} else if (!rs.next()) {

				result = 0;// 실패
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeDB();
		}

		return result;

	}

	// 쿠폰 등록하기
	public void addCoupon(String id, String coupon_name) {

		try {
			conn = ds.getConnection();

			String sql = "insert into user_coupon values(?,?) ";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, id);
			pstmt.setString(2, coupon_name);
			pstmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeDB();
		}

	}// end addCoupon

	// 쿠폰 리스트 가져오기
	public ArrayList<CouponVO> getCoupon(String id) {// namecard table에 있는 모든 레코드를 넘겨줌
		ArrayList<CouponVO> botari = new ArrayList<CouponVO>();

		String SQL = "SELECT * FROM coupon c, user_coupon u WHERE c.COUPON_Name = u.COUPON_Name AND cus_id=?";
		CouponVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new CouponVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비

				vo.setCoupon_name(rs.getString("coupon_name"));
				vo.setStartdate(rs.getTimestamp("start_date"));
				vo.setEnddate(rs.getTimestamp("end_date"));
				vo.setDiscount(rs.getInt("discount"));

				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;
	}// end select OOTD;

	
}
