class Solution {
    public boolean isPerfectSquare(int num) {
        if((int)num==1){
            return true;
        }
        for(long i=2;i<num;i++){
            if(i*i==num){
                return true;
            }
        }return false;
    }
}