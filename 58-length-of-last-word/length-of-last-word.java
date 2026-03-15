class Solution {
    public int lengthOfLastWord(String s) {
        String[] sb= s.split(" ");
        String p = sb[sb.length-1];
        return p.length();
    }
}