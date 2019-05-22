package cn.waggag.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main48 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numbers = new int[n];
		for(int i = 0;i<n;i++){
			numbers[i] = sc.nextInt();
		}
		//去重
		HashSet<Object> set = new HashSet<>();
		for(int i=0;i<numbers.length;i++){
			set.add(numbers[i]);
		}
		Object[] array = set.toArray();
		//排序
		Arrays.sort(array);
		System.out.println(array.length);
		for(int i =0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		sc.close();
	}
}
