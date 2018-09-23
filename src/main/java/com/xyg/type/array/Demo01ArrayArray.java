package com.xyg.type.array;

/**
 * 二维数组:数组中的元素仍是一个数组
 *
 * 定义格式:
 * 	数据类型[][] 数组名; 实际使用的格式
 * 	数据类型 数组名[][];  底层源码中看见,了解
 * 	数据类型[] 数组名[]; 底层源码中看见,了解
 *
 * 举例:
 * 	int[][] arr1;
 *
 * 初始化赋值:
 * 	动态:
 * 		数据类型[][] 数组名  = new 数据类型[m][n];
 * 		m:二维数组的长度
 * 		n:二维数组中一维数组的长度
 * 	静态:
 * 		数据类型[][] 数组名  = new 数据类型[][]{数组1,数组2,数组3....};
 * 		数据类型[][] 数组名  = new 数据类型[][]{{元素值1,元素值2,....},{元素值1,元素值2,....}...};
 * 	简化格式:定义和赋值必须写在一行上
 * 		数据类型[][] 数组名  = {{元素值1,元素值2,....},{元素值1,元素值2,....}...};
 */
public class Demo01ArrayArray {
	public static void main(String[] args) {
		//定义一个int类型长度为3的二维数组,存储的元素为长度为4的一维数组
		int[][] arr1 = new int[3][4];
		System.out.println("二维数组的名字:"+arr1);//[[I@1950198
		System.out.println("二维数组长度:"+arr1.length);//3
		System.out.println("二维数组的第一个元素:"+arr1[0]);//[I@19bb25a
		System.out.println("二维数组的第二个元素:"+arr1[1]);//[I@da6bf4
		System.out.println("二维数组的第三个元素:"+arr1[2]);//[I@1e58cb8
		System.out.println("二维数组第一个元素的长度:"+arr1[0].length);//4
		//访问二维数组中存储的一维数组中的元素
		System.out.println("二维数组中第一个一维数组的第一个值:"+arr1[0][0]);//0
		System.out.println("二维数组中第三个一维数组的第二个值:"+arr1[2][1]);//0
		System.out.println("==================");
		//二维数组的静态初始化赋值
		int[][] arr2 = {{1,2,3},{4,5,6,7},{8,9}};
		System.out.println("二维数组的名字:"+arr2);//[[I@1950198
		System.out.println("二维数组长度:"+arr2.length);//3
		System.out.println("二维数组的第一个元素:"+arr2[0]);//[I@19bb25a
		System.out.println("二维数组的第二个元素:"+arr2[1]);//[I@da6bf4
		System.out.println("二维数组的第三个元素:"+arr2[2]);//[I@1e58cb8
		System.out.println("二维数组第一个元素的长度:"+arr2[0].length);//3
		//访问二维数组中存储的一维数组中的元素
		System.out.println("二维数组中第一个一维数组的第一个值:"+arr2[0][0]);//1
		System.out.println("二维数组中第三个一维数组的第二个值:"+arr2[2][1]);//9
	}
}
