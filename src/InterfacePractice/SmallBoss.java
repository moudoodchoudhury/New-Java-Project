package InterfacePractice;

public class SmallBoss implements Bigboss1,BigBoss2{
	
	
	
	public void eligibleage(){
		System.out.println("age must be 35");
	}
	
	@Override
	public void eligibility() {
		System.out.println("Age must child 25");
		
		
	}

}
