package com.satish.SynchronousQueue;

import java.util.concurrent.Callable;

public class SynchronousBlockingQueuePutThread implements Runnable {

	java.util.concurrent.BlockingQueue<Light> bq = null;
	
	SynchronousBlockingQueuePutThread(java.util.concurrent.BlockingQueue<Light> bq)
	{
		this.bq = bq;
	}
	
	@Override
	public void run()  {
	
		 try {
			 System.out.println("putting to queue");
			Light l = new Light(10,1);
			bq.put(l);
			System.out.println("put");
			
			l = new Light(20,2);
			bq.put(l);
			System.out.println("put");
			
			l = new Light(3,3);
			bq.put(l);
			System.out.println("put");
			System.out.println(bq);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
