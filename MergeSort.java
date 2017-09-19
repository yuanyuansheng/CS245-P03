
public class MergeSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		// TODO Auto-generated method stub
		if (a.length > 1) {
			int[] top = topHalf(a);
			int[] bot = botHalf(a);
			
			sort(top);
			sort(bot);
			merge(a, top, bot);
		}
		
	}
	
	public static int[] topHalf(int[] a) {
		int size1 = a.length/2;
		int[] top = new int[size1];
		for (int i = 0; i < size1; i++) {
			top[i] = a[i];
		}
		return top;
	}

	public static int[] botHalf(int[] a) {
		int size1 = a.length/2;
		int size2 = a.length - size1;
		int[] bot = new int[size2];
		for (int i = 0; i < size2; i++) {
			bot[i] = a[i+size1];
		}
		return bot;
	}
	
	public static void merge(int[] result, int[] top, int[] bot) {
		int i1 = 0;
		int i2 = 0;
		
		for (int i = 0; i < result.length; i++) {
			if (i2 >= bot.length || (i1 < top.length && top[i1] <= bot[i2])) {
				result[i] = top[i1];
				i1++;
			} else {
				result[i] = bot[i2];
				i2++;
			}
		}
	}
}
