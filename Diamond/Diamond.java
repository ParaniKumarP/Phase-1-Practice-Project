package Diamond;

 interface first{
	default void a() 
	{
		System.out.println("First line");
	}
}
 interface second{
	 default void a(){
		 System.out.println("Second line");
	 }
 }
 
public class Diamond implements first, second {
	
public void a() {
	first.super.a();
	second.super.a();
}

public static void main(String[] args) {
Diamond x = new Diamond();
x.a();
}
}