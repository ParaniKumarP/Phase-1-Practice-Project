package throwThrowsFinally;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String str){
		super(str);
	}
}
public class TFT {
	static void  validate(int age)throws InvalidAgeException{
		if(age<18){
			throw new InvalidAgeException("you are not eligible for vote");
		}
		else
			System.out.println("you are eligible to vote");
	}
	public static void main(String[] args) {
		
		try{
			validate(55);
		}
		catch(InvalidAgeException e){
			e.printStackTrace();
		}
		finally {
			System.out.println("End of the program");
		}

	}

}