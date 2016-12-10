
public class TestLinkedList {
	
	private class Node{
		String s;
		Node next;
		Node previous;
	}
	
	
	public static void delete(int k, Node first){
		for (Node x = first; x!=null; x = x.next) {
			int i = 0;
			if (i == k-1) {
				x.next = x.next.next;
				break;
			}
		}
		System.out.println("error");
	}
	public static boolean find(String key, Node first){
		for (Node x = first; x != null; x = x.next){
			if (x.s == key) {
				return true;
			}
		}
		return false;
	}
	public static void removeAfter(Node x){
		if (x.next != null) {
			x.next = null;
		}
	}
	public static void insertAfter(Node front, Node back){
		if(front != null && back != null){
			back.next = front.next;
			front.next = back;
		}
		
	}
	public static void remove(Node first, String key){
		for (Node x = first; x != null; x = x.next){
			if (x.next.s == key) {
				x.next = x.next.next;
			}
		}
	}
	
	public static Node reverse(Node first){
		Node second = first.next;
		Node last = null;
		for (Node x = first; x != null; x = x.next) {
			if (x.next == null) {
				last = x;
				break;
			}
		}
		return reverse(first, second, last);
	}
	public static Node reverse(Node first, Node second, Node last){
		
		
		first.next = last;
		last = first;
		if (second == null){return last;}
		first = second;
		second = first.next;
		return reverse(first, second, last);
		
	}
	public static void insertAtFirst(Node first, String key){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (Node x = first; x != null; x = x.next) {
//			if (x.next.next == null){
//				x.next = null;
//			}
//		}

	}

}
