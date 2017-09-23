package com.ldu.sort;

/*
 * √∞≈›≈≈–Ú
 */
public class TestMaoPao {
	public static void main(String[] args) {
		int[] arr={3,2,6,10,4,1,7,8,9,5};
		System.out.print("≈≈–Ú«∞:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		
		int temp;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println();
		//±È¿˙
		System.out.print("≈≈–Ú∫Û:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}
}
