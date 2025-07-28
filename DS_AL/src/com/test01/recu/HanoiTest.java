package com.test01.recu;

import java.util.Scanner;

public class HanoiTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		System.out.println(no);
		hanoi(no,1,3);
	}
	//no : 원판 개수, x : 시작 기둥, y목표 기둥
	//no개의 원판을 x에서 y로 이동
	public static void hanoi(int n, int x, int y) {	
		if(n>1) {
			hanoi(n-1,x,6-x-y);	//각각의 기둥번호를 1,2,3이라고 할 때 남는 기둥으로 해당 원판을 옮겨준다.
		}
		//System.out.println("원판 "+n+"을 "+x+"기둥에서 "+y+"기둥으로 옮김");
		System.out.println(x+" "+y);
		if(n>1) {
			hanoi(n-1, 6-x-y, y);
		}
	}
}




			     //313
		  //212 	    223
		//113 132	  121 113
