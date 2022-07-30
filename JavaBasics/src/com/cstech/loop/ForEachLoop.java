package com.cstech.loop;

public class ForEachLoop {
	// insted of args you can user defined characters
	public static void main(String[] kvk) {
		System.out.println("hi");
		int i1 = 0;
		int i2 = 1;
		int i3;
		for (int x = 1; x <= 10; x++) {
			i3 = i1 + i2;
			i1 = i2;
			i2 = i3;
			System.out.println(i3);
		}
		int x[] = { 10, 11, 12, 13, 14, 15, 16 };
		for(int k: x) {
			System.out.println(k);
		}
	}
}
