
public class LibraryInterfaceDemo {
	
	
	public static void main (String [] args) {
		
		KidUsers kids = new KidUsers();
		kids.setAge(10);
		System.out.println(kids.registerAccount());
		kids.setBookType("kids");
		System.out.println(kids.registerBook());
		kids.setAge(18);
		System.out.println(kids.registerAccount());
		kids.setBookType("fiction");
		System.out.println(kids.registerBook());
		
		AdultUser adult = new AdultUser();
		adult.setAge(5);
		System.out.println(adult.registerAccount());
		adult.setBookType("kids");
		System.out.println(adult.registerBook());
		adult.setAge(23);
		System.out.println(adult.registerAccount());
		adult.setBookType("fiction");
		System.out.println(adult.registerBook());
		
		
	}

}
