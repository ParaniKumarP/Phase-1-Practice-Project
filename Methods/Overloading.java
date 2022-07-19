package Methods;

public class Overloading {
void add(int a, int b) {
	System.out.println("The value of a and b is"+a+ "" +b);
}
void add(int a, int b, int c) {
	System.out.println("The value of a,b and c is"+a+ "" +b+ "" +c);
}
	public static void main(String[] args) {
Overloading x = new Overloading();
x.add(5,6);
x.add(7,8,9);
	}

}
