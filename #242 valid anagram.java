/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
*/
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();

        Arrays.sort(sa);
        Arrays.sort(ta);

        return Arrays.equals(sa,ta);
    }
}
