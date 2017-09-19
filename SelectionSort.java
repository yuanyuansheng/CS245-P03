
public class SelectionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < a.length; j++) {
				if (a[j] < a[minIndex]) {
					minIndex = j;
				}
			}
			int tmp = a[minIndex];
			a[minIndex] = a[i];
			a[i] = tmp;
		}
		
	}

}
