package my.list.task.food;

import java.util.Objects;

//- 음식 종류(한식, 중식, 일식, 양식)
public class Type {
	private String koreaFood;
	private String chinaFood;
	private String japenFood;
	private String westernFood;
	
	public Type() {;}

	public Type(String koreaFood, String chinaFood, String japenFood, String westernFood) {
		super();
		this.koreaFood = koreaFood;
		this.chinaFood = chinaFood;
		this.japenFood = japenFood;
		this.westernFood = westernFood;
	}

	public String getKoreaFprivate() {
		return koreaFood;
	}

	public void setKoreaFprivate(String koreaFood) {
		this.koreaFood = koreaFood;
	}

	public String getChinaFood() {
		return chinaFood;
	}

	public void setChinaFood(String chinaFood) {
		this.chinaFood = chinaFood;
	}

	public String getJapenFood() {
		return japenFood;
	}

	public void setJapenFood(String japenFood) {
		this.japenFood = japenFood;
	}

	public String getWesternFood() {
		return westernFood;
	}

	public void setWesternFood(String westernFood) {
		this.westernFood = westernFood;
	}

	@Override
	public String toString() {
		return "Type [koreaFood=" + koreaFood + ", chinaFood=" + chinaFood + ", japenFood=" + japenFood
				+ ", westernFood=" + westernFood + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(chinaFood, japenFood, koreaFood, westernFood);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Type other = (Type) obj;
		return chinaFood.equals(other.chinaFood) && japenFood.equals(other.japenFood)
				&& koreaFood.equals(other.koreaFood) &&westernFood.equals(other.westernFood);
	}
	
	
	
	
}
