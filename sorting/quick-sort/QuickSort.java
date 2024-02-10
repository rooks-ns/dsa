import java.util.Arrays;

class QuickSort {
  
  public static void main(String[] args) {
    
    int[] nums = new int[] {1,2,3,4,2,1,3,2,1,2,3,4,5,4,3,4,3,2,1};
    
    quickSort(nums, 0, nums.length - 1);

    System.out.println(Arrays.toString(nums));
  }

  private static void quickSort(int[] nums, int lo, int hi) {
    
    if(lo >= hi)  return;

    int pivot = partition(nums, lo, hi);

    quickSort(nums, lo, pivot - 1);
    quickSort(nums, pivot + 1, hi);
  }

  private static int partition(int[] nums, int lo, int hi) {
    
    int pivot = nums[lo];

    int i = lo + 1, j = hi;

    while(i <= j) {

      if(nums[i] < pivot)
        i++;
      else if(nums[j] >= pivot)
        j--;
      else {
        swap(nums, i, j);
        i++;
        j--;
      }

    }

    swap(nums, lo, i-1);

    return i-1;
  }

  private static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

}
