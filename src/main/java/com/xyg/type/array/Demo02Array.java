package com.xyg.type.array;
/**
 *  需求:
 * 	定义一个数组，输出数组名及元素。然后给数组中的元素赋值，再次输出数组名及元素
 */
public class Demo02Array {
	public static void main(String[] args) {
		//定义一个长度为3的double类型的数组
		double[] arr = new double[3];
		//输出数组名及元素
		System.out.println("数组的名字:"+arr);//[D@179dce4
		System.out.println("数组中的第一个元素:"+arr[0]);
		System.out.println("数组中的第二个元素:"+arr[1]);
		System.out.println("数组中的第三个元素:"+arr[2]);

		/*
		 * 然后给数组中的元素赋值
		 * 赋值的格式:
		 * 	数组名[索引] = 数据值;
		 */
		//给数组中的第一个元素赋值
		arr[0] = 3.14;
		//给数组中的第三个元素赋值
		arr[2] = 8.8;

		//再次输出数组名及元素
		System.out.println("数组的名字:"+arr);//[D@179dce4
		System.out.println("数组中的第一个元素:"+arr[0]);
		System.out.println("数组中的第二个元素:"+arr[1]);
		System.out.println("数组中的第三个元素:"+arr[2]);
	}
}