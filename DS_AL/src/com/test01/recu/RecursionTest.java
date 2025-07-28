package com.test01.recu;

import java.util.Scanner;

public class RecursionTest {
	//팩토리얼 함수 구현
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int n = sc.nextInt();
		//1. for문으로 구현
		int res = 1;
		for(int i=2;i<=n;i++) {
			 res *= i;
		}
		System.out.println("결과 : "+res);	 
		
		//2. 재귀함수
		
		int factoRes = factorial(n);
		System.out.println("제 귀여운 재귀함수 결과는? : "+factoRes);
		
	}
	
	//2. 재귀 함수 구현
	public static int factorial(int no) {
//		if(no==1) {
//			return 1; // 재귀함수 종료조건
//		}else {
//			return no*factorial(no-1);	//5*4*3*2 -> 1이면 종료.
//		}
		
		return (no==1)?1:no*factorial(no-1); //'사망'연산자로 한줄로 처리!!
	}
	
}
