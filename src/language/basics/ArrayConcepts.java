package language.basics;

public class ArrayConcepts {
	
	//Array 
	
	//==> Array is non-primitive data type to store multiple values with in the same variable with same data type
	//==>Nature of the array is ==> It can accept only similar data types and fixed length
	
	//Syntax to Initiate Array :  DataType [] Variable = new DataType [Length];
	//Syntax to store values in Array :  Variable[Index] = Data; ==> min Index allowed is Zero , Max Index allwoed is Length-1;
	//Syntax to retrieve values in Array: Variable[Index] ;
	
	
	// multiple values  with same data type with in the same variable

	public static void main(String[] args) {
		
		String empName1 = "Anusha";
		int empId1= 1;
		
		String empName2="Akshay";
		int empId2=2;
		
		String empName3="Anjali";
		int empId3=3;
		
		//Store all empNames in Array
		String [] empNamesOfABCCompany= new String [4];
		empNamesOfABCCompany[0]="Anusha";
		empNamesOfABCCompany[1]="Akshay";
		empNamesOfABCCompany[2]="Anjali";
		empNamesOfABCCompany[3]="XYZ";
		
		System.out.println(empNamesOfABCCompany[1]);
		
		String [] empNamesOfXYZCompany= new String [3];
		empNamesOfXYZCompany[0]="Gayathri";
		empNamesOfXYZCompany[1]="Govinda";
		empNamesOfXYZCompany[2]="Vamsi";
		
		//Store all empIds in Array
		int [] empIds = new int [3];
		empIds[0] = 1;
		empIds[1] = 2;
		empIds[2] = 3;
//		empIds[3] = 4;
		
		System.out.println(empIds[0]+","+empIds[1]+","+empIds[2]);
		
		//Multi-dimensional arrays 
		//2D Array
		
		String [][]  empNames = new String [2][4];
		empNames[0][0] = "Anusha";
		empNames[0][1] = "Akshay";
		empNames[0][2] = "Anjali";
		empNames[0][3] = "XYZ";
		
		empNames[1][0] = "Gayathri";
		empNames[1][1] = "Govinda";
		empNames[1][2] = "Vamsi";
		
		System.out.println(empNames[0][2]);
		
		//Other way of storing the values if the values are fixed and readily available
		String [][]  empNameValues= {{"Anusha","Akshay","Anjali","XYZ"},{"Gayathri","Govinda","Vamsi","ABC"}};
		System.out.println(empNameValues[1][3]);
	}

}
