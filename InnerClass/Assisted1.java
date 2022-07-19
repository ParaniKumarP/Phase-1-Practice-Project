package InnerClass;


public class Assisted1 {

	
	 class Inner{  
	  void hai(){
		  System.out.println(" Java");}  
	 }  


	public static void main(String[] args) {

		Assisted1 obj=new Assisted1();
		Assisted1.Inner in=obj.new Inner();  
		in.hai();  
	}
}

