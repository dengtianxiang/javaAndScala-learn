package com.xyg.type.array;

/**
 * 计算数组的最值(最大值,最小值):
 *
 * 分析:最大值(最小值下午练习)
 * 	1.定义一个int数组,并进行静态初始化赋值
 * 	2.取出数组的第一个元素,赋值给最大值的变量,设置为参数物
 * 	3.遍历数组,获取数组中的其它元素
 * 	4.比较最大值和数组的其它元素
 * 	5.如果其它的元素比最大值还大,则替换他
 * 	6.打印最大值
 */
public class Demo02ArrayTest {
	public static void main(String[] args) {
		//1.定义一个int数组,并进行静态初始化赋值
		int[] arr = {55,66,22,100,88,99};
		//2.取出数组的第一个元素,赋值给最大值的变量,设置为参数物
		int max = arr[0];
		//3.遍历数组,获取数组中的其它元素
		for(int i=1; i<arr.length; i++){
			/*int a = arr[i];
			//4.比较最大值和数组的其它元素
			if(a > max){
				//5.如果其它的元素比最大值还大,则替换他
				max = a;
			}*/

			if(arr[i] > max){
				max = arr[i];
			}
		}
		//6.打印最大值
		System.out.println("max:"+max);
	}
}