/*

Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
Example 1:
Input: s = "leetcode"
Output: 0
Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.
Example 2:
Input: s = "loveleetcode"
Output: 2
Example 3:
Input: s = "aabb"
Output: -1
*/
class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        int len = s.length() ;
        for(int i = 0 ; i< len ; i++){
            int ind = s.charAt(i) - 'a';
            count[ind]++;
        }
        for(int i = 0 ; i < len ; i++){
            int ind = s.charAt(i) - 'a';
            if(count[ind] == 1){
                return i;
            }
        }return -1;
    }
}
