
public class QuickSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		// TODO Auto-generated method stub
		sort(a, 0, a.length-1);
	}
	
	//helper method
	void sort(int a[], int bot, int top) {
		if (bot < top) {
			int pi = partition(a, bot, top);
			sort(a, bot, pi-1);
			sort(a, pi+1, top);
		}
	}
	
	int partition(int[] a, int bot, int top) {
		int i = (bot - 1);
		int pivot = a[top];

		for (int j=bot; j<top; j++) {
			if (a[j] <= pivot) {
				i++;
				int tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
			}
		}
		int tmp = a[i+1];
		a[i+1] = a[top];
		a[top] = tmp;
		
		return i+1;
	}

}
