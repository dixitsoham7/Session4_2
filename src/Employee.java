/*
 *Inheritance represents the IS-A relationship, also known as parent-child relationship which is illustrated below
 *We have used two classes one is Employee and other is Analyst. 
 *Analyst is derived from Employee using keyword extends
 *Relationship between two classes is Analyst IS-A employee 
 *inheritance achieved using extends keyword
 */

public class Employee {     //base class
	
	int emp_salary=1300000;  //salary of employee

}

class Analyst extends Employee{  //class Analyst inherited from base class Employee using extends keyword
		
	int emp_bonus=100000;  //bonus given to analyst
	
	public static void main(String[] args) {
		
		System.out.println("Example of IS-A relationship : \n");
		
		//relationship between two classes is Analyst IS-A Employee
		
		Analyst obj = new Analyst();   //creating object of derived class which can access field of Employee class as well as Analyst class
		System.out.println("Salary of ANALYST : "+obj.emp_salary);  //printing salary
		System.out.println("Bonus of ANALYST : "+obj.emp_bonus);    //printing bonus
		
	}
}


//Inheritance should be used only if the relationship is-a is maintained throughout the lifetime of the objects involved otherwise, aggregation is the best choice.