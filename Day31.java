3304. Find the K-th Character in String Game I
   class Solution {
    char ans ='a';
    public void operation(String str,int k){
        if(str.length() >= k ){
            ans = str.charAt(k-1);
            return;
        }
        String newstr = "";
        for(int i=0;i<str.length();i++){
            newstr += (char) ( str.charAt(i) + 1);
        }
        operation(str+ newstr, k );
    }
    public char kthCharacter(int k) {
        operation("a", k);
        return ans;
    }
}

3483. Unique 3-Digit Even Numbers
  class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> ans = new HashSet<>();
        int len = digits.length;
        recurse(0, 0, 0, digits, len, ans);
        return ans.size();
    }

    private void recurse(int i, int j, int k, int[] digits, int len, Set<Integer> ans) {
        if (i >= len) return;

        if (j >= len) {
            recurse(i + 1, 0, 0, digits, len, ans);
            return;
        }

        if (k >= len) {
            recurse(i, j + 1, 0, digits, len, ans);
            return;
        }

        if (i != j && j != k && i != k) {
            int num = digits[i] * 100 + digits[j] * 10 + digits[k];
            if (num >= 100 && num % 2 == 0) {
                ans.add(num);
            }
        }

        recurse(i, j, k + 1, digits, len, ans);  // move to next k
    }
}
