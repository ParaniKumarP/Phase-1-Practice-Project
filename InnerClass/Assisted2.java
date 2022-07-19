package InnerClass;

public class Assisted2 {

private String what="Inner Class";

 void display(){  
	 class abc{  
		 void what(){
			 System.out.println(what);
		 }  
  }  
  
  abc z=new abc();  
  z.what();  
 }  

 
public static void main(String[] args) {
	Assisted2  xy=new Assisted2 ();  
	xy.display();  
	}
}
