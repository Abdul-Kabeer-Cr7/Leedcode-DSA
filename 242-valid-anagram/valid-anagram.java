class Solution {
    static HashMap<Character,Integer> freq(String str){
        HashMap<Character,Integer> map3 = new HashMap<>();
        for(int i=0;i<str.length();i++){
            Character ch = str.charAt(i);
            if(map3.containsKey(ch)){
                map3.put(ch,map3.getOrDefault(ch,0)+1);
            }else{
                map3.put(ch,1);
            }
        }return map3;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map = freq(s);
        HashMap<Character,Integer> map2 = freq(t);
        return map.equals(map2);
    }
}