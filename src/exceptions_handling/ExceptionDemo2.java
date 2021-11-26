package exceptions_handling;

class VotingSystem{
	static void validate(int age) {
		
		if(age < 18) {
			throw new ArithmeticException("exception message: you are not allowed to vote"); //custom exception: this is called with e.getMessage()
		}else {
			System.out.println("you are valid to vote");
		}
		
	}
}

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			VotingSystem.validate(12);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
