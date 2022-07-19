package constructor;

public class Constr {
	String name;
	int price;
	int size;
	public Constr(String name, int price, int size) {//parametrized constructor
		this.name = name;
		this.price = price;
	}
public static void main(String[] args) {
	Constr c = new Constr("addidas", 5000, 10);
	Constr d = new Constr("Parani", 1000, 5);
	System.out.println(d.price+d.name);
			System.out.println(c.name);
}
}


