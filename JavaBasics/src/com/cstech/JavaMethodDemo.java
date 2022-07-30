package com.cstech;

public class JavaMethodDemo {
	int i =200;
	static int j = 400;
	public void m1() {
		System.out.println(i);
		System.out.println(j);
	}
	public static void m2() {
		//System.out.println(i); cannot call non static variable in Static method
		System.out.println(j);
	}
	public static void main(String[] args) {
		JavaMethodDemo j1 = new JavaMethodDemo();
		j1.m1();
		m2();
		System.out.println("hello");
	}
}
 