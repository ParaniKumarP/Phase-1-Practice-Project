package WaitandSleep;

 class Sleep extends Thread{
public void run() {
	for(int count=0;count<4; count++) {
		System.out.println("Example program for sleep");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}}
public class WaitandSleep{
public static void main(String[] args) {
	Sleep  a  = new Sleep();
	a.start();
	
}
}

