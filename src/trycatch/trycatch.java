package trycatch;

public class trycatch {
public static void main(String[] args) {
	int[] arr = new int[1];
	try {
		arr[5] = 9;
	}catch (ArrayIndexOutOfBoundsException e) {
	e.printStackTrace();
	
	}
}
}
