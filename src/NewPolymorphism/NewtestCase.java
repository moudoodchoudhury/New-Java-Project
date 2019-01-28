package NewPolymorphism;

public class NewtestCase {

	public static void main(String[] args) {
		College a = new College();
		a.collegegraduate();
		a.freshers();
		a.midgraduate();
		a.senior();

		School b = new School();
		b.freshers();
		b.midgraduate();
		
		School c =new College();
		c.freshers();
		c.midgraduate();
		

	}

}
