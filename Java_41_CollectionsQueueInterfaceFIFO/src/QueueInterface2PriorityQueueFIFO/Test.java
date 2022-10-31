package QueueInterface2PriorityQueueFIFO;

import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Queue Interface (Hang doi): FIFO (First In First Out)
 * 		Priority Queue (Hang doi Uu tien) FIFO
 * 		- Tu sap xep lai
 * */

public class Test {
	public static void main(String[] args) {
		Queue<String> danhSach = new PriorityQueue<String>();
		
		//Them vao queue:
		danhSach.offer("TITV 1");
		danhSach.offer("Mr B");
		danhSach.offer("Mr A");
		danhSach.offer("TITV 2");
		
		//-> TITV 2 > TITV 1 > Mr B > Mr A
		
		while(true) {
			String ten = danhSach.poll();
			//poll() lay ra va xoa
			//peek() lay ra va khong xoa
			if(ten == null) {
				break;
			}
			System.out.println(ten);
		}
	}
}
