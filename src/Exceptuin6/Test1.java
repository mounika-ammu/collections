package Exceptuin6;



class InvalidAgeException extends Exception{
	public InvalidAgeException (String msg) {
		super(msg);
	}
}


public class Test1 {
	static void validate(int age)throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException ("invalid age");
			
		}
		else {
			System.out.println("valid age");
		}
	
	
	}
	public static void main(String[] args) {
		try {
			validate(18);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	

}
