import java.util.Scanner;

public class HelloUser {
	
	private String userName;

	public HelloUser(String userName) {
		this.userName = userName;
	}
	
	public HelloUser() {
		this.userName = "";
	}
	
	public void greetUser() {
		System.out.print("Please enter your name: ");
		Scanner reader = new Scanner(System.in);
		userName = reader.nextLine();
		reader.close();
		System.out.println("Hello " + userName + "!");
	}

}
