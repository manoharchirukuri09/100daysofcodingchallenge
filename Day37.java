448. Find All Numbers Disappeared in an Array
  class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>(n);
        for(int num:nums){
            set.add(num);
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}
202. Happy Number
  class Solution {
    private int sumofsquares(int n){
        int sum =0;
        while(n>0){
            int last = n%10;
            sum += last*last;
            n = n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        //create the hashset
        HashSet<Integer> set = new HashSet<>();
        while(n !=1 && !set.contains(n)){
            set.add(n);
            n = sumofsquares(n);
        }
        return n==1;
    }
}
