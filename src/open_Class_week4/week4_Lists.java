package open_Class_week4;

import Week_4.ConsoleColors;

public class week4_Lists {
	
	//System.out.pritnln(ConsoleColord + "LIne 12. Chapter/Week3 Question 2: " + ConsoleColors.DARK_BLUE_BACKGROUND + " BUILD A NEW ARRAY");

	
	
	
	public static void main(String[] args) {
		System.out.println(ConsoleColors.RED_BRIGHT+ "LIne 15. Chapter/Week4 Question 1: " + ConsoleColors.DARK_BLUE_BACKGROUND + " ACESS A LIST OF STRING");

/*Access a List of String: Given a List stored in productList, write a 
 * program that will access elements in the List based on the index value
 *  stored in indexVal. Because this number is provided by the user, check
 *   to make sure the number is at least zero (0), but not larger than the index v
 * alue of the last item in the List. 
 * 
 * If indexVal is valid, print the product associated with the value stored at indexVal. 
 * If indexVal is not valid, then print "No product can be found with that product number." to the console.
 * 
 * 
 * 
 * 
 * A:
 * 	public static void main(String[] args) {
		//DO NOT CHANGE CODE BELOW
		Scanner in = new Scanner(System.in);
		int indexVal = in.nextInt();
		List<String> productList = new ArrayList<>(); 
		
		productList.add("Macbook");
		productList.add("HP Notebook");
		productList.add("iPhone 12");
		productList.add("Acer Aspire");
		productList.add("Windows Surface");
		productList.add("Galaxy S20");
		//DO NOT CHANGE CODE ABOVE
		
		// Write your code below this line		
		if (indexVal >= 0 && indexVal < productList.size()) {
		    System.out.println(productList.get(indexVal));
		} else {
		    System.out.println("No product can be found with that product number.");
		}
	
	}
}
 */
		System.out.println(ConsoleColors.RED_BRIGHT+ "LIne53 . Chapter/Week4 Question 2: " + ConsoleColors.DARK_BLUE_BACKGROUND + " Every other");
/*Every other: Given a List of five (5) words entered by the user, create a new List called newList that contains every 
 * other List item from the original List starting with the first item. 
 * Print (to the console) the old List using "The old List is: ", and the new List using "The new List is: "
 * 
 * 
 *A:
 *
 *	static void halfList(List<String> words) {
		// Declare a new List of String
		List<String> newList = new ArrayList<>();
		// Put every other entry into the new List, starting with the first (index 0)
		for(int i = 0; i < words.size(); i++) {
		    if ( i % 2 == 0 ) {
		        newList.add(words.get(i).toString());
		    }
		}
		// Print out the old List, and the new List
		System.out.println("The old List is: " + words);
		System.out.println("The new List is: " + newList);
	}

    // DO NOT CHANGE THE CODE BELOW THIS LINE
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word1, word2, word3, word4, word5;
		word1 = in.nextLine();
		word2 = in.nextLine();
		word3 = in.nextLine();
		word4 = in.nextLine();
		word5 = in.nextLine();
		List<String> words = new ArrayList<>();
		words.add(word1);
		words.add(word2);
		words.add(word3);
		words.add(word4);
		words.add(word5);
		
		halfList(words);
		
	}
}
 * 
 * 
 */
		
		
System.out.println(ConsoleColors.RED_BRIGHT+ "LIne102 . Chapter/Week4 Question 3: " + ConsoleColors.DARK_BLUE_BACKGROUND + " CREATE A list of factors");

/*Create a List of Factors: Create a loop that finds all the (positive) factors of the value of userNumber and stores them as elements of a new list. 
 * Note: All values of userNumber will have two (2) possible factors at a minimum: one (1) and userNumber. Then print the list to the console.
 * 
 * 
 * 
 * 
 * 
 * A:public class CodingQuestion {

	static void factors(int userNumber) {
        // Write your code below this line
        
        // Declare the List of Integer
		List<Integer> factorNum = new ArrayList<>();
		
		// Start your loop at 1, and go to the final number
		for (int i = 1; i <= userNumber; i++) {
		    // if userName is divisble equally by the index, add the index to the new List.
		    if ( userNumber % i == 0) {
		        factorNum.add(i);
		    }
		}
		
		//Print the list of factors here
		System.out.println(factorNum);
		
		// Write your code above this line
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int userNumber = in.nextInt();
		factors(userNumber);
	}
}
 * 
 * 
 */



System.out.println(ConsoleColors.RED_BRIGHT+ "LIne147 . Chapter/Week4 Question 3: " + ConsoleColors.DARK_BLUE_BACKGROUND + " create a list of square numbers");

/*
 * 
 * 
 * Create a List of Squared Numbers: Given five (5) numbers by the user stored in num1, num2, num3, num4, and num5, 
 * create a List called squaredNums that takes the user values and stores the squared value of each number as an element of squaredNums.
 * 
				 * 	static List squaredList(int num1, int num2, int num3, int num4, int num5) {
				        // Add your code below this line		
				        
				        // Declare the new List
						List<Integer> squaredNums = new ArrayList<>();
						
						// Add the square of each parameter into the new List
						squaredNums.add(num1*num1);
					    squaredNums.add(num2*num2);
						squaredNums.add(num3*num3);
						squaredNums.add(num4*num4);
						squaredNums.add(num5*num5);
						
				        // Add your code above this line
				        
						return squaredNums;
					}
				
					public static void main(String[] args) {
						Scanner in = new Scanner(System.in);
						int num1 = in.nextInt();
						int num2 = in.nextInt();
						int num3 = in.nextInt();
						int num4 = in.nextInt();
						int num5 = in.nextInt();
						
						System.out.println(squaredList(num1,num2,num3,num4,num5));
					}
				}
 * 
 */
System.out.println(ConsoleColors.RED_BRIGHT+ "LIne186 . Chapter/Week4 Question 3: " + ConsoleColors.DARK_BLUE_BACKGROUND + " create a list of factors");



/*
 * Create a List of integers: Create a List of integers from one (1) to the value 
 * stored in endNum. After the List has been created, then print the List to the console.
 * 
					 * 
					 * 
					 * 	static void createList(int endNum) {
							// Write your code in this method
							List<Integer> listNums = new ArrayList<>();
							
							for (int i = 1; i <= endNum; i++) {
							    listNums.add(i);
							}
							
							System.out.println(listNums);
						}
					
						public static void main(String[] args) {
							Scanner in = new Scanner(System.in);
							int endNum = in.nextInt();
							
							createList(endNum);
						}
					}
 * 
 */

System.out.println(ConsoleColors.RED_BRIGHT+ "LIne216 . Chapter/Week4 Question 3: " + ConsoleColors.DARK_BLUE_BACKGROUND + " print index of userletter");


/*
 * Print Index of userLetter: Given a List of Character called alphabet, search the list for
 *  the Character stored in userLetter and print to the console the index value of that Character.
					 * 
					 * 
						static void findLetter(List alphabet, char userLetter) {
							// Write your code below this line 
							int valueIndex = alphabet.indexOf(userLetter);
							System.out.println(valueIndex);
							
							// Write your code above this line 
						}
					
					    // DO NOT CHANGE THE CODE BELOW THIS LINE
						public static void main(String[] args) {
							Scanner in = new Scanner(System.in);
							char userLetter = in.next().charAt(0);
							
							List<Character> alphabet = new ArrayList<>();
							for (int i = 97; i < (97+26); i++) {
							    alphabet.add((char) i);
							}
							
							findLetter(alphabet, userLetter);
						}
					}
					 * 
					 * 
					 */
System.out.println(ConsoleColors.RED_BRIGHT+ "LIne247 . Chapter/Week4 Question 3: " + ConsoleColors.DARK_BLUE_BACKGROUND + " print the last element");

/*
 * Create a List of integers using endNum: Given the value stored in the variable endNum, do the following:

-- Create a List of integers that contains the numbers from 1 to endNum. 

-- Print the first element from the List using "The first number in the List is "

-- Print the last element of the List (without using a hard-coded index -- someList.get(190) is not what we want here), to the console using "The last number in the List is "

-- Don't forget to check if endNum is greater than zero (0), otherwise print "Your List cannot be created with a number less than one."
 * 
 * 					
 * 	static void beginEnd(int endNum) {
						// Add your code below this line 
						
						// If endNum is greater than zero, create a new List
						if ( endNum > 0 ) {
						    List<Integer> newList = new ArrayList<>();
						    for ( int i = 1; i <= endNum; i++ ) {
						        newList.add(i);
						    }
					        // Print the first entry & the last entry in the List
						    System.out.println("The first number in the List is " + newList.get(0));
						    System.out.println("The last number in the List is " + newList.get(newList.size()-1));
						    
				        // if endNum is not greater than zero, print this message.
						} else {
						    System.out.println("Your List cannot be created with a number less than one.");
						}
				
						// Add your code above this line
					}
					
					
				    //DO NOT CHANGE THE CODE BELOW THIS LINE 
					public static void main(String[] args) {
						Scanner in = new Scanner(System.in);
						int endNum = in.nextInt();
					
						beginEnd(endNum);
	}
}
 * 
 * 
 */
System.out.println(ConsoleColors.RED_BRIGHT+ "LIne296 . Chapter/Week4 Question 3: " + ConsoleColors.DARK_BLUE_BACKGROUND + " create a new list of integers");


/*
 * 
 * Create a new List of integers: Given four integer numbers stored in the variables num1, num2, num3, and num4, create a List that stores all of the values, and stores the sum of all the values in the last element in the List. Print the List to the console.
 * 
 * 
 * 
 * static void sumList(int num1, int num2, int num3, int num4) {
		// Write your code below this line
		List<Integer> numsPlusSum = new ArrayList<>();
		numsPlusSum.add(num1);
		numsPlusSum.add(num2);
		numsPlusSum.add(num3);
		numsPlusSum.add(num4);
		numsPlusSum.add(num1 + num2 + num3 + num4);
		
		System.out.println(numsPlusSum);
		
		// Write your code above this line
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, num3, num4;
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		num4 = in.nextInt();
		sumList(num1, num2, num3, num4);
		
	}
}
 */




						}

}