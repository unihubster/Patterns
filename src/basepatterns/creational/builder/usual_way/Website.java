package basepatterns.creational.builder.usual_way;

public class Website {
	private String name;
	private String cms;
	private int price;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCms(String cms) {
		this.cms = cms;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCms() {
		return cms;
	}
	
	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Website [");
		if (name != null) {
			builder.append("name=");
			builder.append(name);
			builder.append(", ");
		}
		if (cms != null) {
			builder.append("cms=");
			builder.append(cms);
			builder.append(", ");
		}
		builder.append("price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
}
