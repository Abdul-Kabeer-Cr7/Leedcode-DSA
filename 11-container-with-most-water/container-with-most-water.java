class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int min_height =0;
        int max=0;
        while(left<right){
            min_height= Math.min(height[left],height[right]);
            int width = right-left;
            int area = width*min_height;
             max = Math.max(max,area);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }return max;
    }
}