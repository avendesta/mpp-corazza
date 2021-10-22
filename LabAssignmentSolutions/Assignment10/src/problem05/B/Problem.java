package problem05.B;

// creating 100 queues, and then adding/removing consequetively
public class Problem {
	public static Queue queue;// = new Queue();

	public static void main(String[] args){
		for (int i = 0; i < 100; i++) {
			queue = new Queue();
			createAndStartThread();
			System.out.println(queue.remove());
		}
	}

	public static void createAndStartThread(){
		Runnable r = () -> {
			queue.add(7);
			queue.remove();
		};
		for (int k = 0; k < 200; k++) {
			new Thread(r).start();
		}

	}
}
