package com.test05.sort;

public class SelectionSort {
	
	//선택정렬
	public static void main(String[] args) {
		int[] arr = {6,4,8,3,1,10,7};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		selectionSort(arr,arr.length);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
	}
	public static void selectionSort(int[] a, int n) {
		for(int i=0;i<n-1;i++) {
			int min=i;	//아직 정렬되지 않은 부분에서 가장 작은 요소의 인덱스를 저장할 변수
			for(int j=i+1;j<n;j++) {	//데이터 중 가장 작은 값을 찾아 인덱스를 min에 저장
				if(a[j]<a[min]) {
					min=j;
				}
			}
			//swap
			
			swap(a,i,min);
		}
	}
	public static void swap(int[] a, int i, int min) {
		int tmp = a[i];
		a[i] = a[min];
		a[min] = tmp;
	}
	
}
