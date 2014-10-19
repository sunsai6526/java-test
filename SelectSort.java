package 排序;

public class SelectSort {
	
	public static void selectSort(int[] a, int low, int hig) {
		
		int min = 0;
		
		for(int  i =0; i < hig; i++) {
			for(int j = i + 1; j <= hig;j++) {
				if(a[j] < a[min]) min = j;
			}
			
			QuickSort.swap(a, min, i);
			min = i + 1;
		}
	}

}
