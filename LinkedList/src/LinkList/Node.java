package LinkList;

public class Node {
	private int data;
	private Node nextNode;
	
	
	//accessors for class Node
	public Node(int data) {
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}
	
	public Node getNextNode() {
		return this.nextNode;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	@Override 
	public String toString() {
		return "Data: " + this.data;
	}
			
}
