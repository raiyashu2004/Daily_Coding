package linkedList;

public class LinkedListUse {
	
	public static takeinput() {
		
	}
	
	public static void print(Node<Integer>head) {
		while(head != null) {
			System.out.print(head.data + " " );
			head = head.next;
		}
		
	}

	public static void main(String[] args) {
		Node<Integer> node1 = new Node<Integer>(10);
		Node<Integer> node2 = new Node<Integer>(5);
		Node<Integer> node3 = new Node<Integer>(10);
		node1.next = node2;
		node2.next = node3;
		Node<Integer> head = node1;
		print(head);
		
	

	}

}
