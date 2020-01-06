package Product;

public class ProductVO {
	private int product_num;
	private String product_name;
	private String size;
	private String color;
	private int price;

	private String product_img;
	private String product_detail_img;
	private int proudct_hit;
	private int proudct_amount;
	private String product_seller;
	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getProduct_num() {
		return product_num;
	}

	public void setProduct_num(int product_num) {
		this.product_num = product_num;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProduct_img() {
		return product_img;
	}

	public void setProduct_img(String product_img) {
		this.product_img = product_img;
	}

	public String getProduct_detail_img() {
		return product_detail_img;
	}

	public void setProduct_detail_img(String product_detail_img) {
		this.product_detail_img = product_detail_img;
	}

	public int getProudct_hit() {
		return proudct_hit;
	}

	public void setProudct_hit(int proudct_hit) {
		this.proudct_hit = proudct_hit;
	}

	public int getProudct_amount() {
		return proudct_amount;
	}

	public void setProudct_amount(int proudct_amount) {
		this.proudct_amount = proudct_amount;
	}

	public String getProduct_seller() {
		return product_seller;
	}

	public void setProduct_seller(String product_seller) {
		this.product_seller = product_seller;
	}

}
