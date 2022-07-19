package Methods;

public class CallMethod {

	
	int a=150;
	
	int operation(int a) {
		a =a+5;
	return a;
	}

	public static void main(String args[]) {
		CallMethod d = new CallMethod();
		System.out.println("Before operation value of data is "+d.a);
		d.operation(10);
		System.out.println("After operation value of data is "+d.a);
		}


}
