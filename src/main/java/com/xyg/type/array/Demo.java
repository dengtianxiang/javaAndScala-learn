package com.xyg.type.array;

/**
 * 进制:
 * 十进制(范围:0-9):生活中的数字(10,100,88)
 * 二进制(范围:0,1):以0b/0B开头
 * 八进制(范围:0-7):以0开头
 * 十六进制(范围:0-9,A/a-F/f(10-15)):以0x开头
 */

public class Demo {
	public static void main(String[] args) {
		//十进制8
		System.out.println(8);
		//二进制8
		System.out.println(0b1000);
		//八进制8
		System.out.println(010);
		//八进制9
		System.out.println(011);
		//十六进制8
		System.out.println(0X8);
		//打印12
		System.out.println(0xc);
		
		int a = 10;
		System.out.println(a);
		System.out.println(a);

	}
}
