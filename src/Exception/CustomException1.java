package Exception;

class InvalidAmountException1 extends Exception{

	@Override
	public String toString() {
		return "Insufficient Balance";
	}
	
}
public class CustomException1 {
	static void  validate(int balance, int withdraw)throws InvalidAmountException1{
		if(balance<withdraw){
			throw new InvalidAmountException1();
		}
		else
			System.out.println("Withdraw amount"+withdraw +"is sucessfull");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			validate(5000, 100);
		}
		catch(InvalidAmountException1 e){
			System.out.println(e);
		}

	}

}
