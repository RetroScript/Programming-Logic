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
	
	public static void main(String[] args) {
		
		//Java syntax for PRIMITIVE VALUED VARIABLES
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
		
		//Java syntax for NON-PRIMITIVE VALUED VARIABLES
			/*
			 *  1-the value type
			 * 2-the variable name
			 * 3-the "=" signal in order to attribute a value
			 * 4-semicolon to conclude the sentence
			 */
		
		//EXAMPLE: String is non-primitive value type since it have properties
		String text = "piece of text";
		
		
	}
	
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
	
	
}
