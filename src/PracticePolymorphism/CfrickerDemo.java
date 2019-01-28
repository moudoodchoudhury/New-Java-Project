package PracticePolymorphism;

public class CfrickerDemo {

	public static void main(String[] args) {
		BowlerDemo jj = new BowlerDemo();

		jj.bowler();
		jj.pacer();
		jj.score();
		jj.score1();

		System.out.println("-------------------");
		RunDemo yy = new RunDemo();
		yy.score();
		yy.score1();

		System.out.println("---------------");
		RunDemo zz = new BowlerDemo();
		zz.score();
		zz.score1();

		
		
	}

}
