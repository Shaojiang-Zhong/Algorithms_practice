class Node{
	char c;
	Node next;
}
public class MoveToFront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] targetArray = args[0].toCharArray();
		Node first = new Node();
		first.c = targetArray[0];
		first.next = null;
		for (int i = 1; i < targetArray.length; i++) {
			
			for (Node x = first; x.next != null; x = x.next){
				if (x.next.c == targetArray[i]) {
					x.next = x.next.next;
					break;
					}
			}
		
			Node oldFirst = first;
			first = new Node();
			first.c = targetArray[i];
			first.next = oldFirst;

		}
		for (Node x = first; x != null; x = x.next) { System.out.print(x.c + " ");}

	}

}
