import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
	
		Scanner cin2 = new Scanner(new BufferedInputStream(System.in));
		while (cin2.hasNext()){
			int n = cin2.nextInt();
			int k = cin2.nextInt();
			int totalTime = 0;
			int totalSize = 0;
			int[] sizeArray = new int[n];
			int capacity = 0;
			int remain = 0;
			int begin = 0;
			for (int i = 0; i < sizeArray.length; i++) {
				sizeArray[i] = cin2.nextInt();
			}
			if (k >= n) {
				for (int i = 0; i < sizeArray.length; i++) {
					totalTime = totalTime + sizeArray[i];
				}
				System.out.println(totalTime);
			}
			else {
				Arrays.sort(sizeArray);
				if ((n-k)%(k-1) == 0) {
					capacity = (n-k) / (k-1) +1;
					for (int i = 0; i < k; i++) {
						totalSize = totalSize + sizeArray[i];
					}
					totalTime = totalTime + totalSize;
					for (int i = k; i < n; i = i + k -1) {
						for (int j = 0; j < k-1; j++) {
							totalSize = totalSize + sizeArray[i+j];
						}
						totalTime = totalTime + totalSize;
					}
					System.out.println(totalTime);
				}
				else {
					capacity = (n - k) / (k-1) + 2;
					remain = n - k - (capacity-2)*(k-1);
					begin = k - (k-1 - remain);
					for (int i = 0; i < begin; i++) {
						totalSize = totalSize + sizeArray[i];
					}
					totalTime += totalSize;
					for (int i = begin; i < n; i = i + k - 1) {
						for (int j = 0; j < k - 1; j++) {
							totalSize = totalSize + sizeArray[i + j];
						}
						totalTime = totalTime + totalSize;
					}
					System.out.println(totalTime);
				}
				
			}
				

	}
	}

}
