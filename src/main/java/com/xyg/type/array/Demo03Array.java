package com.xyg.type.array;
/**
 *  需求:
 * 	定义两个数组，分别输出数组名及元素。然后分别给数组中的元素赋值，分别再次输出数组名及元素。
 */
public class Demo03Array {
	public static void main(String[] args) {
		//定义两个int类型的数组,并进行动态初始化赋值
		int[] arr1 = new int[3];
		int[] arr2 = new int[2];

		//分别输出数组名及元素
		System.out.println(arr1);
		int a = arr1[0];//把数组的元素取出来,赋值给一个变量
		System.out.println("arr1数组中的第一个元素:"+a);
		System.out.println("arr1数组中的第二个元素:"+arr1[1]);
		System.out.println("arr1数组中的第三个元素:"+arr1[2]);
		System.out.println(arr2);
		System.out.println("arr2数组中的第一个元素:"+arr2[0]);
		System.out.println("arr2数组中的第二个元素:"+arr2[1]);
		System.out.println("=================");
		//然后分别给数组中的元素赋值
		arr1[0] = 8;
		arr1[1] = 100;
		arr2[1] = 99;

		//分别再次输出数组名及元素
		System.out.println(arr1);
		System.out.println("arr1数组中的第一个元素:"+arr1[0]);
		System.out.println("arr1数组中的第二个元素:"+arr1[1]);
		System.out.println("arr1数组中的第三个元素:"+arr1[2]);
		System.out.println(arr2);
		System.out.println("arr2数组中的第一个元素:"+arr2[0]);
		System.out.println("arr2数组中的第二个元素:"+arr2[1]);
	}
}
