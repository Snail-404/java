package com.ldu.sort;

public class QuickSort {
	public void quick_sort(int[] a, int lenght) {
		if (null == a || lenght < 1) {
			System.out.println("input error!");
			return;
		}
		_quick_sort(a, 0, lenght - 1);
	}

	public void _quick_sort(int[] a, int start, int end) {
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
		snp(a);
		_quick_sort(a, start, j - 1);
		_quick_sort(a, i + 1, end);

	}

	public void snp(int[] a) {
		count++;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	private void swap(int[] a, int i, int j) {
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	static int count=0;
	public static void main(String args[]) {
		QuickSort q = new QuickSort();
		int[] a = { 49, 38, 65, 12, 45, 5 };
		//q.quick_sort(a, 6);
		q._quick_sort(a,0,a.length-1);
		System.out.println("--------------");
		System.out.println(count);
	}

}