package QueueInterface1LinkedListFIFO;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue Interface (Hang doi): FIFO (First In First Out)
 * 		LinkedList Queue (Hang doi Danh sach lien ket) FIFO
 * 		- Khong tu sap xep lai nhu Priority Queue
 * 
 * */

public class Test {
	public static void main(String[] args) {
		Queue<String> danhSach = new LinkedList<String>();
		
		//Them vao queue:
		danhSach.offer("TITV1");
		danhSach.offer("A");
		danhSach.offer("B");
		danhSach.offer("TITV2");
		
		//-> TITV2 > B > A > TITV1
		
		while(true) {
			String ten = danhSach.poll(); //Lay ra va xoa
			//peek() //Lay ra va khong xoa
			if(ten == null) {
				break;
			}
			System.out.println(ten);
		}
	}
}
