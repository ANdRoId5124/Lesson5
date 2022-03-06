import java.util.Arrays;

public class ex5 {
    public static void main(String[] args) {
        int[][] array = {{11, 9, 42},
                {24, 15, 1}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                Arrays.sort(array[i]);
            }
            }
        System.out.println(Arrays.deepToString(array));
    }
}