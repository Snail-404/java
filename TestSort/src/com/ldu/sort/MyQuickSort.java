package com.ldu.sort;

public class MyQuickSort {
	static int count = 0;

	public static void main(String[] args) {
		//int[] a = { 49, 38, 65, 12, 45, 5 };
		int[] a={3,2,1,4,6,8,5,10,7,9};
		MyQuickSort mqs = new MyQuickSort();
		mqs.judge(a);
		//mqs.quickSort(a, 0, a.length - 1);
		System.out.println("------------------");
		System.out.println(count);
	}

	public void judge(int[] a) {
		if (a == null) {
			System.out.println("input error");
			return;
		}

		quickSort(a,0,a.length-1);
	}

	public void quickSort(int[] a, int start, int end) {
		if (start >= end) {
			return;
		}
		int i = start;
		int j = end;
		int value = a[i];
		boolean flag = true;

		while (i != j) {
			if (flag) {
				if (value > a[j]) {
					swap(a, i, j);
					flag = false;

				} else {
					j--;
				}
			} else {
				if (value < a[i]) {
					swap(a, i, j);
					flag = true;
				} else {
					i++;
				}
			}
		}
		display(a);
		quickSort(a, start, j - 1);
		quickSort(a, i + 1, end);
	}

	public void swap(int[] a, int i, int j) {
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public void display(int[] a) {
		count++;
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.println();
	}
}
