
public class KidUsers implements LibraryUser{

	int age; 
	String bookType;
	@Override
	public String registerAccount() {
		String message = " ";
		if(age < 12) message = "You've successfully registed a child account";
		else  message = "Sorry, Age must be less than 12 to register as a kid";
		return message;
	}

	@Override
	public String registerBook() {
		String message = " ";
		
		if(bookType.equals("kids")) message = "“Book Issued successfully, please return the book within 10 days";
		else message = "Oops, you are allowed to take only kids books";

		return message;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

}
