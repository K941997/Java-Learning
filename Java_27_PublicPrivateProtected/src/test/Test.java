package test;

import code.Infor;

public class Test {
	private Infor infor;
	
	public void method() {
//		this.infor.a = 1 //-> khong su dung duoc: private int a (vi` la` private)
//		this.infor.b = 2 //-> khong su dung duoc: int b (vi` la` default)
//		this.infor.c = 3 //-> khong su dung duoc: protected c (vi` ko extends)
		this.infor.d = 4; //su dung duoc: public d
	}
}
