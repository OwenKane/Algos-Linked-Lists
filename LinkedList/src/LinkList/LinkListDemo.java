package LinkList;

public class LinkListDemo {
	
	public static void main(String[] args) {
		LinkList list = new LinkList();
		int length = 0;
		
		list.insertAtHead(5);
		list.insertAtHead(10);
		list.insertAtHead(2);
		list.insertAtHead(15);
		list.insertAtHead(19);
		list.insertAtHead(1);
		list.insertAtHead(23);
		list.insertAtHead(17);
		
		length = list.length();
		
		System.out.println( list);
		System.out.println("Length: " + length);
		
		//list.deleteFromHead(5);
		//list.deleteFromHead(10);
		
		System.out.println(list);
		
		if (list.find(17) != null) {
			System.out.println("Found data 12");
		} else {
			System.out.println("Data not Found");
		}
	}
}
