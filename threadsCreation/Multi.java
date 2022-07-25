package threadsCreation;
class what implements Runnable{
	public void run() {
		System.out.println("Multithreading");
	}
}
public class Multi {
	public static void main(String[] args) {
	Thread a = new Thread(new what());
	a.start();

}
}
