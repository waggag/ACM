package cn.waggag.test;

import java.util.Scanner;
/**
 * @author 王港
 * 2019年3月8日上午1:31:10
 */
public class Main1336 {

	private static int[] month_days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String rows = sc.nextLine();
		int number = Integer.valueOf(rows);

		String test[] = new String[number];
		for (int i = 0; i < number; i++) {
			test[i] = sc.nextLine();
		}

		for (int i = 0; i < number; i++) {
			String[] split = test[i].split(" ");
			int j = 0;
			int year = Integer.parseInt(split[j].substring(0, 4));
			int month = Integer.parseInt(split[j].substring(4, 6));
			int day = Integer.parseInt(split[j].substring(6, 8));

			int week = Integer.parseInt(split[j + 1]);
			int orderday = Integer.parseInt(split[2]);
			week = (week + orderday) % 7;
			if (week == 0) {
				week = 7;
			}
			isRun(year);
			day = day + orderday;
			while (day > month_days[month]) {
				day = day - month_days[month++];
				if (month == 13) {
					year++;
					month = 1;
					isRun(year);
				}
			}
			//格式化输出天数
			String format_year = String.format("%04d", year);
			String format_month = String.format("%02d", month);
			String format_day = String.format("%02d", day);
			System.out.println(format_year + format_month + format_day + " " + week);
		}
	}

	public static void isRun(int day) {
		if (day % 4 == 0 && day % 100 != 0 || day % 400 == 0)
			month_days[2] = 29;
		month_days[2] = 28;
	}
}
