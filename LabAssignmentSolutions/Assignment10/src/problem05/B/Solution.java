package problem05.B;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Solution {
	public static SynchronizedQueue synchronizedQueue;// = new Queue();
	private static Executor exec = Executors.newCachedThreadPool();

	public static void main(String[] args){
		for (int i = 0; i < 100; i++) {
			synchronizedQueue = new SynchronizedQueue();
			createAndStartThread();
			System.out.println(synchronizedQueue.remove());
		}
	}

	public static void createAndStartThread(){
		Runnable r = () -> {
			synchronizedQueue.add(7);
			synchronizedQueue.remove();
		};
		for (int k = 0; k < 200; k++) {
			exec.execute(r);
//			try {
//				Thread.sleep(1);
//			} catch(InterruptedException e) {}
		}

	}
}
