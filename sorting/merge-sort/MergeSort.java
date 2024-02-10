import java.util.Arrays;

class MergeSort {
  public static void main(String[] args) {
    int[] nums = new int[]{2,3,2,1,3,4,5,6,7,6,5,5,4,3,3,2,1,2,3,4,5,5,6,6,6,6,5,4,3,1};
    mergeSort(nums, 0, nums.length - 1);
    System.out.println(Arrays.toString(nums));
  }

  private static void mergeSort(int[] nums, int lo, int hi) {
  
    if(lo >= hi)  return;

    int mid = lo + (hi - lo) / 2;

    mergeSort(nums, lo, mid);
    mergeSort(nums, mid + 1, hi);
    merge(nums, lo, mid, hi);
  }

  private static void merge(int[] nums, int lo, int mid, int hi) {
    
    int[] auxNums = new int[hi - lo + 1];

    int i = lo, j = mid + 1, index = 0;

    while(i <= mid && j <= hi) {
      
      if(nums[i] < nums[j]) 
        auxNums[index] = nums[i++];
      else
        auxNums[index] = nums[j++];

      index++;
    }

    while(i <= mid)
      auxNums[index++] = nums[i++];

    while(j <= hi)
      auxNums[index++] = nums[j++];

    for(int num : auxNums) {
      nums[lo++] = num;
    }

  }

}
