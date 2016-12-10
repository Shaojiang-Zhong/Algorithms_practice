import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class TestQueue {
	
	public static void Josephus(int N, int M){
		Queue<Integer> survivor = new LinkedList<Integer>();
		for (int i = 0; i < N; i++) {
			survivor.offer(i);
		}
		for (int i = 0; ; i++) {
			if (survivor.size() == 1){break;}
			else{
				if ((i+1) % M == 0){
					System.out.println(survivor.peek());
					survivor.poll();
				}
				else{
					int temp = survivor.poll();
					survivor.offer(temp);
				}
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Josephus(7, 2);

	}

}
