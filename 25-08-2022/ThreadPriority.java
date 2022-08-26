/*
 * @Author Nilanjan Dasgupta
 */
/*
 * Create 3 thread ans run according to priority.
 */
package thursdaylab;
//create a class ThreadPriority which extend Thread class
public class ThreadPriority extends Thread {
	public void run()
	{
		try{Thread.sleep(400);
		
		}catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println(Thread.currentThread().getName()+" is Running: "+"Whoes priority is "+Thread.currentThread().getPriority());
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create 3 threads
		ThreadPriority t1=new ThreadPriority();
		ThreadPriority t2=new ThreadPriority();
		ThreadPriority t3=new ThreadPriority();
		//set the name of 3 Threads
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t3.setName("Thread-3");
		//set priority of three threads
		t1.setPriority(7);
		t2.setPriority(10);
		t3.setPriority(5);
		// start the threads
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
