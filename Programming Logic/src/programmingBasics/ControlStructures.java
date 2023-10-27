package programmingBasics;

public class ControlStructures {

	//control structures are logical operations that can modify the execution of the application
	//they're divided into:
	
	/*
	 * loops: for, while, do while
	 * conditions: if, else, else if, switch & case
	 */
	
	
	public static void main(String [] args) {
	
		//LOOPS
		System.out.println("LOOPINGS EXAMPLES");
		
		//loops in programming logic are structures that repeats something on a specific amount of 
		//time, they're generally activated when a condition is validated true
		
		//the most common loops are: for and while, but there's also the do while loop
		
		
		
			//While Loops:
		
		//this is a variable, it has a value and it can be used at conditions
		boolean isTrue = false;
		
		//this is the Java syntax for a while loop
			//inside the brackets goes the condition variable
			//inside the curly brackets goes the action to be executed due to the matching 
			//condition
		while(isTrue) {
			System.out.println("isTrue");
		}
		
		//it's convenient to use a limiter, to make the loop stop after an specific amount
		//of repetitions or iterations
			//this loop will only run while the limiter is less than 10
			//at each iteration it will be increased 1 to the limiter
			//the loop will stop after 10 repetitions
		int limiter = 10;
		
		while(limiter < 10) {
			System.out.println("printing while the limiter is less than 10: " + limiter);
			limiter += 1;
		}
		
		//but is also possible make a loop using an kind of activator, like an boolean value
		boolean activator = false;
		
		while(activator) {
			System.out.println("printing while the activator is true");
		}
		
		
		
			//For loops:
		
		//this is the Java syntax to a for loop
			//inside the brackets goes:
				//the limiter
				//the condition
				//and the increaser
			//inside the curly brackets goes the code to be executed each iteration
		for(int i = 20; i < 20; i++) {
			System.out.println("printing until the limiter hits 20: " + i);
		}
		
		
		//for loops are frequently used at objects, more specifically Lists, Arrays, ArrayLists
		//and etc...
			
		int[] numbers = new int[3];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		
		
		for(int i = 0; i < numbers.length; i++) {
			
			System.out.println("printing the number " + numbers[i] + " at index " + i);
			
		}
		
		
		
			//Do While loops
		
		//this is the Java syntax of a Do While loop
			//is an loop which the execution happens before the condition is checked
			//the same logic of a while applies
				//inside the curly brackets goes the execution
				//inside the brackets goes the condition
		
		//the do while is used when something has to happen at least once on an application
		//so it's more convenient to use it with others statements like conditions
		int num = 0;
		
		do {
			
			if(num == 0 ) {
				System.out.println("first execution! iteration number: " + num);
			}else {
				
				System.out.println("not the first execution, iteration number: " + num);
				
			}
			
			num++;
			
		}while(num < 3);
		
		
		
		//CONDITIONS
		System.out.println("CONDITIONS EXAMPLES");
		/*
		 * conditions are blocks of code that are only executed if an certain value or 
		 * objective is reach, so it works around a specific situation where, when something
		 * is true or is real another will also occurs
		 */
		
		//the most used are: if's and else if's, but there's also else's and switch & case
		
		
		
			//IF conditionals:
		//if's are the most basic kind of conditional structures, it is basically an condition
		//that when it's reached, something will happen.
		

		//the Java syntax for an IF:
			//the condition goes inside the brackets
			//and the consequence stays inside the curly brackets
		
		int number = 5;
		
		if(number == 5) {
	
			System.out.println("number is equal: " + number);
		
		}
		
		//we can also apply some expressions to the conditions:
		boolean trueFalse = false;
		
		//checking if the boolean is false AND if the number is equals 5
		if(!trueFalse && number == 5) {
			System.out.println("executed because trueFalse is " + trueFalse);
		}
		
		
		
			//ELSE's structures
		//ELSE's are executions that are used when a condition can't be true	
		//they're EXECUTED in opposition to an if
	
		
		//Java syntax for ELSE's structures:
			//placed right after an if
				//executed when if fails to check true
				//curly brackets contains the execution
		
		if(trueFalse) {
			
			System.out.println();
		
		} else {
	
			System.out.println();
			
		}
		
		
		
			//ELSE IF's structures
		//ELSE IF's are condition that combines else's and if's
		//they are CHECKED in opposition to an if
		
		
		//Java syntax for ELSE IF's condition
			//placed after an IF
				//executed when the if checks false
				//brackets holds the condition
				//curly brackets contains execution
		if(trueFalse) {
			
		}else if(!trueFalse) {
			
		}
		
	}
	
}
