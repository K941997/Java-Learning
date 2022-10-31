package code;

public class SubInfor extends Infor{
	
	public void method() {
//		super.a //-> khong su dung duoc: private int a (vi` la` private)
		super.b = 2; //su dung duoc: int b
		super.c = 3; //su dung duoc: protected c
		super.d = 4; //su dung duoc: public d
	}
}
