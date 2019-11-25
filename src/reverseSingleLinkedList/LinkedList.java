package reverseSingleLinkedList;

public class LinkedList {

	private Node head;
	
	public LinkedList(Node n) {
		head = n;
	}
	
	Node reverse(Node node) {
		
		Node prev = null;
		Node current = node;
		Node next = null;
		
		while (current != null) {
			//Store what the next element in the list should have been...
			next = current.getNext();
			//Set the next element to what the previous element was...
			current.setNext(prev);
			
			//Set the counters for the next iteration
			prev = current;
			current = next;
		}
		
		return prev;
	}
	
	public Node getHead() {
		return head;
	}
		
	void printContentsOfList(Node node) {
		
		while (node != null) {
			System.out.println(node.getData() + " ");
			node = node.getNext();
		}
	}
}
