package programmingBasics;

public class Variables {


	//MORE INFO ABOUT LONG:
			/*
			 * when giving a value to a long type java will consider this value as an int by default
			 * which is even shorter than a long number, so in order to put more numbers, is needed
			 * to write l which indicates that the value is a long one
			 *
			 *	
			 *	long test = 908032813018l;
			 *
			 */
	
	//VARIABLES:
		/*
		 * variables are a group of values with variable types that can be changed during the 
		 * execution of the application.
		 * 
		 * The value types can be divided into:
		 * 
		 * Primitive: int, long, byte, short, double, float, char and boolean.
		 *	and
		 * Non-primitive: String, Array, Interface, Object, Class and others **based from objects**
		 * 
		 */
	
		//ATENTION!!!
			/*
			 * for learning reasons this document will adopt a considerable use of methods, as an
			 * intention of simplifying the divergent parts into the code besides simplifying 
			 * the explanation and the examples as well. these elements will be explained more 
			 * deeply as the project advance but, for now, it's clever to consider them as 
			 * simple chunks of code that organizes the overall parts.
			 */
	
	public static void main(String[] args) {
	

		//WHAT'S THE DIFERENCE between a primitive and non-primitive value Type?
		/*
		 * 
		 * The main difference is the usage of these elements at the development. While 
		 * primitive only represents a value contained at a certain memory space during the
		 * runtime of the program, the non-primitive beyond having a value can manipulate
		 * that according to it properties and behaviors, which will be discussed later at
		 * "Attributes" and "Methods" topics.
		 * 
		 */
	
		
		//Java syntax for VARIABLES
			/*
			 * 1-the value type
			 * 2-the variable name
			 * 3-the "=" signal in order to attribute a value
			 * 4-semicolon to conclude the sentence
			 */
		
		//EXAMPLES: here are some of the most used
		int number = 0;
		double decimalNumber = 0.11;
		long longNumber = 100000000000l;
		boolean trueFalse = true;
		
		//EXAMPLE: String is non-primitive value type since it have properties
		String text = "piece of text";
		
		//here are some BEHAVIORS, a common thing of objects, that are defined by methods
		text.toUpperCase(); //It's a behavior, that make everything uppercase!
		text.charAt(0); //Another one, which return the char of a desired index.
		
		
		
		
		//Changing the value of the variables:
			/*
			 * 1-write the variable name
			 * 2-put an "=" sign
			 * 3-write the desired value
			 */
		
		//EXAMPLE:
		number = 10;
		decimalNumber = 0.5;
		longNumber = 99999999999l;
		trueFalse = false;
		
		text = "Hello World!";
		
		
		
		//Using the variables:
		
		//their value will be show at the console!
		System.out.println(number);
		System.out.println(decimalNumber);
		System.out.println(longNumber);
		System.out.println(trueFalse);
		System.out.println(text);
	}
	
	
	
	
	
}
