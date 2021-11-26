package misc;

class Calculation{
	final int count;
	final int count2; //blank var, must be init in constr (if not: compile time error)
	
	public Calculation(int count) {
		this.count=count;
		this.count2=200;
	}
	
	public void display() {
		System.out.println(this.count);
		//this.count++; //compile time error
	}
}

public class FinalKeywordDemo {
	
	public static void main(String[] args) {
		Calculation calc = new Calculation(100);
		calc.display();
		calc.display();
	}

}
