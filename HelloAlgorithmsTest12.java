import java.util.Arrays;

class Recursion{
	public static String mystery(String s){
		int N = s.length();
		if (N <= 1) {
			return s;
		}
		String a = s.substring(0, N/2);
		String b = s.substring(N/2, N);
		return mystery(b) + mystery(a);
	}

	public static int rank(int key, int[] ranking, Counter counter){
		return rank(key, ranking, ranking.length - 1, 0, counter);
	}
	
	public static int rank(int key, int[] ranking, int hi, int lo, Counter counter){
		int mid = lo + (hi-lo) / 2;
		counter.increment();
		counter.increment();
		if (key < ranking[mid]) {
//			System.out.println(lo + "   " + mid);
			return rank(key, ranking, mid, lo, counter);
		}
		else if (key > ranking[mid]){
//			System.out.println(mid + "   " + hi);
			return rank(key, ranking, hi, mid, counter);
		}
		else return mid;
	}
}

class Counter{
	private String name;
	private int times = 0;
	public Counter(String name){
		this.name = name;
	}
	public void increment(){
		times++;
	}
	public int getter(){
		return times;
	}
	
}




public class HelloAlgorithmsTest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Recursion.mystery(args[0]));
		Counter BinarySearchCounter = new Counter("binaryResearchCounter");
		int[] ranking = {23, 50,10,99,18,23,
				98,
				84,
				11,
				10,
				48,
				77,
				13,
				54,
				98,
				77,
				77,
				68};
		Arrays.sort(ranking);
		Recursion.rank(48, ranking, BinarySearchCounter);
		System.out.println(BinarySearchCounter.getter());
		
		
		
		

	}

}
