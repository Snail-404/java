package com.ldu.sort;
/*
 * 快速选择排序
 */
public class TestZhijieXuanze {
	public static void main(String[] args) {
		int[] arr = new int[] { 3, 2, 1, 10, 6, 4, 5, 9, 7, 8 };
		int temp;

		System.out.print("排序前：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}

		for (int i = 0; i < arr.length - 1; i++) {
			int t = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[t] > arr[j]) {
					t = j;
				}
			}
			if (t != i) {
				temp = arr[t];
				arr[t] = arr[i];
				arr[i] = temp;
			}
		}

		System.out.println();
		System.out.print("排序后：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}

	}
}
