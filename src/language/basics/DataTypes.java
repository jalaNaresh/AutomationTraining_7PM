package language.basics;

public class DataTypes {

	// Data Types

	// 1. Primitive Data Types ==> Pre-defined data types ==> the range of data that
	// we can store is already defined

	// To store Numbers (Ex: 1234)

	// 1.byte ==> 1 byte ==> -128 to +127
	// 2.short ==> 2 bytes ==> -32,768 to +32,767
	// 3.int ==> 4 bytes ==> -2147483648 to +2147483647
	// 4.long ==> 8 bytes ==> -19 digit to +19 digit number

	// To store decimals (Ex: 10.234)

	// 5.float ==> 4 bytes ==> upto 6 decimal points we can store in float
	// (-2147483648 to +2147483647 along with 6 decimal)
	// 6.double ==> 8 bytes ==> -19 digit to +19 digit along with 15 decimal points

	// To store result of the condition
	// 7.boolean ==> 1 bit ==> true /false

	// To store single chars with in single quotes ('')or ASCII value of char
	// 8.char ==> 2 bytes

	// 2. Non-Primitive Data Types

	public static void main(String[] args) {

		// Syntax to store data in Java is ==> DataType Variable = Data ;

		// DataType to specify the type of data along with memory size to store the data
		// Variable is name of memory location where we are storing the data
		// = is a operator

		byte marks = 127;
		short empid = 1234;
		int pincode = 518001;
		long creditcard = 5435432143565436l;

		float percentageOfMarks = 92.50f;
		double latitude = 24.424352818;

		boolean testCasePassed = true;
		char gradeInPG = 'A';
		char asciiValueOfa = 97;
		
		//NON-PRIMITIVE DATA TYPES (There are rules to follow but the value is our choice)
		
		//String ==> to store text values (Rule is value should be stored with in the double quotes)
		//class ==> template to store data and functions/methods 
		//Array  ==>
		
		String text = "jkfdvhwrqgfhiouq34ghoierhjfgkehwjfgrkvnhjwgoqw305u42&*^*&^*&^&*^(*fdvbdsfvbs";

	}

}
