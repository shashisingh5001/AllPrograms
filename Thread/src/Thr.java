class MyThread extends Thread
{
	public  void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("Parent Thread"+i);
		}
	}
}

class Thr 
{
	public static void main(String[] args) {
		
		MyThread t=new MyThread();
		t.start();
		
		for(int i=0;i<100;i++)
		{
			System.out.println("Main Thread"+i);
		}
	}
	}