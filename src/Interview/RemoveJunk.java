package Interview;

public class RemoveJunk {

	public static void main(String[] args) {
		
		//Regular Expression = [^a-zA-Z0-9]
		
		String s = "&$#*@ HelloUSA Trump";
		
		String s1 = "Selen#@iumTestingImpotant*7^5$22";
		
		String s2="@@##^hi";
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		
		s2=s2.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(s2);
		
		
		

	}

}
