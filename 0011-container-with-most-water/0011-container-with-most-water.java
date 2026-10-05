class Solution {
    public int maxArea(int[] height) {
        List<Integer> list = new ArrayList<>();
        for(int h : height){
            list.add(h);
        }
        int left = 0;
        int right = list.size()-1;
        int maxWater = 0;

        while(left<right){
            int currheight = Math.min(list.get(left) , list.get(right) );
            int width = right - left;
            int currWater = currheight * width;
            maxWater = Math.max(maxWater, currWater);

            if(list.get(left)< list.get(right)){
                left++;
            }
            else{
                right--;
            };
        }
        return maxWater;

    }
}