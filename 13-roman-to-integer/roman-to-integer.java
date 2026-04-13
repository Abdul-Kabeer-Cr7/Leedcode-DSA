class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int sum =0;
        int previous = 0;
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        s = s.toUpperCase();
        for(int i= s.length()-1;i>=0;i--){
          int current  = map.getOrDefault(s.charAt(i),0);
          if(current<previous){
            sum-= current;
          }  
        else{
            sum+= current;
        }
        previous = current;
        }
        return sum;
        

    }
}