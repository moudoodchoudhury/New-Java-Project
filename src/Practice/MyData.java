package Practice;

public class MyData {

	private String Name;

	private String Road;

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getRoad() {
		return Road;
	}

	public void setRoad(String Road) {
		this.Road = Road;
	}

	public static void main(String[] args) {
		MyData o = new MyData();
		o.setName("james");
		o.setRoad("Hudson");

		

		System.out.println("He is " + o.getName());
		System.out.println("this is the "+ o.getRoad());
	}

}
