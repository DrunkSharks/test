package test;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadTest1{
	
	public static void main(String[] args) {
		for(int i=0;i<100;i++)
		{
			System.out.println(Thread.currentThread().getName()+"  "+i);
			if(i==20) {
				FutureTask ft=new FutureTask((Callable<Integer>)()-> {
					for(int j=0;j<200;j++)
					{
						System.out.println(Thread.currentThread().getName()+"  "+j);
					}
					return 1;
			    });
				
				new Thread(ft).start();
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
