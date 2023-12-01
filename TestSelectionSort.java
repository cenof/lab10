package lab10v2;





import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestSelectionSort {

	@Test
	public void test() {
		//testPositive();
		//testNegative();
		//testMixed();
		testDuplicates();
	
	}

	//void testPositive() {
	//	SelectionSort selection = new SelectionSort();
	//	int[] arr = new int [] {9,11,2,6,5};
	//	int[] sorted = new int[] {2,5,6,9,11};
		
	//	selection.basicSelectionSort(arr);
		
	//	assertArrayEquals(arr, sorted);
		
	//}
//	void testNegative() {
	//	SelectionSort selection = new SelectionSort();
	//	int[] arr = new int [] {-1,-6,-2,-14,-8};
	//	int[] sorted = new int[] {-14,-8,-6,-2,-1};
	//	
	//	selection.basicSelectionSort(arr);
		
	//	assertArrayEquals(arr, sorted);
		
//	}
//	void testMixed() {
	//		SelectionSort selection = new SelectionSort();
	//		int[] arr = new int [] {0,6,-2,14,-8};
	//		int[] sorted = new int[] {-8,-2,0,6,14};
	//		
	//		selection.basicSelectionSort(arr);
	//		
	//		assertArrayEquals(arr, sorted);
	//		
	//	}
	void testDuplicates() {
		SelectionSort selection = new SelectionSort();
		int[] arr = new int [] {0,6,-2,14,0,-8,6,-8};
		int[] sorted = new int[] {-8,-8,-2,0,0,6,6,14};
		
		selection.basicSelectionSort(arr);
		
		assertArrayEquals(arr, sorted);
		
	}
}
