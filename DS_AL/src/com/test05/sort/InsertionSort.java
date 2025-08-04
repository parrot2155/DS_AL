package com.test05.sort;

//삽입 정렬
public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {6,4,1,7,3,9,8};
		insertionSort(arr,arr.length);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
	}

	public static void insertionSort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			int j;
			int tmp = a[i];	//ㅣㅂ교하려는 변수를 tmp에 보관해둔다.
			for(j=i;j>0&&a[j-1]>tmp;j--) {
				a[j] = a[j-1];
			}
			a[j] = tmp;
		}
	}
}
