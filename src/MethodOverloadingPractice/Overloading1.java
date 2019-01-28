package MethodOverloadingPractice;

public class Overloading1 {

	public static void main(String[] args) {
		Overloading1 a = new Overloading1();
		a.run();
		a.run(45);
		a.run(19, 20);

	}

	public void run() {
		System.out.println("Sakib score: 50");
	}

	public void run(int score) {
		System.out.println("musfiq score : " + score);
	}

	public void run(int age, int age1) {
		System.out.println("age limit to enter into the team: " + age);
		System.out.println("player should be excluded from team if age is: " + age1);
	}
}
