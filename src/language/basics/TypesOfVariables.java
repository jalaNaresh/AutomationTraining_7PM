package language.basics;

public class TypesOfVariables {
	
//	1. Local Variable ==> the variable we have initiated/created with in the method. (level of access for this variable is with in the method only)
//	2. Instance Variable ==>  the variable we have initiated/created out side of the method and with in the class. (class level variable)
//	3. Static/Global Variable ==> instance variable along with static keyword will be called as global variable
	
	
	String name2= "Arjun"; //Instance Variable
	
	static String name3 = "ABC";
	
	
	
	//Creation of Object ==> Object means new instance of Class
	//Syntax : ClassName variable = new ClassName();

	public static void main(String[] args) {	
		TypesOfVariables obj = new TypesOfVariables();
		String name1 = "Ricky"; //Local Variable
		System.out.println(name1);
		System.out.println(obj.name2);
		System.out.println(name3);		
	}
	
	public static void main2() {		
		TypesOfVariables obj = new TypesOfVariables();
		System.out.println(obj.name2);
		System.out.println(name3);
	}

}
