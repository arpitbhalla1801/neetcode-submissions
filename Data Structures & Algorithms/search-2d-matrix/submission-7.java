class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = -1;
        for(int i=0;i<matrix.length;i++) {
            System.out.println(matrix[i][0]);
            if(target >= matrix[i][0]) r++;
            else break;
        }
        System.out.println(r);
        if(r==-1 || r>matrix.length-1) return false;

        int l=0;
        int h=matrix[r].length-1;
        int mid=0;
        while(l<=h) {
            mid=(l+h)/2;
            if(target > matrix[r][mid]) l=mid+1;
            else if(target < matrix[r][mid]) h=mid-1;
            else return true;
        }
        return false;
    }
}
