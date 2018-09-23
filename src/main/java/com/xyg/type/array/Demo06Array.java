package com.xyg.type.array;

/**
 * 数组操作的两个常见的小问题:数组的运行期异常
 * 1.数组索引越界异常:ArrayIndexOutOfBoundsException: 3
 * 	访问了数组中不存在的索引
 * 2.空指针异常:NullPointerException
 * 	程序在运行的过程中,把数组的值,赋值为null,这时候在访问数组中的元素,就会报指针异常
 */
public class Demo06Array {
	public static void main(String[] args) {
		//定义一个长度为3的数组
		int[] arr = new int[3];
		System.out.println(arr[2]);
		//System.out.println(arr[10]);

		arr = null;
		System.out.println(arr[2]);
	}
}
