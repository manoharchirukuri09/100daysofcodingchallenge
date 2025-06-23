4. Median of Two Sorted Arrays
  class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;

        int ind1 = (n - 1) / 2;  // First median index
        int ind2 = n / 2;        // Second median index

        int i = 0, j = 0, cnt = 0;
        int ele1 = 0, ele2 = 0;

        while (i < n1 && j < n2) {
            int val;
            if (nums1[i] < nums2[j]) {
                val = nums1[i++];
            } else {
                val = nums2[j++];
            }

            if (cnt == ind1) ele1 = val;
            if (cnt == ind2) ele2 = val;
            cnt++;
        }

        while (i < n1) {
            int val = nums1[i++];
            if (cnt == ind1) ele1 = val;
            if (cnt == ind2) ele2 = val;
            cnt++;
        }

        while (j < n2) {
            int val = nums2[j++];
            if (cnt == ind1) ele1 = val;
            if (cnt == ind2) ele2 = val;
            cnt++;
        }

        if (n % 2 == 0) {
            return (ele1 + ele2) / 2.0;
        } else {
            return ele2;
        }
    }
}


162. Find Peak Element
  class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;

        int low = 0;
        int high = n - 1;

        while(low < high){
            int mid = low + (high - low) / 2;

            if(nums[mid] > nums[mid + 1]){
                // You're on the decreasing slope, move left
                high = mid;
            } else {
                // You're on the increasing slope, move right
                low = mid + 1;
            }
        }

        return low; 
    }
}
