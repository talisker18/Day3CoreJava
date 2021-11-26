package misc;

class Employee{
	
	//data members or instance data members
	int id;
	String name;
	float salary;
	
	//static / class data members
	static String companyName = "Simplilearn"; //or init in static block, see below. but there is no difference or advantage if you init it in static block
	//use static block for more complex code
	
	
	/**
	 * The static block is a block of statement inside a Java class that will be executed when a class is first loaded into the JVM. 
	 * A static block helps to initialize the static data members, just like constructors help to initialize instance members.
	 * 
	 * */
	static {
		companyName = "Simplilearn";
	}
	
	public Employee() {
		
	}


	public Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void displayDetails() {
		System.out.println("employee details");
		System.out.println("id: "+this.id);
		System.out.println("name: "+this.name);
	}
	
}

public class StaticKeywordDemo {
	Employee em = new Employee(1,"joel",10000);
	
	Employee em2 = new Employee(2,"hans",10000);
}
