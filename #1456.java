'I solved this by sliding window method'
  class Solution {
    public int maxVowels(String s, int k) {
       String vol = "aeiou";
       int count = 0;
       for(int i = 0 ; i<k ; i++){
            if(vol.indexOf(s.charAt(i)) != -1){
                count++;
            }
        }
        int maximum = count;
         for(int i = k ; i<s.length() ; i++){
            if(vol.indexOf(s.charAt(i)) != -1){
                count++;
            }
            if(vol.indexOf(s.charAt(i - k)) != -1){
                count--;
            }
            maximum = Math.max(maximum,count);
        }
        return maximum;
    }
}
