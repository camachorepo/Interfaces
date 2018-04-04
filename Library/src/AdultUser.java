
public class AdultUser implements LibraryUser{

	int age; 
	String bookType;
	@Override
	public String registerAccount() {
		String message = " ";
		if(age > 12) message = "You have successfully registered under an Adult Account";
		else  message = "Sorry, Age must be greater than 12 to register as an adult";
		
		return message;
	}

	@Override
	public String registerBook() {
		String message = " ";
		if(bookType.toLowerCase().equals("fiction")) message = "Book Issued successfully, please return the book within 7 days";
		else message = "Oops, you are allowed to take only adult Fiction books"; 
		
		return message;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

}
