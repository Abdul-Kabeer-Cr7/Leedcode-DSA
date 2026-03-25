class Solution {
    public static String reverse(String result){
        String ch = "";
        for(int i=result.length()-1;i>=0;i--){
             ch = ch + result.charAt(i);
        }
        return ch;
    }
    public boolean isPalindrome(String s) {
        String result = "";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                result = result+s.charAt(i);
            } 
        }result = result.toLowerCase();
        String reversed = reverse(result);
        return reversed.equals(result);
    }
}