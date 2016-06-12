package com.jifeng;
import com.jifeng.Person;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World");
//		Person person = new Person("jifeng");
//		person.changeName("zhujiadun");
//		person.printName();
//		File file = new File("/Users/jifeng/apps/node-v5.0.0/README.md");
//		file.read();
		MyThread runner = new MyThread();
		Thread mt = new Thread(runner);
		mt.start();
				
	}

}
