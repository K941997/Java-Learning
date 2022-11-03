package Access1;

public class ViDu {
	private Infor infor;
	
	public void method() {
//		this.infor.a //-> khong su dung duoc: private int a (vi` la` private)
		this.infor.b = 2; //su dung duoc: int b
		this.infor.c = 3; //su dung duoc: protected c
		this.infor.d = 4; //su dung duoc: public d
	}
}
