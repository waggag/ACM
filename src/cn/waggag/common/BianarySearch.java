package cn.waggag.common;

public class BianarySearch {

	/*
	 * 最简单的二分搜索
	 */
	public static int binarySearch1(int key, int[] array) {
		int lo = 0;
		int hi = array.length - 1;
		int mid = (lo + hi) / 2;
		while (lo < hi) {
			if (key < array[mid]) {
				hi = mid - 1;
			} else if (key > array[mid]) {
				lo = mid + 1;
			} else if (key == array[mid]) {
				return mid;
			}
		}
		return -1;
	}

	// 效率更高的二分搜索
	public static int bianarySearch2(int key, int[] array) {

		int lo = 0;
		int hi = array.length;
		int mid = (lo + hi) / 2;

		while (lo < hi) {
			if (key == array[mid]) {
				return mid;
			} else if (key > array[mid]) {
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return -1;

	}

}
