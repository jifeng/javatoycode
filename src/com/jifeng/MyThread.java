package com.jifeng;

public class MyThread implements Runnable {

	int num = 0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("MyThread is run.... " + (++num));
	}

}
