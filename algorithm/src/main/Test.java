package main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import sort.SortUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner scan = new Scanner(System.in);
		for(;;){
		num = scan.nextInt();
		if(num ==0){
			break;
		}
		int data[] = new int[num];
		Random random = new Random();
		for (int i = 0; i < num; i++) {
			data[i] = random.nextInt(num);
		}
		int data1[] = Arrays.copyOf(data, num);
		int data2[] = Arrays.copyOf(data,num);
		int data3[]=Arrays.copyOf(data, num);
		//printArray(data);
		//测试冒泡
		long currentTime = System.currentTimeMillis();
		SortUtil.bubbleSort(data);
		System.out.println("冒泡排序用时间："+(System.currentTimeMillis()-currentTime));
		//printArray(data);
		//测试选择
		currentTime = System.currentTimeMillis();
		SortUtil.selectSort(data1);
		System.out.println("選擇排序用时间："+(System.currentTimeMillis()-currentTime));
		//printArray(data1);
		//测试插入
	
		currentTime = System.currentTimeMillis();
		SortUtil.insertSort(data2);
		System.out.println("插入排序用时间："+(System.currentTimeMillis()-currentTime));
	//	printArray(data2);
		//测试快排
		currentTime = System.currentTimeMillis();
		SortUtil.quickSort(data3,0,num-1);
		System.out.println("快速排序用时间："+(System.currentTimeMillis()-currentTime));
	//	printArray(data3);
		}

	}
	
	/**
	 * 打印数组
	 * @param data
	 */
	public static void printArray(int data[]){
		for(int i =0;i<data.length;i++){
			System.out.print("\t"+data[i]);
		}
		System.out.println();
		
	}
	

}
