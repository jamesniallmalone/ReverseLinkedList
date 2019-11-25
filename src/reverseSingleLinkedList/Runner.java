package reverseSingleLinkedList;

public class Runner {

	public static void main(String[] args) {
		LinkedList list = new LinkedList(new Node(85));
		
		list.getHead().setNext(new Node(400));
		list.getHead().getNext().setNext(new Node(2));
		list.getHead().getNext().getNext().setNext(new Node(20));
		
		list.printContentsOfList(list.getHead());
		
		System.out.println("================================================");
		
		list.printContentsOfList(list.reverse(list.getHead()));
		
		
	}
}
