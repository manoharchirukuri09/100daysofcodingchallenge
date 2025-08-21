594. Longest Harmonious Subsequence
   class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxLen = 0;
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                maxLen = Math.max(maxLen, map.get(key) + map.get(key + 1));
            }
        }
        return maxLen;
    }
}

658. Find K Closest Elements
   
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<Integer>();  
        int low = 0;                                    
        int high = arr.length - 1;                            
        while(high - low >= k){                         
            int distLow = Math.abs(arr[low] - x);       
            int distHigh = Math.abs(arr[high] - x);              
            if(distLow <= distHigh)                    
                high--;                                 
            else                                        
                low++;                                  
        }
        while(low <= high)                              
            list.add(arr[low++]);                          
        return list;  
    }                                  
}
