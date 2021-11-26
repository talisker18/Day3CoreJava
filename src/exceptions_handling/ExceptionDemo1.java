package exceptions_handling;

class ArithmeticTest{
	public static void division(int n1, int n2) {
		
		try {
			int result = n1/n2;
			System.out.println("result: "+result);
		}catch(ArithmeticException e) {
			System.out.println("you cant divide by "+n2);
			System.out.println(e.getMessage()); //getMessage() from superclass Throwable
			//look hierarchy of exceptions
		}catch(Exception e) { //catch block hierarchy: from child to parent!!!
			//any other exceptions
			System.out.println(e.getMessage());
		}finally {
			System.out.println("this is always executed"); //is run always, even if exception was caught
		}
	}
	
	public static void division2(int n1, int n2) {
		
		try {
			int result = n1/n2;
			System.out.println("result: "+result);
		}catch(NumberFormatException e) {
			
		}catch(IndexOutOfBoundsException e) { 
			
		}finally {
			System.out.println("this is always executed"); //is run always, even if exception was thrown AND NOT CAUGHT, like in this case
		}
	}
	
}

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticTest.division(100, 50);
		
		ArithmeticTest.division(0, 50);
		
		ArithmeticTest.division(100, 0);
		System.out.println();
		
		ArithmeticTest.division2(100, 0);
		
	}

}
