package cn.waggag.common;

public class Number {
	//求绝对值
	public static int abs(int x) {
		if (x < 0)
			return -x;
		else
			return x;
	}
	//重构abs函数
	public static double abs(double x) {
		if (x < 0)
			return -x;
		else
			return x;
	}
	
	//判断一个数是否为素数
	public static boolean isPrime(int N) {

		if (N < 2) {
			return false;
		}
		for (int i = 2; i * i <= N; i++) {
			if (N % i == 0)
				return false;
		}
		return true;
	}
	
	
	public static double hypotenuse(double a, double b) {
		return Math.sqrt(a * a + b * b);
	}
	
	//使用牛顿迭代法计算平方根
	public static double sqrt(double c) {
		if (c < 0)
			return Double.NaN;
		double err = 1e-15;
		double t = c;

		while (Math.abs(t - c / t) > err * t) {
			t = (c / t + t) / 2.0;
		}
		return t;
	}
	
	//计算一个数的二分级数
	public static double H(int N) {
		double sum = 0.0;
		for(int i = 1;i<=N;i++) {
			sum += 1.0/i;
		}
		return sum;
	}
	
}
