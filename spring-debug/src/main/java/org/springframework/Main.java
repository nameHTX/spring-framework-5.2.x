package org.springframework;

public class Main {
	public static void main(String[] args) {

		MyClassPathXmlApplicationContext myClassPathXmlApplicationContext = new MyClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(111);
//		User user = new User();
//		System.out.println("Hello world!" + user);
	}
}