package reverseSingleLinkedList;

/*
 * Single linked list. Contains data and a pointer to the next element of the list.
 */
public class Node {
	
	private int data;
	private Node next;
	
	public Node(int d) {
		data = d;
		next = null;
	}
	
	public int getData() {return data;}
	
	public Node getNext() {return next;}
	public void setNext(Node n) { next = n;}

}
