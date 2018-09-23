package com.xyg.type.array;

/**
 * 遍历数组/数组遍历:依次打印数组中的所有元素
 */
public class Demo01ArrayTest {
	public static void main(String[] args) {
		//定义一个String类型的数组,并进行静态初始化赋值
		String[] arr = {"貂蝉","西施","王昭君","杨贵妃","金莲","西施","王昭君","杨贵妃","金莲"};

		//数组遍历
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("===============");
		/*
		 * 可以使用循环优化
		 * int i=0:数组的索引,从0开始
		 * 5:数组的长度
		 * arr[i]:访问数组中的元素
		 */
		for(int i=0; i<5; i++){
			System.out.println(arr[i]);
		}
		System.out.println("===============");
		/*
		 * 数组中有一个属性叫length,表示就是数组的长度
		 * 使用方式:数组名.length
		 */
		int length = arr.length;
		System.out.println("数组的长度是:"+length);
		System.out.println("===============");
		//使用length属性,继续优化遍历
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
