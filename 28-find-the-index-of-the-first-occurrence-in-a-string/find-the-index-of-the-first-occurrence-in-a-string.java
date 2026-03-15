class Solution {
    public int strStr(String haystack, String needle) {
       int first = 0;
       int second = 0;
       int start = 0;
       if(needle.length()==0||haystack.length()==0){
        return 0;
       }
       while(first<haystack.length()){
        if(haystack.charAt(first)==needle.charAt(second)){
            first++;
            second++;
        }else{
            first= first-second+1;
            second =0;
        }if(second == needle.length()){
            start = first-second;
            return start;
        }
       }return -1;
       
    }
}