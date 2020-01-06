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

public class ProductDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	DataSource ds;

	public ProductDAO() {
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

	// 상품 등록
	/*********************************************/
	public void insertProduct(String product_name, String size, String color, int price, String product_img,
			String product_detail_img, int product_amount, String product_seller, String category) {

		try {
			conn = ds.getConnection();
			String sql = "insert into product( product_name, size, color, price, product_img"
					+ ", product_detail_img, product_amount, product_seller,category) VALUES(?,?,?,?,?,?,?,?,(SELECT cateCode FROM category WHERE cateName=?))";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, product_name);
			pstmt.setString(2, size);
			pstmt.setString(3, color);
			pstmt.setInt(4, price);
			pstmt.setString(5, product_img);
			pstmt.setString(6, product_detail_img);
			pstmt.setInt(7, product_amount);
			pstmt.setString(8, product_seller);
			pstmt.setString(9, category);
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}

	}// end insertProduct

	public ArrayList<ProductVO> getAllProduct(String seller_id) {// namecard table에 있는 모든 레코드를 넘겨줌
		ArrayList<ProductVO> botari = new ArrayList<ProductVO>();

		String SQL = "SELECT p.*, c.cateName FROM category c, product p WHERE p.category = c.cateCode and product_seller=?";
		ProductVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, seller_id);
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new ProductVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setProduct_num(rs.getInt("product_num"));
				vo.setProduct_img(rs.getString("product_img"));
				vo.setProduct_name(rs.getString("product_name"));
				vo.setPrice(rs.getInt("price"));
				vo.setSize(rs.getString("size"));
				vo.setColor(rs.getString("color"));
				vo.setCategory(rs.getString("cateName"));
				vo.setProudct_hit(rs.getInt("PRODUCT_HIT"));

				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;
	}

	public int getProductCount(String seller_id) {
		int x = 0;
		try {
			conn = ds.getConnection();
			String sql = "select count(*) from product where product_seller=?";
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

	
	public ArrayList<categoryVO> getUpCategory() {
		ArrayList<categoryVO> botari = new ArrayList<categoryVO>();

		String SQL = "select * from category where cateCodeRef is null";
		categoryVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);

			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new categoryVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setCateName(rs.getString("cateName"));
				vo.setCateCode(rs.getString("cateCode"));

				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;

	}// end GetUpCategory
	
	
	
	public ArrayList<categoryVO> getAddCategory() {
		ArrayList<categoryVO> botari = new ArrayList<categoryVO>();

		String SQL = "select * from category where cateCodeRef is not null";
		categoryVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);

			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new categoryVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setCateName(rs.getString("cateName"));
				vo.setCateCode(rs.getString("cateCode"));

				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;

	}// end GetUpCategory

	/// 기획전 카테고리 가져오기
	public ArrayList<categoryVO> getPlanCategory() {
		ArrayList<categoryVO> botari = new ArrayList<categoryVO>();

		String SQL = "select * from category where cateCodeRef=1";
		categoryVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);

			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new categoryVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setCateName(rs.getString("cateName"));
				vo.setCateCode(rs.getString("cateCode"));

				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;

	}// end GetPlanCategory

	public ArrayList<ProductVO> getPlan(String cateCode) {// namecard table에 있는 모든 레코드를 넘겨줌
		ArrayList<ProductVO> botari = new ArrayList<ProductVO>();
		String SQL = "";
		
		if (cateCode.equals("all")) {
			SQL = "SELECT p.* FROM category c, product p WHERE c.cateCode = p.category AND c.cateCodeRef=1 order by category";
			ProductVO vo = null;

			try {
				conn = ds.getConnection();
				pstmt = conn.prepareStatement(SQL);
				
				rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

				// rs 테이블의 모든 레코드를 botari에 담는다
				while (rs.next() == true) {
					vo = new ProductVO();
					// 1개의 레코드를 담을 빈그릇(vo)을 준비
					vo.setProduct_num(rs.getInt("product_num"));
					vo.setProduct_img(rs.getString("product_img"));
					vo.setProduct_name(rs.getString("product_name"));
					vo.setPrice(rs.getInt("price"));
					vo.setSize(rs.getString("size"));
					vo.setColor(rs.getString("color"));
					vo.setCategory(rs.getString("category"));
					vo.setProudct_hit(rs.getInt("PRODUCT_HIT"));

					botari.add(vo);

				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

			closeDB();
			
			

		} else {

			SQL = "SELECT * FROM product WHERE category = ? order by category";
			ProductVO vo = null;

			try {
				conn = ds.getConnection();
				pstmt = conn.prepareStatement(SQL);
			
				pstmt.setString(1, cateCode);
				rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

				// rs 테이블의 모든 레코드를 botari에 담는다
				while (rs.next() == true) {
					vo = new ProductVO();
					// 1개의 레코드를 담을 빈그릇(vo)을 준비
					vo.setProduct_num(rs.getInt("product_num"));
					vo.setProduct_img(rs.getString("product_img"));
					vo.setProduct_name(rs.getString("product_name"));
					vo.setPrice(rs.getInt("price"));
					vo.setSize(rs.getString("size"));
					vo.setColor(rs.getString("color"));
					vo.setCategory(rs.getString("category"));
					vo.setProudct_hit(rs.getInt("PRODUCT_HIT"));

					botari.add(vo);

				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

			closeDB();
		}
		
		return botari;
	}// end 기획전

	public int getProductListCount(String type) {
		int x = 0;
		try {
			conn = ds.getConnection();
			String sql = "SELECT count(*) FROM product p, category c WHERE p.category = c.cateCode AND c.cateCodeRef = (SELECT cateCode FROM category WHERE cateName=?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, type);
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

	public ArrayList<ProductVO> getProductList(String type) {
		ArrayList<ProductVO> botari = new ArrayList<ProductVO>();

		String SQL = "SELECT p.*,c.* FROM product p, category c WHERE p.category = c.cateCode AND c.cateCodeRef = (SELECT cateCode FROM category WHERE cateName=?)";
		ProductVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, type);
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new ProductVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setProduct_num(rs.getInt("product_num"));
				vo.setProduct_img(rs.getString("product_img"));
				vo.setProduct_name(rs.getString("product_name"));
				vo.setPrice(rs.getInt("price"));
				vo.setSize(rs.getString("size"));
				vo.setColor(rs.getString("color"));
				vo.setCategory(rs.getString("category"));
				vo.setProudct_hit(rs.getInt("PRODUCT_HIT"));

				botari.add(vo);

			}

			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;
	}// end

	// 상품 상세 정보 불러오기
	public ArrayList<ProductVO> getProductDetail(String num) {// namecard table에 있는 모든 레코드를 넘겨줌
		ArrayList<ProductVO> botari = new ArrayList<ProductVO>();

		String SQL = "SELECT * FROM product WHERE product_num=?";
		ProductVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, num);
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new ProductVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setProduct_num(rs.getInt("product_num"));
				vo.setProduct_img(rs.getString("product_img"));
				vo.setProduct_detail_img(rs.getString("product_detail_img"));
				vo.setProduct_name(rs.getString("product_name"));
				vo.setPrice(rs.getInt("price"));
				vo.setSize(rs.getString("size"));
				vo.setColor(rs.getString("color"));
				vo.setCategory(rs.getString("category"));
				vo.setProudct_hit(rs.getInt("PRODUCT_HIT"));

				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;
	}

	// 조회수 많은 순서대로 3개
	public ArrayList<ProductVO> getHitProduct() {// namecard table에 있는 모든 레코드를 넘겨줌
		ArrayList<ProductVO> botari = new ArrayList<ProductVO>();

		String SQL = "SELECT * FROM product  order by product_hit desc limit 3";
		ProductVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new ProductVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setProduct_num(rs.getInt("product_num"));
				vo.setProduct_img(rs.getString("product_img"));
				vo.setProduct_detail_img(rs.getString("product_detail_img"));
				vo.setProduct_name(rs.getString("product_name"));
				vo.setPrice(rs.getInt("price"));
				vo.setSize(rs.getString("size"));
				vo.setColor(rs.getString("color"));
				vo.setCategory(rs.getString("category"));
				vo.setProudct_hit(rs.getInt("PRODUCT_HIT"));

				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;
	}// end gethitProduct

	// 상품 상세 정보 들어갈때마다 조회수 +1
	public void UpdateHit(String num) {
		String SQL = "update  product set product_hit=PRODUCT_HIT+1 where product_num=?";
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

	// 조회수 많은 순서대로 3개
	public ArrayList<ProductVO> getNewProduct() {// namecard table에 있는 모든 레코드를 넘겨줌
		ArrayList<ProductVO> botari = new ArrayList<ProductVO>();

		String SQL = "SELECT * FROM product  order by regdate desc limit 3";
		ProductVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new ProductVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setProduct_num(rs.getInt("product_num"));
				vo.setProduct_img(rs.getString("product_img"));
				vo.setProduct_detail_img(rs.getString("product_detail_img"));
				vo.setProduct_name(rs.getString("product_name"));
				vo.setPrice(rs.getInt("price"));
				vo.setSize(rs.getString("size"));
				vo.setColor(rs.getString("color"));
				vo.setCategory(rs.getString("category"));
				vo.setProudct_hit(rs.getInt("PRODUCT_HIT"));

				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;
	}// end gethitProduct

	
	//brand product
		public int getBrandCount(String brand) {
			int x = 0;
			try {
				conn = ds.getConnection();
				String sql = "select count(*) from product  WHERE product_seller= (SELECT seller_id FROM seller WHERE seller_company=?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, brand);
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
	
	
	public ArrayList<ProductVO> getBrandProduct(String brand) {// namecard table에 있는 모든 레코드를 넘겨줌
		ArrayList<ProductVO> botari = new ArrayList<ProductVO>();

		String SQL = "SELECT * FROM product  WHERE product_seller= (SELECT seller_id FROM seller WHERE seller_company=?)";
		ProductVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, brand);
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new ProductVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setProduct_num(rs.getInt("product_num"));
				vo.setProduct_img(rs.getString("product_img"));
				vo.setProduct_detail_img(rs.getString("product_detail_img"));
				vo.setProduct_name(rs.getString("product_name"));
				vo.setPrice(rs.getInt("price"));
				vo.setSize(rs.getString("size"));
				vo.setColor(rs.getString("color"));
				vo.setCategory(rs.getString("category"));
				vo.setProudct_hit(rs.getInt("PRODUCT_HIT"));

				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;
	}// end gethitProduct
	
	
	public ArrayList<categoryVO> getProdcut_cate_list(String type) {
		ArrayList<categoryVO> botari = new ArrayList<categoryVO>();

		String SQL = "select * from category where cateCodeRef in (SELECT cateCode FROM  category where cateName =?)";
		categoryVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, type);
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new categoryVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setCateName(rs.getString("cateName"));
				vo.setCateCode(rs.getString("cateCode"));

				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;

	}// end GetUpCategory
	
	
	
	
	public ArrayList<ProductVO> getDownProductList(String type) {
		ArrayList<ProductVO> botari = new ArrayList<ProductVO>();

		String SQL = "SELECT * FROM product WHERE category = ?";
		ProductVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, type);
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new ProductVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setProduct_num(rs.getInt("product_num"));
				vo.setProduct_img(rs.getString("product_img"));
				vo.setProduct_name(rs.getString("product_name"));
				vo.setPrice(rs.getInt("price"));
				vo.setSize(rs.getString("size"));
				vo.setColor(rs.getString("color"));
				vo.setCategory(rs.getString("category"));
				vo.setProudct_hit(rs.getInt("PRODUCT_HIT"));

				botari.add(vo);

			}

			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;
	}// end getDownProductList
	
	//salePRice 
	
	public ArrayList<ProductVO> getSalePrice() {
		ArrayList<ProductVO> botari = new ArrayList<ProductVO>();

		String SQL = "SELECT * FROM product WHERE sale_price IS NOT NULL";
		ProductVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new ProductVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setProduct_num(rs.getInt("product_num"));
				vo.setProduct_img(rs.getString("product_img"));
				vo.setProduct_name(rs.getString("product_name"));
				vo.setPrice(rs.getInt("price"));
				vo.setSize(rs.getString("size"));
				vo.setColor(rs.getString("color"));
				vo.setCategory(rs.getString("category"));
				vo.setProudct_hit(rs.getInt("PRODUCT_HIT"));

				botari.add(vo);

			}

			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;
	}// end getSalePRice
	
	public int getSaleCount() {
		int x = 0;
		try {
			conn = ds.getConnection();
			String sql = "select count(*) from product WHERE sale_price IS NOT NULL";
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
	
	
	public ArrayList<ProductVO> getRandom() {// namecard table에 있는 모든 레코드를 넘겨줌
		ArrayList<ProductVO> botari = new ArrayList<ProductVO>();

		String SQL = "SELECT * FROM product ORDER BY RAND() LIMIT 3";
		ProductVO vo = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(SQL);
			
			rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

			// rs 테이블의 모든 레코드를 botari에 담는다
			while (rs.next() == true) {
				vo = new ProductVO();
				// 1개의 레코드를 담을 빈그릇(vo)을 준비
				vo.setProduct_num(rs.getInt("product_num"));
				vo.setProduct_img(rs.getString("product_img"));
				vo.setProduct_detail_img(rs.getString("product_detail_img"));
				vo.setProduct_name(rs.getString("product_name"));
				vo.setPrice(rs.getInt("price"));
				vo.setSize(rs.getString("size"));
				vo.setColor(rs.getString("color"));
				vo.setCategory(rs.getString("category"));
				vo.setProudct_hit(rs.getInt("PRODUCT_HIT"));

				botari.add(vo);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDB();
		return botari;
	}// end gethitProduct
	
	// 조회수 많은 순서대로 3개
		public ArrayList<ProductVO> getBestProduct() {// namecard table에 있는 모든 레코드를 넘겨줌

			ArrayList<ProductVO> botari = new ArrayList<ProductVO>();

			String SQL = "SELECT * FROM product  order by product_hit desc limit 30 ";
			ProductVO vo = null;

			try {
				conn = ds.getConnection();
				pstmt = conn.prepareStatement(SQL);
				rs = pstmt.executeQuery(); // select 문 수행 결과가 rs 테이블에 다 담겨져 있음

				// rs 테이블의 모든 레코드를 botari에 담는다
				while (rs.next() == true) {
					vo = new ProductVO();
					// 1개의 레코드를 담을 빈그릇(vo)을 준비
					vo.setProduct_num(rs.getInt("product_num"));
					vo.setProduct_img(rs.getString("product_img"));
					vo.setProduct_detail_img(rs.getString("product_detail_img"));
					vo.setProduct_name(rs.getString("product_name"));
					vo.setPrice(rs.getInt("price"));
					vo.setSize(rs.getString("size"));
					vo.setColor(rs.getString("color"));
					vo.setCategory(rs.getString("category"));
					vo.setProudct_hit(rs.getInt("PRODUCT_HIT"));

					botari.add(vo);

				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

			closeDB();
			return botari;
		}// end gethitProduct

		public int getBestCount() {
			int x = 0;
			try {
				conn = ds.getConnection();
				String sql = "SELECT * FROM product  order by product_hit desc";
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
		

}
