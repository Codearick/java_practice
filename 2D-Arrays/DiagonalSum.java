public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int sum = diagonalSum(matrix);
        System.out.println("The diagonal sum of a matrix is: " + sum);
    }

    public static int diagonalSum(int[][] matrix) {
        int sum = 0;

        // Brute force: with time complexity: O(n^2)
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // if(i == j){
        // sum += matrix[i][j];
        // } else if(i + j == matrix.length - 1){
        // sum += matrix[i][j];
        // }
        // }
        // }

        //Linear time complexity 
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];

            if (i != matrix.length - i - 1) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }
}