package com.test05.sort;

public class QuickSort {
	//퀵정렬
	//피벗이라는 기준값이 있고, 피벗을 기준으로 대소 관계를 좌우로 나눈다.
	public static void main(String[] args) {
		int[] arr = {5,8,4,2,3,1,3,9,7};
		quickSort(arr,0,arr.length-1);
		
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

		System.out.println();
		

	}
	public static void quickSort(int[] a, int left, int right) {
		int lc = left;
		int rc = right;
		int x = a[(lc+rc)/2];
		
		do {
			
			while(a[lc]<x) {	//피벗보다 적으면 lc ++시키다 피벗보다 큰 값을 찾으면 스탑.
				lc++;
			}
			while(a[rc]>x) {
				rc--;
			}
			
							//두 와일문 종료 => 피벗 왼쫏에서 큰 값을 찾았다.
												//피벗  오른쪽에서 피벗보다 작은 값을 찾았다.
			
			if(lc<=rc) {
				int tmp = a[lc];
				a[lc] = a[rc];
				a[rc] = tmp;
				lc++;
				rc--;
			}
			
			
		}while(lc<=rc);
		
		if(left<rc) {
			quickSort(a,left,rc);
		}
		if(right>lc) {
			quickSort(a,lc,right);
		}
		
		
		
		
	}

}
