package Board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import member.MemberVO;

public class NoticeDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	DataSource ds;

	public NoticeDAO() {
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

	public void insertNotice(String title, String writer, String content) {
		String SQL = "insert into notice_board(writer, title,content) values(?,?,?)";

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

	public ArrayList<NoticeVO> getNotice() {// namecard table에 있는 모든 레코드를 넘겨줌
		ArrayList<NoticeVO> botari = new ArrayList<NoticeVO>();

		String SQL = "SELECT * from notice_board";
		NoticeVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);

			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new NoticeVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setNum(rs.getInt("num"));
				vo.setTitle(rs.getString("title"));
				vo.setReadcount(rs.getInt("readcount"));
				vo.setContent(rs.getString("content"));
				vo.setRegdate(rs.getTimestamp("regdate"));

				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;
	}// end select OOTD;
	
	
	public ArrayList<NoticeVO> getNoticeDetail(String num) {// namecard table에 있는 모든 레코드를 넘겨줌
		ArrayList<NoticeVO> botari = new ArrayList<NoticeVO>();

		String SQL = "SELECT * from notice_board where num=?";
		NoticeVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, num);
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new NoticeVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setNum(rs.getInt("num"));
				vo.setTitle(rs.getString("title"));
				vo.setReadcount(rs.getInt("readcount"));
				vo.setContent(rs.getString("content"));
				vo.setRegdate(rs.getTimestamp("regdate"));

				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;
	}// end select OOTD;
}
