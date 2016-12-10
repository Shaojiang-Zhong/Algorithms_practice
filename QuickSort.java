public class QuickSort {
	
	public static void sort(double[] a, int lo, int hi){
		if (hi <= lo) return;
		int j = partition(a, lo, hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);
	}
	private static int partition(double[] a, int lo, int hi){
		int i = lo;
		int j = hi + 1;
		double v = a[lo];
		while (true){
			while (less(a[++i], v)) if(i == hi) break;
			while (less(v, a[--j])) if(j == lo) break;
			if (i >= j ) break;
			exch(a , i , j);
		}
		exch(a, lo, j);
		return j;
	}
	private static boolean less(double v, double w) {
		// TODO Auto-generated method stub
		return v < w;
	}
	private static void exch(double[] a, int i, int j){
		double t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

}