
public class ArrayST {
	private double[] keys;
	private double[] values;
	ArrayST (int N){
		keys = new double[N];
		values = new double[N];
	}
	public void put(double key, double values){
		for (int i = 0; i < keys.length; i++){
			if (key == keys[i]) keys[i] = values;break;
			
		}
	}
}
