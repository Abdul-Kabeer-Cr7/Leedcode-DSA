class Solution {
    public String longestCommonPrefix(String[] strs) {
      String result =strs[0];
      for(int i=1;i<strs.length;i++){
         String temp = "";
        for(int j=0;j<Math.min(result.length(),strs[i].length());j++){
             if(result.charAt(j)==strs[i].charAt(j)){
            temp+= strs[i].charAt(j);
          }else{
            break;
          }
      }
      result = temp;
      
      }
      return result;
    }
}