package QueueInterface3DequeInterfaceFIFOLIFO;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 *	Queue Interface (Hang doi): FIFO (First In First Out)
 *		Deque Interface: FIFO + LIFO
 * */

public class Test {
	public static void main(String[] args) {
		Deque<String> danhSach = new ArrayDeque<String>();
		
		danhSach.offer("TITV 1");
		danhSach.offer("Nguyen A");
		danhSach.offer("Nguyen B");
		danhSach.offer("TITV 2");
		danhSach.offerLast("TITV 4");
		danhSach.offerFirst("TITV 0");
		
		//-> TITV 4 > TITV 2 > Nguyen B > Nguyen A > TITV 1 > TITV 0
		
		while(true) {
			String ten = danhSach.poll();
			if(ten == null) {
				break;
			}
			System.out.println(ten);
		}
		
		
	}
}
