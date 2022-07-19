package AcessModifier;

 class Ab { 
	  void display() 
	     { 
	         System.out.println("Access Modifier"); 
	     } 
	} 

public	class AS {

		public static void main(String[] args) {
			//default
			System.out.println("Default Access Specifier");
			Ab obj = new Ab(); 		  
	        obj.display(); 

		}
	}


