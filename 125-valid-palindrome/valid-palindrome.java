class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                res.append(Character.toLowerCase(s.charAt(i)));
            }
         
        }   String original = res.toString();
          String  reversed = new StringBuilder(original).reverse().toString();
          return original.equals(reversed);
    }
}