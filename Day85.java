1089. Duplicate Zeros
   class Solution {
    public void duplicateZeros(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length && index < arr.length; i++) {
            if(arr[i] == 0){
                index+=2;
            } else {
                result[index] = arr[i];
                index++;
            }
        }
        for(int i=0; i<result.length; i++){
            arr[i] = result[i];
        }
    }
}

2465. Number of Distinct Averages
   class Solution {
	public static int distinctAverages(int[] nums) {

		int n = nums.length;
		int l = 0;
		int r = n-1;
		HashSet<Double> hs =  new HashSet<Double>();
		Arrays.sort(nums);


		while(l < r) {

			double avg =  (nums[l] + nums[r])/2.0;
			hs.add(avg);

			l++;
			r--;
		}

		return hs.size();
	}
}
