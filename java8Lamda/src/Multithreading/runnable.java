package Multithreading;

public class runnable  {
	
	

		public static void main(String[] args) {
			Runnable r= ()->{
				for (int i =0; i<10 ; i++) {
					System.out.println("child thread1");
				}
			};
			Thread t = new Thread (r);
			t.start();
			for(int i=0; i<10;i++)
			{
				System.out.println("main thread1");
			}
			
			}

		}
	
	

