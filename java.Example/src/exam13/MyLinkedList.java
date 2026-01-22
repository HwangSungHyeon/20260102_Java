package exam13;

public class MyLinkedList {
	
	private Node head;
	private int size = 0;
	
	private class Node{
		Object data;
		Node next;
		
		Node(Object input){
			this.data = input;
			this.next = null;
		}
	}
	
	// 새로운 노드를 만들고 맨 앞에 붙이는 원리
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public Object get(int index) {
		Node temp = head;
		for(int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp.data;
	}
	
	public String toString() {
		if(head == null) return "[]";
		
		Node temp = head;
		String str = "[";
		while(temp.next != null) {
			str += temp.data + ", ";
			temp = temp.next;
		}
		return str + temp.data + "]";
	}
	
	public void add(int index, Object input) {
		if(index == 0) {
			addFirst(input);
			return;
		}
		Node newNode = new Node(input);
		// 1. 삽입할 위치의 바로 전 노드를 찾음
		Node prev = head;
		for(int i = 0; i < index; i++) {
			prev = prev.next;
		}
		// 2. 새로운 노드의 연결 고리를 먼저 설정
		newNode.next = prev.next;
		// 3. 이전 노드가 새로운 노드를 가리키게함
		prev.next = newNode;
		size++;
	}
	
	public Object remove(int index) {
		if(index == 0) {
			Object data = head.data;
			head = head.next;
			size--;
			return data;
		}
		
		Node prev = head;
		for(int i = 0; i < index-1; i++) {
			prev = prev.next;
		}
		Node toDelete = prev.next;
		prev.next = toDelete.next;
		Object returnData = toDelete.data;
		toDelete = null;
		size--;
		return returnData;
				
	}
	
	
}
