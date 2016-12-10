import java.util.Iterator;


@SuppressWarnings("hiding")
public class RandomBag<Item> implements Iterable<Item>{
	@SuppressWarnings("unchecked")
	private Item[] bagArrays = (Item[]) new Object[1];
	private int N = 0;
	private void resize(int max){
		@SuppressWarnings("unchecked")
		Item[] temp = (Item[])new Object[max];
		for (int i = 0; i < N; i++) {
			temp[i] = bagArrays[i];
			bagArrays = temp;
		}
	}
	
	public boolean isEmpty(){
		return N == 0;
	}
	public int size(){
		return N;
	}
	public void add(Item item){
		if (N == bagArrays.length) resize(2*bagArrays.length);
		bagArrays[N+1] = item;
		N++;
	}
	

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator();
	}
	private class ListIterator implements Iterator<Item>{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			
			return null;
		}
		
	}
	

}
