package language.basics;

public class Operators {
	
//	1. Arithmetic Operators
//	2. Assignment Operators
//	3. Comparison Operators
//	4. Logical Operators

	public static void main(String[] args) {
	
//	1. Arithmetic Operators ==> to perform mathematical operations between numbers
	// +, -, * , / , % , ++(increment ==> +1) , -- (decrement ==> -1)
		int i = 10;
		i++; //i= i+1; ==> 10+1 = 11
		System.out.println(i);
		i--;//i=i-1==> 11-1 =10
		System.out.println(i);
		
//	2. Assignment Operators ==> to assign values to variables
		//=, +=,-=,*=,/=,%=
		int x = 20;
		x+=30;//x=x+30;==> 20+30=50
		System.out.println(x);
		x-=10;//x=x-10;==> x=50-10=40;
		System.out.println(x);
		
//	3. Comparison Operators	==> to compare numbers or chars 
		//== ,!=,>= ,<=,>,<
		int a = 10;
		int b = 20;
		
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(a<b);
		System.out.println(a!=b);
		
//	4. Logical Operators ==>to build logics by combining multiple conditions together
		// && (Logical and) , || (Logical or) , ! (Logical not)
		//and ==> except true and true all other conditions become false
		//or ==> except false or false all other conditions become true
		//not ==> not true is false , not false is true
		
		System.out.println( !(a>b || a==b) && a<b);
		
		
// + Symbol between Strings (or) String and any value will behave like concatenation(joining together)
		String phone="9848022338";
		int code= 91;
		System.out.println(code+phone);
	}

}
