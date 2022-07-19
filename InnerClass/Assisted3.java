package InnerClass;

abstract class Anonymous {
	   public abstract void show();
	}


	public class Assisted3 {

	public static void main(String[] args) {
	Anonymous n = new Anonymous() {

	         public void show() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      n.show();
	   }
	}
