/* Time Complexity : O(log(mn)) , where m is rows and n is columns
 * Space Complexity : O(m*n) size
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        //null
        if(matrix == null || matrix.length == 0) return false;
        
        int low = 0;
        int high = m*n-1;
        
        while(low <= high) {
            int mid = low + (high - low)/2;
            int r = mid/n;
            int c = mid%n;
            
            if(matrix[r][c] ==  target) return true;
            else if(matrix[r][c] > target){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
         return false;   
    }
}