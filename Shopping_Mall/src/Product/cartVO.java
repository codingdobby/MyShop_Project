package Product;

public class cartVO {
	private int cart_id;
	private String cus_id;
	private int product_num;
	private int amount;
	private int pro_price;
	
	public int total_price;
	public int total_amount;
	
	public int getPro_price() {
		return pro_price;
	}

	public void setPro_price(int pro_price) {
		this.pro_price = pro_price;
	}

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public String getCus_id() {
		return cus_id;
	}

	public void setCus_id(String cus_id) {
		this.cus_id = cus_id;
	}

	public int getProduct_num() {
		return product_num;
	}

	public void setProduct_num(int product_num) {
		this.product_num = product_num;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	
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

	public int getTotal_price() {
		return total_price;
	}

	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}

	public int getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(int total_amount) {
		this.total_amount = total_amount;
	}

	
	
}
