class Solution {
    public int[] sortedSquares(int[] nums) {
        int result[] = new int[nums.length];
        int index=0;
        for(int k : nums){result[index++]=k*k;}
        Arrays.sort(result);
        return result;
    }
}