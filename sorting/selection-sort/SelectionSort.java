import java.util.Arrays;

class SelectionSort {
	
	public static void main(String[] args) {
		
		int[] nums = new int[] {8,3,4,5,6,3,2,1,1,2,3,4,6,5,4,6,7,8,7,6,5,4,3};
		selectionSort(nums);
		System.out.println(Arrays.toString(nums));
	}

	private static void selectionSort(int[] nums) {
		
		int n = nums.length;

		for(int i=0; i<n; ++i) {

			int currentMinIndex = i; 

			for(int j = i + 1; j < n; ++j) {
				
				if(nums[j] < nums[currentMinIndex]) {
					currentMinIndex = j;
				}
			}

			if(currentMinIndex != i) {
				swap(nums, currentMinIndex, i);
			}
		}
	}

	private static void swap(int[] nums, int i, int j) {
		
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
