package language.basics;

public class IfElseConditionalStatements {

	// Based on the Salary , we should calculate tax and final salary
	// input = salary, and Tax bracket =>
	// <=5L ==> 0% ; > 5L && <=10L ==> 20% ; >10L && <=1C ==> 30% ; >1C ==> 40%

	/*
	 * if(condition1) { //if block }else if(condition2) {
	 * 
	 * }else if(condition3) {
	 * 
	 * }else { //default }
	 */

	// Nested If else

	/*
	 * if(Condition) { if(condition) {
	 * 
	 * }else {
	 * 
	 * } }
	 */

	public static void main(String[] args) {
		int salary = 499999;

		double finalSalary = 0;

		if (salary <= 500000) {
			if (salary == 500000) {
				finalSalary = salary - (salary * 0.1);
			} else {
				finalSalary = salary - (salary * 0);
			}
		} else if (salary > 500000 && salary <= 1000000) {
			finalSalary = salary - (salary * 0.2);
		} else if (salary > 1000000 && salary <= 10000000) {
			finalSalary = salary - (salary * 0.3);
		} else {
			finalSalary = salary - (salary * 0.4);
		}

		System.out.println(finalSalary);
	}

}
