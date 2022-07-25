package threadsCreation;

public class Edit extends Thread{
	public void run() {
		System.out.println("This is a thread");
	}
	
	public static void main(String[] args) {
		Edit t = new Edit();
		Thread e = Thread.currentThread();
		e.setName("Multi");
		e.setPriority(10);
		System.out.println(e);
		t.start();
	
		System.out.println("The thread name is"+e.getState());
	}

}
