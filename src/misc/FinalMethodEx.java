package misc;

class Shape{
	public void draw() {
		System.out.println("draw method in super class");

	}
	
	final public void onlyShape() {
		
	}


}

class Rectangle extends Shape{
	
	@Override
	public void draw() {
		System.out.println("draw method in super class");

	}
	
	@Override
	public void onlyShape() { //Cannot override the final method from Shape
		System.out.println("draw method in super class");

	}
	
}

public class FinalMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
