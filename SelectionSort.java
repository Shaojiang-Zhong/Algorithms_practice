
public class SelectionSort {
	
	public static void sort(double[] a){
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i+1; j < a.length; j++) {
				if (less(a[j], a[min])) {
					min = j;
				}
			}
			exch(a, i, min);
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
