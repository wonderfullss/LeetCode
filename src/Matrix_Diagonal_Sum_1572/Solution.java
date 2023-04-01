package Matrix_Diagonal_Sum_1572;

public class Solution {
    public int diagonalSum(int[][] mat) {
        int result = 0;
        for (int i = 0; i < mat.length; i++) {
            result += mat[i][i] + mat[i][mat[i].length - 1 - i];
        }
        if (mat.length % 2 != 0) {
            result = result - mat[mat.length / 2][mat.length / 2];
            return result;
        } else {
            return result;
        }
    }
}