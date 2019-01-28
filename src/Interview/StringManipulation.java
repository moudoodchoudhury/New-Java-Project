package Interview;

public class StringManipulation {

	public static void main(String[] args) {

		String s = "Moudud bhai your locate at long Island";
		String s1 = "Moudud bhai your locate at Long Island";
		String s2 = "        Moudud Bhai        ";

		System.out.println(s.length());

		System.out.println(s.charAt(7));

		System.out.println(s.indexOf('l')); // 1st Occurrence of l

		System.out.println(s.indexOf('l', 18)); // 2nd Occurrence of l

		System.out.println(s.indexOf('l', s.indexOf('l') + 1)); // 2nd Occurrence of i

		System.out.println(s.indexOf("locate")); // No String available -- return -1

		// String Comparison:
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));

		// Sub-String
		System.out.println(s.substring(17, 23));
		System.out.println(s.substring(27));

		// Trim
		System.out.println(s2.trim());

		// Trim-Replace:
		System.out.println(s2.replace(" ", ""));

		String date = "01-01-2019"; // 01/01/2019
		System.out.println(date.replace("-", "/"));

		// Split:
		String name = "Mr_Moudud_is_now_QA_Engineer";
		String result[] = name.split("_");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

		String s3 = "Care";
		System.out.println(s3.concat("s"));

	}

}
