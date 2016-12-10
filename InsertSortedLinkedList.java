
public class InsertSortedLinkedList {
	class Node{
		Item value;        //定义值为Item型。实际运用可以具体定义。
		Node next;
		public Node(Item value, Node next) {
			// TODO Auto-generated constructor stub
			this.value = value;
			this.next = next;
		}
	}
	
	public static void Insert(Node first , Node x){
		Item value = x.value;
		if (value.compareTo(first.value) != 1){
			x.next = first;
			first = x;
		}
		for (Node y = first; y != null; y = y.next) {
			if (y.next == null){		
					y.next = x;
			}
			else{
				if (value.compareTo(y.next.value) != 1){
					Node tmp = y.next;
					y.next = x;
					x.next = tmp;
				}
			}
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
