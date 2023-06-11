package inheritance;

public class User {

	
	
	
	public static void main(String[] args) {
		
		Telephone tele = new Telephone();
		tele.calling();
		
		System.out.println("#########################");
		
		Mobile mob = new Mobile();
		mob.calling();
		mob.texting();
		
		System.out.println("#########################");
		
		Smartphone smrph = new Smartphone();
		smrph.calling();
		smrph.texting();
		smrph.internet();
		
		
	}

}
