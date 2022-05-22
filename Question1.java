package week3Assignments;

import java.util.Arrays;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
	
		double sum = 0;
		for (String name : names) {
			sum += name.length();
		}
					
		double average = sum / names.length;
		
		System.out.println(average);
		
	}
	
}	


