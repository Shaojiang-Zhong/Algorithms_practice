
public class InsertionSort {
	
	public static void sort(double[] a){
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
				exch(a, j, j-1);
			}
		}
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
