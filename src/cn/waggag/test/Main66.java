package cn.waggag.test;

import java.util.Scanner;

/**
 * 现在输入一个正整数k,找到所有的正整数x>=y,使得1/k=1/x+1/y. 
 * 输入描述: 第一行输入一个整数n,代表有n组测试数据。
 * 接下来n行每行输入一个正整数k
 * 
 * @author 王港 2019年3月11日下午8:59:42
 */
public class Main66 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rows = Integer.parseInt(scanner.nextLine());
		int[] number = new int[rows];
		for (int i = 0; i < rows; i++) {
			number[i] = Integer.parseInt(scanner.nextLine());
		}
		//条件判断运算过于复杂，可以精简
		for (int i = 0; i < number.length; i++) {
			for (int y = number[i] + 1; y <= number[i] * 2; y++) {
				if (number[i] * y % (y - number[i]) == 0) {
					int x = y * number[i] / (y - number[i]);
					System.out.println("1/" + number[i] + "=1/" + y + "+1/" + x);
				}
			}
		}
		scanner.close();
	}
}
