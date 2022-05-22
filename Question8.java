package week3Assignments;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String firstName = "John";
	String lastName = "Smith";
	String fullName = createName(firstName, lastName);
			
	System.out.println(fullName);
	}
	
	public static String createName(String firstName, String lastName) {
		return firstName + " " + lastName;
		
	}
}


