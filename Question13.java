package week3Assignments;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



System.out.println(amIStupid("yes", 1));
}

public static boolean amIStupid(String answer, int grade) {
if (answer.equals("yes") && grade < 50) {
	return true;
}
return false;
}
}

//this will answer if I am stupid if the String answer says "yes" 
//and if my grade is below 50
//I created it because I don't know how to do hardly any of these problems
//I honestly don't even know how I got this working
//It kept telling me something about how return false wasn't a boolean
//So i copied it out, deleted everything, and pasted back in and now it works fine somehow
