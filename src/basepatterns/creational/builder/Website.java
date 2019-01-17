package basepatterns.creational.builder;

public class Website {
	private String name;
	private Cms cms;
	private int price;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Cms getCms() {
		return cms;
	}
	public void setCms(Cms cms) {
		this.cms = cms;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Website [name=");
		builder.append(name);
		builder.append(", cms=");
		builder.append(cms);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
}