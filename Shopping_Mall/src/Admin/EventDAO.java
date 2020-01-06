package Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import Product.ProductVO;

public class EventDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	DataSource ds;

	public EventDAO() {
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

	public void insertEvent(String EVENT_title, String event_content, String event_content_img, String start_term,
			String END_date) {
		String SQL = "insert into event_table(event_title, event_content_img, start_date, end_date) values(?,?,?,?)";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, EVENT_title);
			pstmt.setString(2, event_content_img);
			pstmt.setString(3, start_term);
			pstmt.setString(4, END_date);
			
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();

	}
	
	
	public void updateEvent(String EVENT_title, String event_content, String event_content_img, String start_term,
			String END_date, String num) {
		String SQL = "update event_table set event_title=? , start_date = ?, end_date=? , event_content_img=? where event_num=? ";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, EVENT_title);
			pstmt.setString(2, start_term);
			pstmt.setString(3, END_date);
			pstmt.setString(4, event_content_img);
			pstmt.setString(5, num);
			
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();

	}
	
	
	public ArrayList<EventVO> getAllEvent() {// namecard table에 있는 모든 레코드를 넘겨줌
		ArrayList<EventVO> botari = new ArrayList<EventVO>();

		String SQL = "SELECT * FROM EVENT_table WHERE END_date >SYSDATE() ";
		EventVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
	
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				
				vo = new EventVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setEvent_num(rs.getInt("event_num"));
				vo.setEvent_title(rs.getString("event_title"));
				vo.setEvent_content(rs.getString("event_content"));
				vo.setEvent_content_img(rs.getString("event_content_img"));
				vo.setStart_date(rs.getDate("start_date"));
				vo.setEnd_date(rs.getDate("end_date"));
				
		

				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;
	}

	public int getEventCount() {
		int x = 0;
		try {
			conn = ds.getConnection();
			String sql = "select count(*) from event_table WHERE END_date >SYSDATE() ";
			pstmt = conn.prepareStatement(sql);
			
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

	public ArrayList<EventVO> getEventDetail(String num) {// namecard table에 있는 모든 레코드를 넘겨줌
		ArrayList<EventVO> botari = new ArrayList<EventVO>();

		String SQL = "SELECT * from event_table where event_num=?";
		EventVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, num);
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				
				vo = new EventVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setEvent_num(rs.getInt("event_num"));
				vo.setEvent_title(rs.getString("event_title"));
				vo.setEvent_content(rs.getString("event_content"));
				vo.setEvent_content_img(rs.getString("event_content_img"));
				vo.setStart_date(rs.getDate("start_date"));
				vo.setEnd_date(rs.getDate("end_date"));
				vo.setRegdate(rs.getDate("regdate"));
				vo.setReadcount(rs.getInt("readcount"));
		

				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;
	}//end getEventDetail
	
	
	// 상품 상세 정보 들어갈때마다 조회수 +1
		public void UpdateHit(String num) {
			String SQL = "update  event_table set readcount=readcount+1 where event_num=?";
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
		
		
		//지난 이벤트 불러오기
		
		public ArrayList<EventVO> getEndEvent() {// namecard table에 있는 모든 레코드를 넘겨줌
			ArrayList<EventVO> botari = new ArrayList<EventVO>();

			String SQL = "SELECT * FROM EVENT_table WHERE END_date <SYSDATE()";
			EventVO vo = null;

			try {
				conn = ds.getConnection();
				pstmt = conn.prepareStatement(SQL);
				
				rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

				// rs 테이블의 모든 레코드를 botari에 담는다
				while (rs.next() == true) {
					
					vo = new EventVO();
					// 1개의 레코드를 담을 빈그릇(vo)을 준비
					vo.setEvent_num(rs.getInt("event_num"));
					vo.setEvent_title(rs.getString("event_title"));
					vo.setEvent_content(rs.getString("event_content"));
					vo.setEvent_content_img(rs.getString("event_content_img"));
					vo.setStart_date(rs.getDate("start_date"));
					vo.setEnd_date(rs.getDate("end_date"));
					vo.setRegdate(rs.getDate("regdate"));
					vo.setReadcount(rs.getInt("readcount"));
			

					botari.add(vo);

				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

			closeDB();
			return botari;
		}//end getEventDetail

		//이벤트 당첨자 등록
		public void EnterResult(String title, String content) {
			
			String SQL = "update  event_table set event_content=? where event_title=?";
			try {
				conn = ds.getConnection();
				pstmt = conn.prepareStatement(SQL);
				pstmt.setString(1, content);
				pstmt.setString(2, title);
				rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음
			}

			catch (SQLException e) {
				e.printStackTrace();
			}

			closeDB();

		}// end UpdateHit()
		
		
		//이벤트 삭제
		public void DeleteEvent(String num) {
			
			String SQL = "delete from event_table where event_num=?";
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
		
}
