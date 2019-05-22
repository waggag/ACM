package cn.waggag.test;

import java.util.Scanner;

public class Main1557 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rows = Integer.parseInt(sc.nextLine());
		String[] str = new String[rows];
		for (int i = 0; i < rows; i++) {
			str[i] = sc.nextLine();
		}
		double[] result = new double[rows];
		for (int i = 0; i < str.length; i++) {
			String[] strings = str[i].split(" ");
			double a = Integer.parseInt(strings[0]);
			double b = Integer.parseInt(strings[1]);
			double x = Integer.parseInt(strings[2]);
			double y = Integer.parseInt(strings[3]);
			result[i] = Math.abs(x - a) + Math.abs(y - b);
		}
		for (int i = 0; i < rows; i++) {
			System.out.println(result[i]);
		}
	}
}
