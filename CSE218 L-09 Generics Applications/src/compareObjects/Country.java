package compareObjects;

public class Country implements Comparable<Country>{
	private String name;
	private Double area;

	public Country(String name, Double area) {
		super();
		this.name = name;
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", area=" + area + "]";
	}

	@Override
	public int compareTo(Country o) {
		return area.compareTo(o.area);
	}

}
