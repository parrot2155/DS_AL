package com.test04.queue;

public class Queue {
	
	private int[] q;		//큐, 데이터 저장
	private int capacity;	//큐의 크기, 저장할 수 있는 최대 수
	private int num; 		//현재 데이터 개수
	private int front;		//맨 처음
	private int rear;		//맨 마지막
	
	//생성자
	public Queue(int size) {
		num = front = rear = 0;
		capacity = size;
		
		q = new int[capacity];
	}
	
	//enqueue : 큐에 데이터 삽입
	public int enqueue(int no) throws Exception {
		if(num >= capacity) {	//큐가 가득 찼다.
			System.out.println("[큐가 가득 찼다.]");
			throw new Exception();	
		}
		q[rear++]=no;
		num++;
		
		if(rear == capacity) {
			rear=0;
		}
		return no;
	}
	
	
	//dequeue : 큐에서 데이터 추출
	public int dequeue() throws Exception {
		if(num<=0) {
			System.out.println("[큐가 비었다.]");
			throw new Exception();
		}
		int val = q[front++];
		num--;
		if(front == capacity) {
			front = 0;
		}
		return val;
	}
	
	//맨 앞의 데이터 확인
	public int peek() throws Exception {
		if(num<=0) {
			System.out.println("[큐가 비었다.]");
			throw new Exception();
		}
		return q[front];
	}
	//큐를 비움
	public void clear() {
	    front = 0;
	    rear = 0;
	    num = 0;
	    for (int i = 0; i < capacity; i++) {
	        q[i] = 0;
	    }
	}
	
	
	//큐의 크기 확인
	public int size() {
		return q.length;
	}
	
	//큐에 저장된 데이터 수 확인
	public int data() {
		return num;
	}
	
	
	//비었는지?
	public boolean isEmpty() {
		return num<=0;
	}
	
	
	//가득찼는지?
	public boolean isFull() {
		return num>=capacity;
	}
	
	//큐의 모든 데이터 출력(front->rear 순으로)
	public void dump() {
		if(num<=0) {
			System.out.println("[큐가 비었다.]");
		}else {
			for(int i=0;i<num;i++) {
				System.out.print(q[(i+front)%capacity]+" ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
}
