package com.test06.tree;

public class MTest {

	public static void main(String[] args) {
		BinarySearchTree<Integer, Data> tree = new BinarySearchTree<>();
		
		tree.add(5, new Data(5,"ptw"));
		tree.add(10, new Data(10,"jsd"));
		tree.add(1, new Data(1,"kse"));
		tree.add(12, new Data(12,"kkk"));
		tree.add(8, new Data(8,"hhh"));
		tree.add(9, new Data(9,"qwer"));
		tree.print();
		
		System.out.println("-------------------");
		tree.remove(5);
		tree.print();
		
		System.out.println("search: "+tree.search(9));
		
	}

}

class Data{
	private Integer no;
	public String name;
	public Data(Integer no, String name) {
		this.no = no;
		this.name = name;
	}
	Integer keyCode() {
		return no;
	}
	public String toString() {
		return name;
	}
}