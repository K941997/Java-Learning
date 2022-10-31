
public class ExampleBreak {
	//Break: dùng để stop vòng lặp
	
	//1. Unlabeled Form - Khong su dung Label (Không đặt ten vong lap):
//	public static void main(String[] args) {
//		int out, in = 0;
//		for (out = 0; out < 10; out++) {
//			for (in = 0; in < 20; in++) {
//				if (in > 10) {
//					break; //Break
//				}
//			}
//			System.out.println("Ben trong vong lap out: out = " + out + ", in = " + in);
//		}
//		System.out.println("Ben ngoai vong lap out: out = " + out + ", in = " + in);
//	}
	
	//2. Label Form - Su dung Label (Dat ten vong lap):
	public static void main(String[] args) {
		int out, in = 0;
		outer: for (out = 0; out < 10; out++) {
			for (in = 0; in < 20; in++) {
				if (in > 10) {
					break outer; //Break
				}
			}
			System.out.println("Ben trong vong lap out: out = " + out + ", in = " + in); //Break: không chạy dòng này vì đã break outer
		}
		System.out.println("Ben ngoai vong lap out: out = " + out + ", in = " + in);
	}
}
