package week3Assignments;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(longString("Ow", 25));
	}
	
	public static String longString(String word, int n) {
		String initial = "";
		for (int i = 0; i < n; i++) {
			initial += word;
			
		}
		return initial;
		
	}
	
}
