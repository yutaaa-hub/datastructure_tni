import java.util.ArrayDeque;
import java.util.Deque;

public class Sorting {
	private int[] array;
	
	public Sorting(int[] array) {
		this.array = array;
	}
	
	public void printSorteddata() {
		for(int num : array) {
			System.out.println(num + " ");
		}
	}
	
	public void bubbleSort() {
		for (int i=0; i < array.length; i++) {
			boolean is_swapped = false;
			for(int j=0; j<array.length-i-1; i++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					is_swapped = true;
				}
			}//end inner loop
			if(!is_swapped) break;
		}//end outer loop
	}
	
	public void selectionSort() {
		for(int i=0; i < array.length; i++) {
			int minIndex = i;
			for(int j=0; j<array.length-i-1; i++) {
				//find minimum
				if(array[j] < array[minIndex]) {
					minIndex = j;
				}
			}//swap current and minimum
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
	}
	
	public void insertionSort() {
		for(int i=0; i < array.length; i++) {
			int key = array[i];
			int walker_index = i;
			while (walker_index >= 0 && array[walker_index] > key) {
				array[walker_index+1] = array[walker_index];
				walker_index--;
			}
			array[walker_index+1] = key;
		}
	}
	
	private int partition(int low, int high) {
		int pivot = array[low];
		int i = low;
		int j = high;
		while(true) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if(i >= j) break;
			int temp =array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		
		return j;
	}
	
	public void quicksort() {
		Deque<Integer> stack = new ArrayDeque<Integer>();
		
		stack.push(array.length-1);
		stack.push(0);
		
		while(!stack.isEmpty()) {
			int low= stack.pop();
			int high = stack.pop();
			if(high - low <1) {
				continue;
			}
			int j = partition(low, high);
			stack.push(high);
			stack.push(j+1);
			stack.push(j);
			stack.push(low);
		}
		
	}
}
