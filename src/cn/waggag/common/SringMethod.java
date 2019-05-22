package cn.waggag.common;

/**
 * 对于字符串常用的操作
 * 
 * @author 王港 2019年3月8日上午1:57:22
 */
public class SringMethod {

	/*
	 * 判断一个字符串是否是回文
	 */
	public static boolean isPalindrome(String s) {
		int N = s.length();
		for (int i = 0; i < N / 2; i++) {
			if(s.charAt(i)!=s.charAt(N-1-i)) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//提取参数中的文件名和扩展名
//		String s = args[0];
//		int dow = s.indexOf(".");
//		String base = s.substring(0,dow);
//		String extension = s.substring(dow+1,s.length());
		
		String[] s = new String[2];
		s[0] = (String) "c";
		s[1] = (String) "b";
		System.out.println(isSorted(s));
		
	}
	
	//检测字母表顺序是否按照字母表的顺序排列
	public static boolean isSorted(String[] a) {
		for(int i = 1;i<a.length;i++) {
			if(a[i-1].compareTo(a[i])>0) {
				return false;
			}
		}
		return true;
	}
	

}
