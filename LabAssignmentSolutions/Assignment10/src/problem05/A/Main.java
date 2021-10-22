package problem05.A;

public class Main {
	public static Queue queue;
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			queue = new Queue();
			createAndStartThread();
			System.out.print("\tQUEUE: "+i+"\n");
//			System.out.println(queue.getHead() == null ? "NULL":queue.getHead().value);
//			System.out.println(queue.getTail() == null ? "NULL":queue.getTail().value );
		}
	}
	
	public static void createAndStartThread() {
		Runnable r = () -> {
			queue.add(Integer.valueOf(0));
			queue.add(Integer.valueOf(1));
			for(int i=0; i<1000; i++) {
				queue.add(Integer.valueOf(i));
				queue.remove();
			}
		};
		new Thread(r).start();
	}
}
