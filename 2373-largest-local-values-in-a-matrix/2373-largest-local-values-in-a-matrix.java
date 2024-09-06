class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] maxLocal = new int[grid.length-2][grid.length-2];
        for(int i=0; i<grid.length-2; i++){
 for(int j=0; j<grid.length-2; j++){
    int max = Integer.MIN_VALUE;
 for(int k=0; k<3; k++){
for(int h=0; h<3; h++){
max = Math.max(max, grid[i + k][j + h]);
maxLocal[i][j] = max;
}
 }
 }
        }
        return maxLocal;
    }
}