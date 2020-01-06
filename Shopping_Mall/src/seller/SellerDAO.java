package seller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import member.MemberVO;

public class SellerDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	DataSource ds;

	public SellerDAO() {
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

	public int insertInfo(String seller_id, String company_name, String pwd, String phone, String email) {
		int result = 0;
		try {
			conn = ds.getConnection();
			String sql = "insert into seller(seller_id,seller_company,  pwd,  phone, email) values(?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, seller_id);
			pstmt.setString(2, company_name);
			pstmt.setString(3, pwd);
			pstmt.setString(4, phone);
			pstmt.setString(5, email);

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

	// Login Function

	public int LoginCheck(String id, String pass) {
		System.out.println("seller 로그인 실패  ");
		int check = -1;// 아이디 없음
		try {
			conn = ds.getConnection();
			String SQL = "select pwd from seller where seller_id=?";
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {

				String dbPass = rs.getString("pwd");
				if (pass.equals(dbPass)) {
					check = 1;
					System.out.println("seller 로그인 성공 : " + check);
				} // 로그인 성공
				else {
					check = 0;
					System.out.println("seller 로그인 실패 : " + check);
				} // 비밀번호 오류

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}

		return check;
	}// end getVerify

	public String getVerify(String id) {
		String result = "";
		try {
			conn = ds.getConnection();
			String SQL = "select verify from seller where seller_id=?";
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				result = rs.getString("verify");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}

		return result;
	}// end LoginCheck

	public void insertForm(FormVO vo) {
		System.out.println("브랜드 사이트" + vo.getBrand_site());
		System.out.println("담당자 이름" + vo.getName());
		System.out.println("담당자 전화" + vo.getTel());
		System.out.println("담당자 이메일" + vo.getEmail());
		System.out.println("카테고리" + vo.getCategory());
		System.out.println("판매자 아이디" + vo.getSeller_id_fk());

		try {
			conn = ds.getConnection();
			String SQL = "insert into seller_form(brand_site, name, tel, email, category, seller_id_fk) values(?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, vo.getBrand_site());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getTel());
			pstmt.setString(4, vo.getEmail());
			pstmt.setString(5, vo.getCategory());
			pstmt.setString(6, vo.getSeller_id_fk());
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}

	}// end insertForm

	public ArrayList<FormVO> getBrandForm(String brandName) {
		ArrayList<FormVO> botari = new ArrayList<FormVO>();

		String SQL = "SELECT sf.* FROM seller_form sf, seller s  " + 
				"WHERE sf.SELLER_ID_FK = s.SELLER_ID  " + 
				"AND s.SELLER_COMPANY=?";
		FormVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, brandName);
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new FormVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setBrand_site(rs.getString("brand_site"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				vo.setTel(rs.getString("tel"));
				vo.setCategory(rs.getString("category"));
				vo.setSeller_id_fk(rs.getString("SELLER_ID_FK"));

				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;
	}//end getBrandForm
	
	//메인 헤더 브랜드 이름 가져오기
	public ArrayList<SellerVO> getBrand() {
		ArrayList<SellerVO> botari = new ArrayList<SellerVO>();

		String SQL = "SELECT seller_company FROM seller WHERE verify='o';";
		SellerVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new SellerVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setSeller_company(rs.getString("seller_company"));
				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;
	}
}
