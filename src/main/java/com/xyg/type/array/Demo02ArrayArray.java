package com.xyg.type.array;

/**
 *  二维数组的遍历:
 * 	遍历二维数组,获取里边每一个一维数组
 * 	遍历一维数组
 */
public class Demo02ArrayArray {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6,7},{8,9}};
		//遍历二维数组,获取里边每一个一维数组
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);//打印的是一维数组的地址
		}
		System.out.println("================");
		//定义一个一维数组,接收二维数组的第一个元素
		int[] arr1 = arr[0];
		//遍历数组的快捷键:for-->alt+/
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		//定义一个一维数组,接收二维数组的第一个元素
		//相同的变量名称一起改变:alt+shift+r
		int[] arr2 = arr[1];
		//遍历数组的快捷键:for-->alt+/
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		//定义一个一维数组,接收二维数组的第一个元素
		int[] arr3 = arr[2];
		//遍历数组的快捷键:for-->alt+/
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		System.out.println("================");
		for (int i = 0; i < arr[0].length; i++) {
			System.out.println(arr1[i]);
		}
		for (int i = 0; i < arr[1].length; i++) {
			System.out.println(arr2[i]);
		}
		for (int i = 0; i < arr[2].length; i++) {
			System.out.println(arr3[i]);
		}
		System.out.println("================");
		//可以使用循环的嵌套遍历二维数组(把以上两步合成一步完成)
		//遍历二维数组,获取每一个一维数组
		for (int i = 0; i <arr.length; i++) {
			int[] array = arr[i];
			//继续遍历一维数组
			for (int j = 0; j < array.length; j++) {
				System.out.println(array[j]);
			}
		}
		System.out.println("================");
		//可以使用循环的嵌套遍历二维数组(把以上两步合成一步完成)
		//遍历二维数组,获取每一个一维数组
		for (int i = 0; i <arr.length; i++) {
			//继续遍历一维数组
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

}
