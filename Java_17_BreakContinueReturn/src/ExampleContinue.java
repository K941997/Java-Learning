
public class ExampleContinue {
	//Continue: dùng để continue vòng lặp
	
	//1. Unlabeled Form:
//	public static void main(String[] args) {
//		int max = 100;
//		for (int i=0; i<max; i++) {
//			if (i<50) {
//				continue; //Continue: Nếu i<50 thì continue loop, i>50 mới in ra i
//			}
//			System.out.println(i);
//		}
//	}
	
	//2. Labeled Form:
	public static void main(String[] args) {
		outer: for (int i = 2; i<=9; i++) {
			for (int j=1; j<=10; j++) {
				if(j>5) {
					continue outer; //Continue: j>5 thì continue loop, j<5 thì in ra i và j
				}
				System.out.println("i= " +i+ ", j=" +j);
			}
			System.out.println("-----");
		}
	}
}
