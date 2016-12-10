import java.util.Iterator;


public class GeneralizeQueue<Item> implements Iterable<Item>{
	private Node first;
	private Node last;
	private int N = 0;
	private class Node{
		Item item;
		Node next;
	}
	public boolean isEmpty(){
		return N == 0;
	}
	public void insert(Item x){
		Node oldlast = last;
		last = new Node();
		oldlast.next = last;
		last.next = null;
		last.item = x;
		N++;
	}
	public Item delete(int k){
		Node previous = deleteRecursion(first, k);
		Node target = previous.next;
		previous.next = target.next;
		return target.item;
	}
	private Node deleteRecursion(Node x, int k){
		if (k == 2) return x;
		return deleteRecursion(x.next, --k);
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
