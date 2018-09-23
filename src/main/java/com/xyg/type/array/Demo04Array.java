package com.xyg.type.array;

/**
 *  需求:
 * 	定义两个数组，先定义一个数组赋值，输出。
 * 	然后定义第二个数组的时候把第一个数组的地址赋值给第二个数组。
 * 	然后给第二个数组赋值，再次输出两个数组的名及元素。
 */
public class Demo04Array {
	public static void main(String[] args) {
		//定义两个字符串类型数组,并且进行动态初始化赋值
		String[] arr1 = new String[3];
		System.out.println(arr1);//[Ljava.lang.String;@95cfbe
		System.out.println("arr1数组中的第一个元素:"+arr1[0]);//null
		System.out.println("arr1数组中的第二个元素:"+arr1[1]);//null
		System.out.println("arr1数组中的第三个元素:"+arr1[2]);//null

		//然后定义第二个数组的时候把第一个数组的地址赋值给第二个数组。
		String[] arr2 = arr1;

		//然后给第二个数组赋值
		arr2[0] = "中国";
		arr2[2] = "赵丽颖";

		//再次输出两个数组的名及元素。
		System.out.println(arr1);//[Ljava.lang.String;@95cfbe
		System.out.println("arr1数组中的第一个元素:"+arr1[0]);
		System.out.println("arr1数组中的第二个元素:"+arr1[1]);
		System.out.println("arr1数组中的第三个元素:"+arr1[2]);
		System.out.println(arr2);//[Ljava.lang.String;@95cfbe
		System.out.println("arr2数组中的第一个元素:"+arr2[0]);
		System.out.println("arr2数组中的第二个元素:"+arr2[1]);
		System.out.println("arr2数组中的第三个元素:"+arr2[2]);
	}
}
