class Solution {
    public int maxArea(int[] heights) {
       int n=heights.length;
       int left=0;
       int right=n-1;
       int maxarea=0;

       while(left<right){
        int width=right-left;
        int currentheight=Math.min(heights[left],heights[right]);
        int area=width*currentheight;
        maxarea=Math.max(maxarea,area);

        if(heights[left]<heights[right]){left++;}
        else{right--;}
       } 
       return maxarea;
    }
}
