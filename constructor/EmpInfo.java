package constructor;

class EmpInfo{
	int id =5;
	String name="abd";

void display() {
	System.out.println(id+" "+name);
	}




public static void main(String[] args) {

	EmpInfo emp1=new EmpInfo();
	EmpInfo emp2=new EmpInfo();

	emp1.display();
	emp2.display();
	}
}
