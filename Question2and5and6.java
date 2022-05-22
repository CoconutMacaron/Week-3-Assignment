package week3Assignments;

public class Question2and5and6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
	
	double sum = 0;
	for (String name : names) {
		sum += name.length();
	}
				
	double average = sum / names.length;
	
	//System.out.println(average);
	
	for (String name : names) {
		//System.out.print(name + " ");
	}
	
	
	//int[] nameLengths = new int[6];
	//for (int i = 0; i < names.length; i++) {
	//	nameLengths[i] = i;
	//	System.out.println(nameLengths);
	//}
	
	int[] nameLengths = {3, 5, 3, 5, 4, 3};
	
	int sumLetters = 0;
	
	for (int number : nameLengths) {
		sumLetters += number;
	}
	System.out.print(sumLetters);
		
	}
	
					
			
}


