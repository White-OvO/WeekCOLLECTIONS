package Assignment_4_Week4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
		System.out.println("Create an Array");
		int ages[] = {3, 9, 23, 64, 2, 8, 28, 93};
		
	//	ages[0] = " 4 ";
		
	//	System.out.println(ages[0]);
		
		
		
		//Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.

	/*	int [] ages = new int [8];
		
				ages[0] = 3;
				ages[1] = 9;
				ages[2] = 23;
				ages[3] = 64;
				ages[4] = 2;
				ages[5] = 8;
				ages[6] = 28;
				ages[7] = 93;

			ages [0] = 4;
				System.out.println(ages[0]);
*/
			//Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
System.out.println("subtract the value of the first element in the array from the value in the last element");
				int firstElementMinusLastElement = ages[ages.length - 1] - ages[0];
				
			//	•	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
//creates a loop
				System.out.println(firstElementMinusLastElement);
				System.out.println( );
/*				int [] ages2 = new int [9];
				ages2[0] = 31;
				ages2[1] = 29;
				ages2[2] = 53;
				ages2[3] = 54;
				ages2[4] = 22;
				ages2[5] = 81;
				ages2[6] = 22;
				ages2[7] = 9;
				ages2[8] = 10;
				
				//int firstElementMinusLastElement2 = ages2[ages2.length - 1] - ages2[0];
				
				
				System.out.println(firstElementMinusLastElement2);
*/
				
				System.out.println("Add a new age to your array ");
				int ages2[] = {3, 9, 23, 64, 2, 8, 28, 93, 65};
				
				int firstElementMinusLastElement2 = ages2[ages2.length - 1] - ages2[0];
				System.out.println(firstElementMinusLastElement2);
				System.out.println( );
				
				
				
				System.out.println("----------------------------------------elloH");
				
				int sum = 0; 
				
				System.out.println("Use a loop to iterate through the array and calculate the average age.");
				for (int age: ages ) {
					//variable sum is zero. for -loop for age/ages
				sum += age ;
					System.out.println("Sum : " + sum );
				System.out.println("Age: " + age);
		         
				int average = sum / ages2.length;
				System.out.println("The average for age is :" + average);
				
			        }
				
				System.out.println("\nCreate an array of String ");
				/// array of names.
				
				
				String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
			
				//finding average number of letter of names.
			
				
				

		//Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
System.out.println("\nUse a loop to iterate through the array and calculate the average number of letters per name");
				
			int averageNumberOfName = 0;
			for(String name : names) {
				//average number of name
				averageNumberOfName += name.length();
			}

			//System.out.println(averageNumberOfName);
			

			
			
			
			
		
			
			//se a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
			int sum2 = 0;
			for (String n : names ) {
			    sum2 += n.length();
			}
			System.out.println(sum2/ names.length);
			
			
			System.out.println("\nconcatenate all the names together");
			
			
			//Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.≠≠≠

			System.out.println(Arrays.toString(names));
			
			
			System.out.println("\nHow do you access the last element of any array?"
					+ "");
			//How do you access the last element of any array?
		System.out.println(names[names.length - 1]);


//			How do you access the first element of any array?
		System.out.println("\nHow do you access the first element of any array?"
				+ "");

		System.out.println(names[0]);



System.out.println("\nLoop to iterate over the previously created names array and add the length of each name to the nameLengths array");


		//Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.

		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++){
		    nameLengths[i] = names[i].length();
		}

		System.out.println("Elements of the array are: "+Arrays.toString(nameLengths));


		//Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int sum3 = 0;
		for(int i=0; i < nameLengths.length; i++){
			
		    sum3 += nameLengths[i];
		    System.out.println(sum3);
		 }
	
		 
		
		System.out.println("\nCalculate the sum of all the elements in the arra");
		 System.out.println("Sum of the elements of the array :"+sum3);
		 
		 
		 System.out.println("\na String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times.");
		 
	System.out.println(concatenatedWord (3,"Chris"));
		 
	
	
	System.out.println("\ntwo Strings, firstName and lastName, and returns a full name");
	//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	String firstName7 = "christopher"; 
	String lastName = "Gonzalez";
	String fullName = firstName7 + " " + lastName ;
	System.out.println(fullName);
				
	
	
	
	
	
	//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.

	System.out.println("\n an array of int and returns true if the sum of all the ints in the array is greater than 100");
	double numList1, numList2, numList3, numList4; {
	numList1 = 4545;
	numList2 = 5456;
	numList3 = 447;
	numList4 = 758;

if (numList1 + numList2 + numList3 + numList4 < 100) {
    System.out.println("false"); // Do not change this statement
// Write your else statement here
} else {
    System.out.println("true"); // Do not change this statement
}






	}

	System.out.println("\n two arrays of double and returns true when average greater than second array.");
	
	
	int [] num1 = {10,10};
	int [] num2 = {6,4};
int avg = (num1[0] + num1[1]) / 2 ;	
int avg2 = (num2[0] + num2[1]) / 2;

if ( avg >  avg2) {
	System.out.println("true");
}
else { 
	System.out.println("False");
}
	




	
	System.out.println("\nWill buy Method if more than 10.50 in wallet");
	
   	boolean isHotOutside45 = true;
	double moneyInWallet45 = 20.20;
	if (isHotOutside45 && moneyInWallet45  > 10.50) {
		System.out.println("BuyDrink");
	}
	else {
		System.out.println("Dont buy the drink");
	
	
		
		

	
	System.out.println("\n Double and returns the average of all the elements ");
	//		Write a method that takes an array of double and returns the average of all the elements in the array.
	
	
	double[] doubles = {45,65,58,95};
	
	System.out.println(calculateAverage(doubles)); }
	}
	

	
	
	
	
	public static double calculateAverage(double[] array) {
		double sum = 0;
		for(double number : array) {
			sum += number;
			
		}
		return sum / array.length;
		
		
		
	}
/*
	




	   
			//End of main method
	//This is a string method because it is returning a string
	/*
	 * The name method is concatenatreword is because the system needs somthing to relay on for name
	 * the perameters takes 2 but with a comma data type name , int (not always).
	 * 
	 * 
	 * 
	 */
		public static String concatenatedWord(int age, String name )  {
		String result = "";
			for (int i=0; i < age; i++) {
			result += name;
			System.out.println("**************");
			System.out.println(result);
		}
			return result;
	
}
			
			
}

