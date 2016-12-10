import java.util.Iterator;

class Stack<Item> implements Iterable<Item>{
	int N = 0;
	private Item[] stackArrays;
	class Node {
		Item item;
		Node next;
	}
	public Stack(Stack s) {
		// TODO Auto-generated constructor stub
		stackArrays =  (Item[]) new Object[s.stackArrays.length];
		for (int i = 0; i < stackArrays.length; i++) {
			stackArrays[i] = (Item) s.stackArrays[i];
		}
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
public class CopyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
