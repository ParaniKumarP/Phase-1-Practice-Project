package AcessModifier;

class abc
{ 
   private void display() 
    { 
        System.out.println(" using private access specifier"); 
    } 
} 

public class Aprivate {

	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		abc  obj = new abc(); 
        //trying to access private method of another class 
        //obj.display();

	}
}

