package Access2;

import Access1.Infor;

public class SubInfor2 extends Infor {

	public void method() {
//		super.a //-> khong su dung duoc: private int a (vi` la` private)
//		super.b //-> khong su dung duoc: int b (vi` la` default)
		super.c = 3; //su dung duoc: protected c
		super.d = 4; //su dung duoc: public d
	}
}
