735. Asteroid Collision
  class Solution {
    public int[] asteroidCollision(int[] asteroids) {
      int n = asteroids.length;
      ArrayList<Integer> ans = new ArrayList<>();
       for(int i=0;i<n;i++){
          if(asteroids[i]>0){
            ans.add(asteroids[i]);
          }
          else{
            while(!ans.isEmpty() && ans.size()>0 && ans.get(ans.size()-1)>0 && ans.get(ans.size()-1)<Math.abs(asteroids[i])){
                ans.remove(ans.size()-1);
            }
            //both are equal
            if(!ans.isEmpty() && ans.get(ans.size()-1)==Math.abs(asteroids[i])){
                ans.remove(ans.size()-1);
            }else if (ans.isEmpty() || ans.get(ans.size()-1)<0){
                ans.add(asteroids[i]);
            }
          }
       }
       int[]result = new int[ans.size()];
       for(int i=0;i<ans.size();i++){
        result[i] = ans.get(i);
       }  
       return result;
    }
}

402. Remove K Digits
  class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<num.length();i++){
            char digit = num.charAt(i);
            while(!st.isEmpty() && k>0 &&st.peek()>digit){
                st.pop();
                k--;
            }
            st.push(digit);
        }
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }
        //edge cases
        if(st.isEmpty()){
            return "0";
        }
        StringBuilder result = new StringBuilder();

        while(!st.isEmpty()){
            result.append(st.pop());
        }
        //remove the zero and the end 00100 ---> 100
        while(result.length()>0 && result.charAt(result.length()-1) == '0'){
            result.deleteCharAt(result.length()-1);
        }
        result.reverse();
        if(result.length()==0){
            return "0";
        }
        return result.toString();
    }
}
