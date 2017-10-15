/*This is Address class which would contain address of employee like city state country.
 * Address is an entity reference of employee, So we can say Employee HAS-A address
 * Address class contains address details of employee
 * Entity reference -> Aggregation -> HAS-A relationship 
 */
class Address {
	String city,state,country;  //variables of class Address
	  
	public Address(String city, String state, String country) {  //parameterized constructor
	    this.city = city;  //initializing using this. keyword
	    this.state = state;  //initializing using this. keyword
	    this.country = country;  //initializing using this. keyword
	}  
}


 class Emp {  //class Emp which stores employee details

	int id;  //id is a variable
	String name; //name is a variable of Emp class
	Address address;   //Address is a class (Aggregation)
	
	public Emp(int id, String name, Address address) //parameterized constructor
	{
		this.id=id;      //initializing using this. keyword
		this.name=name;  //initializing using this. keyword
		this.address=address;  //initializing using this. keyword
	}
	
	void display(){    //method of class Emp
		System.out.println(id+" "+name);    //printing id and name
		System.out.println(address.city+" "+address.state+" "+address.country);  //printing address calling details of address constructor using object created address(<-obj)
		}  
	
	public static void main(String[] args) {  //main function
		
		System.out.println("Example of HAS-A relationship :\n");
		
		Address address1=new Address("Ahmednagar","Maharashtra","India"); //passing address details 
		Address address2=new Address("Pune","Maharashtra","India");  //passing address details
		  
		Emp e=new Emp(11,"Soham",address1);  //passing details of first employee
		Emp e2=new Emp(12,"Malhar",address2);   //passing details of second employee
		      
		e.display();  //displaying first employees details
		e2.display(); //displaying second employees details 

	}

}

 //Inheritance should be used only if the relationship is-a is maintained throughout the lifetime of the objects involved otherwise, aggregation is the best choice.
