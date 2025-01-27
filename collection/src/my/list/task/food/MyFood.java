package my.list.task.food;

import java.util.Objects;

//- 음식 이름
//- 음식 가격
//- 음식 종류(한식, 중식, 일식, 양식)
public class MyFood {
	private String name;
	private int price;
	private String type;
	
	public MyFood() {;}
	
	public MyFood(String name, int price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyFood other = (MyFood) obj;
		return name.equals(other.name) && price == other.price && type.equals(other.type);
	}
	
	
}
