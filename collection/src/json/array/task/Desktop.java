package json.array.task;

import java.util.Objects;

import org.json.JSONObject;

public class Desktop {
	private int productId;
	private String productName;
	private String brand;
	private int price;
	private int stock;
	
	public Desktop() {;}

	public Desktop(int productId, String productName, String brand, int price, int stock) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.brand = brand;
		this.price = price;
		this.stock = stock;
	}
	
	public Desktop(Desktop other) {
		super();
		this.productId = other.productId;
		this.productName = other.productName;
		this.brand = other.brand;
		this.price = other.price;
		this.stock = other.stock;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Desktop [productId=" + productId + ", productName=" + productName + ", brand=" + brand + ", price="
				+ price + ", stock=" + stock + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(productId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Desktop other = (Desktop) obj;
		return productId == other.productId;
	}
	
	public String toJSONString() {
		return new JSONObject(this).toString();
	}
	
	public JSONObject toJSON() {
		return new JSONObject(this);
	}
	
}
