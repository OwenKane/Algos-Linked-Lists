package LinkList;

public class LinkList {
	private Node head;
	
	//creates a new node for the link list
	//sets this head to this node
	public void insertAtHead(int data) {
		Node newNode = new Node (data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}
	
	public void deleteFromHead(int data) {
		this.head = this.head.getNextNode();
	}
	
	public Node find (int data) {
		Node current = this.head;
		
		while(current != null) {
			if (current.getData() == data) {
				return current;
			}
			current = current.getNextNode();
		}
		return null;
	}
	
	
	public int length() {
		int length = 0;
		Node current = this.head;
		
		while(current != null) {
			length++;
			current = current.getNextNode();
		}
		
		return length;
	}
	
	@Override 
	public String toString() {
		String result = "{";
		Node current = this.head;
		
		while(current != null) {
			result += current.toString() + ",";
			current = current.getNextNode();
			
		}
		result += "}";
		
		return result;
	}
}
