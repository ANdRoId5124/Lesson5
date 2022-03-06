import java.util.Arrays;

public class ex4 {
    public static void main(String[] args) {
        int[][] array = {{1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}};

        int[][] array2 = {{1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}};

        int[][] array3 = new int[array.length][array2[0].length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                for (int k = 0; k < array3.length; k++) {
                    array3[i][j] += array[i][k] * array2[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(array3));

    }
}
