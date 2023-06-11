package string;

public class ImmutableString {

	public static void main(String[] args) {
	
		String s = "JAVA";
		
		System.out.println("The Original String is + " + s);
		
		System.out.println("##############################");
		
		System.out.println(s.concat("SELENIUM")); //JAVASELENIUM
		
		System.out.println(s);
		
		s = s.concat(s.concat("SELENIUM"));
		System.out.println(s);
		
	}

}
