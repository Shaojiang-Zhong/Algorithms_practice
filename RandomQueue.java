import java.util.Iterator;


public class RandomQueue<Item> implements Iterable<Item>{
	private Item[] queueArrays = (Item[]) new Object[1];
	private int N = 0;
	private void resize(int max){
		Item[] temp = (Item[])new Object[max];
		for (int i = 0; i < N; i++) {
			temp[i] = queueArrays[i];
			queueArrays = temp;
		}
	}
	
	public boolean isEmpty() {return N==0;}
	public void enqueue(Item item){
		if (N == queueArrays.length) resize(2*queueArrays.length);
		queueArrays[N+1] = item;
		N++;
	}
	public Item dequeue(){
		Item tmp = queueArrays[0];
		for (int i = 0; i < N - 1; i++) {
			queueArrays[i] = queueArrays[i + 1];
		}
		queueArrays[N] = null;
		N--;
		if (N > 0 && N == queueArrays.length/4) resize( queueArrays.length / 2 );
		return tmp;
	}
	public Item Sample(){
		return queueArrays[(int) (Math.random()*(N+1))];
	}
	

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
