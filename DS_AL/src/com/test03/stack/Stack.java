package com.test03.stack;

//정수를 저장하여 관리하는 stack
public class Stack {	
	private int[] s;		//스택 저장용 배열
	private int capacity;	//스택의 용량
	private int ptr;		//포인터, 스택에 저장된 데이터 수
	
	//생성자
	public Stack(int size) {
		ptr=0;
		capacity = size;
		
		s = new int[capacity];
	}
	
	//push : 데이터 삽입
	public int push(int no) throws Exception {
		if(ptr >= capacity) {
			//스택이 가득 참
			System.out.println("[스택이 가득 찼다.]");
			throw new Exception();	//예외를 발생시키며 종료하기
		}
		
		return s[ptr++] = no;
	}
	
	//pop : 데이터 추출
	public int pop() throws Exception {
		if(ptr <= 0 ) {	//스택이 비었다.
			System.out.println("[스택이 비었다.]");
			throw new Exception();
		}
		int res = s[--ptr];
		return res;
	}
	
	//peek : 스택의 정상에 있는 데이터 확인
	public int peek() throws Exception {
		if(ptr<=0) {
			System.out.println("[스택이 비었다.]");
			throw new Exception();
		}
		return s[ptr-1];
	}
	
	//size : 스택에 저장된 데이터 갯수 확인
	public int size() {
		return ptr;
		
	}
	
	//isEmpty : 스택이 비어있는지 확인
	public boolean isEmpty() {
		return ptr<=0;
	}
	
	
	//isFull
	public boolean isFull() {
		return ptr>=capacity;
	}
	
	//clear : 스택 비우기
	public void clear() {
		ptr=0;
	}
	
	//스택에서 no를 찾아 인덱스 리턴
	public int indexOf(int no) {
		for(int i=0;i<ptr;i++) {
			if(s[i]==no) {
				return i;
			}
		}
		return -1;			//검색 실패
	}
	
	
	//스택에 모든 저장된 데이터 확인(바닥->피크)
	public void dump() {
		if(isEmpty()) {
			System.out.println("스택이 비었다.");
		}else {
			for(int i=0;i<ptr;i++) {
				System.out.print(s[i]+" ");
			}
			System.out.println();
		}
		
	}
}













