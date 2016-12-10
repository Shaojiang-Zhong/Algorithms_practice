import java.util.Iterator;


public class Deque<Item> implements Iterable<Item>{
	
	private Item[] itemArrays = (Item[]) new Object[1];
	private int N = 0;
	private void resize(int max){
		Item[] temp = (Item[])new Object[max];
		for (int i = 0; i < N; i++) {
			temp[i] = itemArrays[i];
			itemArrays = temp;
		}
	}
	
	

	public boolean isEmpty() { return N==0; }
	public int size() { return N;}
	public void pushLeft(Item item){
		if (N == itemArrays.length) resize(2*itemArrays.length);
		for (int i = N; i > -1; i--) {
			itemArrays[i+1] = itemArrays[i];
		}
		itemArrays[0] = item;
		N++;
		
	}
	public void pushRight(Item item){
		if (N == itemArrays.length) resize(2*itemArrays.length);
		itemArrays[N + 1] = item;
		N++;
	}
	public Item popLeft(){
		Item tmp = itemArrays[0];
		for (int i = 0; i < N - 1; i++) {
			itemArrays[i] = itemArrays[i + 1];
		}
		itemArrays[N] = null;
		N--;
		if (N > 0 && N == itemArrays.length/4) resize( itemArrays.length / 2 );
		return tmp;
	}
	public Item popRight(){
		Item tmp = itemArrays[N];
		itemArrays[N] = null;
		N--;
		if (N > 0 && N == itemArrays.length/4) resize( itemArrays.length / 2 );
		return tmp;
	}
	
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
