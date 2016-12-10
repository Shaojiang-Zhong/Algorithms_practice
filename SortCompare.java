
public class SortCompare {
	
	private static double time(String alg, double[] a){
		double startTime = System.currentTimeMillis();
		System.out.println(startTime);
		if (alg.equals("SelectionSort")) 	{SelectionSort.sort(a);}
		if (alg.equals("InsertionSort")) 	{InsertionSort.sort(a);}
		if (alg.equals("MergeSort")) 		{MergeSort.sort(a);}
//		if (alg.equals("InsertionSort")) {InsertionSort.sort(a);}
//		if (alg.equals("SelectionSort")) {SelectionSort.sort(a);}
//		if (alg.equals("InsertionSort")) {InsertionSort.sort(a);}
		double endTime = System.currentTimeMillis();
		System.out.println(endTime);
		return endTime - startTime;
	}
	
	private static double timeRandomInput(String alg, int N, int T){
		double total = 0.0;
		double[] a = new double[N];
		for (int i = 0; i < T; i++) {
			for (int j = 0; j < N; j++) {
				a[i] = Math.random();
			}
			total += time(alg, a);
		}
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String alg1 = args[0];
		final String alg2 = args[1];
		final String alg3 = args[2];
		final int arrayLength = Integer.parseInt(args[3]);
		final int times = Integer.parseInt(args[4]);
		double t1 = timeRandomInput(alg1, arrayLength, times);
		double t2 = timeRandomInput(alg2, arrayLength, times);
		double t3 = timeRandomInput(alg3, arrayLength, times);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		


	}

}
