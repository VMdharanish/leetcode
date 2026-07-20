/*
349. Intersection of Two Arrays
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
*/
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length;
        int m = nums2.length;
        int p1 = 0;
        int p2 = 0;
        Set<Integer> inter = new HashSet<>();
        while(p1<n && p2<m){
            if(nums1[p1] == nums2[p2]){
                inter.add(nums1[p1]);
                p1++;
                p2++;
            }
            else if(nums1[p1] < nums2[p2]){
                p1++;
            }else{
                p2++;
            }
        }
        int k = inter.size();
        int[] result = new int[k];
        int cur = 0;
        for(int i:inter){
            result[cur++] = i;
        }
        return result;
    }
}
