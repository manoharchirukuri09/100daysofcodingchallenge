209. Minimum Size Subarray Sum
    class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, s = 0, m = Integer.MAX_VALUE;
        for (int r = 0; r < nums.length; r++) {
            s += nums[r];
            while (s >= target) {
                m = Math.min(m, r - l + 1);
                s -= nums[l++];
            }
        }
        return (m == Integer.MAX_VALUE) ? 0 : m;
    }
}

350. Intersection of Two Arrays II
  class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        List<Integer> intersection = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                intersection.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[intersection.size()];
        for (int k = 0; k < intersection.size(); k++) {
            result[k] = intersection.get(k);
        }
        
        return result;
    }
}
