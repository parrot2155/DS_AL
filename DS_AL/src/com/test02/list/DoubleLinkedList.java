package com.test02.list;

import java.util.Comparator;

public class DoubleLinkedList<E> {
	//노드
	class Node<E>{
		private E data;			//데이터를 저장할것임.
		private Node<E> prev;	//앞쪽 노드
		private Node<E> next;	//뒤쪽 노드에 대한 참조
		
		//생성자
		Node(){
			data = null;
			prev = this;
			next = this;
		}
		Node(E obj, Node<E> prev, Node<E> next){
			data = obj;
			this.prev = prev;
			this.next = next;
		}
		
	}
	
	private Node<E> head;
	private Node<E> crnt;
	
	//생성자
	public DoubleLinkedList() {
		head = crnt = new Node<E>(); //더미노드 생성
	}
	
	//기능 구현
	
	public boolean isEmpty() {
		return head.next == head;
	}
	public E search(E obj, Comparator<? super E> c){
		Node<E> ptr = head.next;
		
		while(ptr != head) {	//head.next가 head가 아니라면 탐색 하겠다.
			if( c.compare(obj, ptr.data)==0){	// 검색 성공
				crnt = ptr;
				return ptr.data;
			}
			ptr = ptr.next;
		}
		
		return null;	//검색 실패
	}
}
