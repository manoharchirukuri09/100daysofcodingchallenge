1160. Find Words That Can Be Formed by Characters
    class Solution {
    public int countCharacters(String[] words, String chars) {
        int result = 0;
        int[] charCount = new int[26];
        for (char ch : chars.toCharArray()) {
            charCount[ch - 'a']++;
        }
        for (String word : words) {
            if (canFormWord(word, charCount.clone())) {
                result += word.length();
            }
        }
        return result;
    }

    private boolean canFormWord(String word, int[] charCount) {
        for (char ch : word.toCharArray()) {
            if (charCount[ch - 'a'] == 0) {
                return false;
            }
            charCount[ch - 'a']--;
        }
        return true;
    }
}

73. Set Matrix Zeroes
  public class Solution {
public void setZeroes(int[][] matrix) {
    boolean fr = false,fc = false;
    for(int i = 0; i < matrix.length; i++) {
        for(int j = 0; j < matrix[0].length; j++) {
            if(matrix[i][j] == 0) {
                if(i == 0) fr = true;
                if(j == 0) fc = true;
                matrix[0][j] = 0;
                matrix[i][0] = 0;
            }
        }
    }
    for(int i = 1; i < matrix.length; i++) {
        for(int j = 1; j < matrix[0].length; j++) {
            if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                matrix[i][j] = 0;
        }}
    }
    if(fr) {
        for(int j = 0; j < matrix[0].length; j++) {
            matrix[0][j] = 0;
        }
    }
    if(fc) {
        for(int i = 0; i < matrix.length; i++) {
            matrix[i][0] = 0;
        }
    }
}}  
