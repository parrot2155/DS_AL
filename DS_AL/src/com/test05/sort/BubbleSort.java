package com.test05.sort;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 6, 4, 8, 3, 1, 10, 7 };

		for (int num : arr) {
			System.out.print(num + " ");
		}

		System.out.println();

		bubbleSort(arr, arr.length);

		for (int num : arr) {
			System.out.print(num + " ");
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i = (m-n+1);i>0;i--) {
			Math.pow((m-n+1),(m-n+1));
		}
		
		
		
		
		
	}

	public static void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			int cnt = 0; // 조기종료할 조건에서 사용

//			for (int j = 0; j < n - 1 - i; j++) {
//				if (a[j] > a[j + 1]) {
//					// swap
//					int temp = a[j];
//					a[j] = a[j + 1];
//					a[j + 1] = temp;
//				}
//			}

			for (int j = n - 1; j > i; j--) {
				if (a[j] < a[j - 1]) {
					// swap
					int tmp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = tmp;
					cnt++;
				}

			}
			System.out.println(cnt);
			if (cnt == 0) {
				break; // 정렬 완료되어 더 이상 비교할 필요 없으면 종료
			}
		}
	}
}