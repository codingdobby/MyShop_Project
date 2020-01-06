package Board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import Product.ProductVO;

public class BoardDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	DataSource ds;

	public BoardDAO() {
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

	public void inesertOOTD(String title, String writer, String content, String image1, String image2, String image3) {
		String SQL = "insert into OOTD(writer, title,content,image1, image2, image3) values(?,?,?,?,?,?)";

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, writer);
			pstmt.setString(2, title);
			pstmt.setString(3, content);
			pstmt.setString(4, image1);
			pstmt.setString(5, image2);
			pstmt.setString(6, image3);
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();

	}// end insertOOTD

	public ArrayList<BoardVO> getOOTD() {// namecard table에 있는 모든 레코드를 넘겨줌
		ArrayList<BoardVO> botari = new ArrayList<BoardVO>();

		String SQL = "SELECT * from OOTD";
		BoardVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);

			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new BoardVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setTITLE(rs.getString("title"));
				vo.setWRITER(rs.getString("writer"));
				vo.setCONTENT(rs.getString("content"));
				vo.setImage1(rs.getString("image1"));
				vo.setImage2(rs.getString("image2"));
				vo.setImage3(rs.getString("image3"));

				vo.setNUM(rs.getInt("ootd_num"));
				vo.setREADCOUNT(rs.getInt("readcount"));

				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;
	}// end select OOTD;

	// 상품 상세 정보 들어갈때마다 조회수 +1
	public void UpdateHit(String num) {
		String SQL = "update  OOTD set readcount=readcount+1 where ootd_num=?";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, num);
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();

	}// end UpdateHit()

	public ArrayList<BoardVO> getOOTDDetail(String num) {// namecard table에 있는 모든 레코드를 넘겨줌
		ArrayList<BoardVO> botari = new ArrayList<BoardVO>();

		String SQL = "SELECT * from OOTD where ootd_num=?";
		BoardVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, num);
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new BoardVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setTITLE(rs.getString("title"));
				vo.setWRITER(rs.getString("writer"));
				vo.setREGDATE(rs.getTimestamp("regdate"));

				vo.setCONTENT(rs.getString("content"));
				vo.setImage1(rs.getString("image1"));
				vo.setImage2(rs.getString("image2"));
				vo.setImage3(rs.getString("image3"));

				vo.setNUM(rs.getInt("ootd_num"));
				vo.setREADCOUNT(rs.getInt("readcount"));

				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;
	}// end select OOTD;

	// Bestdresser 값 가져오기
	public ArrayList<BoardVO> getBestDresser() {// namecard table에 있는 모든 레코드를 넘겨줌
		ArrayList<BoardVO> botari = new ArrayList<BoardVO>();

		String SQL = "SELECT * FROM ootd WHERE regdate BETWEEN DATE_ADD(NOW(),INTERVAL -1 Month ) AND NOW() ORDER BY readcount DESC LIMIT 1";
		BoardVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);

			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new BoardVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setTITLE(rs.getString("title"));
				vo.setWRITER(rs.getString("writer"));
				vo.setREGDATE(rs.getTimestamp("regdate"));
				vo.setCONTENT(rs.getString("content"));
				vo.setImage1(rs.getString("image1"));
				vo.setImage2(rs.getString("image2"));
				vo.setImage3(rs.getString("image3"));

				vo.setNUM(rs.getInt("ootd_num"));
				vo.setREADCOUNT(rs.getInt("readcount"));

				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;
	}// end select OOTD;

	public void insertNotice(String title, String writer, String content) {
		String SQL = "insert into board(board_writer, title,content) values(?,?,?)";

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, writer);
			pstmt.setString(2, title);
			pstmt.setString(3, content);
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();

	}

	public ArrayList<BoardVO> getIlsang() {// namecard table에 있는 모든 레코드를 넘겨줌
		ArrayList<BoardVO> botari = new ArrayList<BoardVO>();

		String SQL = "SELECT * FROM board b, member m WHERE m.id = b.board_WRITER ";
		BoardVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
	
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new BoardVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비

				vo.setTITLE(rs.getString("title"));
				vo.setWRITER(rs.getString("nickname"));
				vo.setCONTENT(rs.getString("content"));
				vo.setImage1(rs.getString("image1"));
				vo.setREGDATE(rs.getTimestamp("regdate"));
				vo.setNUM(rs.getInt("board_num"));
				vo.setREADCOUNT(rs.getInt("readcount"));

				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;
	}// end select OOTD;
	
	
	public ArrayList<BoardVO> getIlsangContent(String num) {// namecard table에 있는 모든 레코드를 넘겨줌
		ArrayList<BoardVO> botari = new ArrayList<BoardVO>();

		String SQL = "SELECT * FROM board b, member m WHERE m.id = b.board_WRITER and b.board_num =?";
		BoardVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, num);
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new BoardVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비

				vo.setTITLE(rs.getString("title"));
				vo.setWRITER(rs.getString("nickname"));
				vo.setCONTENT(rs.getString("content"));
				vo.setImage1(rs.getString("image1"));
				vo.setREGDATE(rs.getTimestamp("regdate"));
				vo.setNUM(rs.getInt("board_num"));
				vo.setREADCOUNT(rs.getInt("readcount"));

				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;
	}// end select OOTD;
}
