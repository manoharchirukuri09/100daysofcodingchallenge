1539. Kth Missing Positive Number
  class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            int missing = arr[mid] - (mid+1);
            if(missing<k){
                low = mid+1;
            }else{
                high = mid-1;
            }

        }
        return high + k+1;
    }
}

1346. Check If N and Its Double Exist
  public class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
          for (int num : arr) {
             if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
