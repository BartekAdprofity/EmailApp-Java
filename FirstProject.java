package firstProjectJava;
import java.util.Scanner;

public class FirstProject {
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 10;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String com = "department.com";
	
	// Constructor to receive the first name and last name
	public FirstProject() {
		this.firstName = setFirstName();
		this.lastName = setLastName();
		System.out.println("\nFirst Name: " + this.firstName + "\nLast Name: " + this.lastName + "\n\nAccess Granted!\n");
		
		// Call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.println("You chose: " + this.department + " Department \n\nWait please, I'm loading...\n");
		
		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("The password for " + this.department + " Department is: " + this.password);
		
		// Combine elements to generate email
		email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department.toLowerCase() + com;

	}
	// set first name
	private String setFirstName() {
		System.out.println("Provide your first name: ");
		Scanner in = new Scanner(System.in);
		String userFirstName = in.next();
		
		return new String(userFirstName);
	}
	// set last name
	private String setLastName() {
		System.out.print("Provide your last name: ");
		Scanner in = new Scanner(System.in);
		String userLastName = in.next();
		
		return new String(userLastName);
	}
	
	
	// Ask for the department
	private String setDepartment() {
		System.out.println("Department codes:\n1 for Marketing\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		if (depChoice == 1) { return "Marketing"; }
		else if (depChoice == 2) { return "Development"; }
		else if (depChoice == 3) { return "Account"; }
		else { return ""; }
	}

	// Generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNPORSTUZW1234567890!@#$%^&*";
		char[] password = new char[length];
		
		for(int i = 0; i < length; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	// Set the mailbox capacity
	private void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	public int getMailboxCapacity() { return mailboxCapacity; }
	public String getAlternateEmail() { return alternateEmail; }
	public String getPassword() { return password; }
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY MAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + " mb";
	}
	
}