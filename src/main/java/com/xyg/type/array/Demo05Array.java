package com.xyg.type.array;
/**
 * 数组的静态初始化:为数组中的元素赋指定值,数组的长度由系统决定(赋值的个数)
 *
 * 格式:
 * 	数据类型[] 数组名 = new int[]{元素值1,元素值2,....};
 *
 * 简化版本:
 * 	数据类型[] 数组名 = {元素值1,元素值2,....};
 * 注意:
 * 	1.new int[]可以省略,由JVM(Java虚拟机自动补全)
 * 	2.简化版本,数据的定义和赋值必须写在一行上
 */
public class Demo05Array {
	public static void main(String[] args) {
		//定义一个int类型的数组,并进行静态初始化赋值
		int[] arr1;
		arr1 = new int[]{1,2,3};
		System.out.println(arr1);//[I@3fa5ac
		System.out.println(arr1[0]);//1
		System.out.println(arr1[1]);//2
		System.out.println(arr1[2]);//3

		//定义一个double类型的数组,并进行静态初始化赋值
		double[] arr2 = {1.1,2.2,3.3};
		System.out.println(arr2);//[D@95cfbe
		System.out.println(arr2[0]);//1.1
		System.out.println(arr2[1]);//2.2
		System.out.println(arr2[2]);//3.3
	}
}
