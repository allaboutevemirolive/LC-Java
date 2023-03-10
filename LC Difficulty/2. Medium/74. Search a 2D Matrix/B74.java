class B74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length * matrix[0].length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midRow = mid / matrix[0].length;
            int midCol = mid % matrix[0].length;
            
            if (matrix[midRow][midCol] == target) {
                return true;
            } else if (matrix[midRow][midCol] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return false;
    }
}