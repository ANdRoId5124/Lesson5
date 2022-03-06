import java.util.Arrays;

public class ex3 {
    public static void main(String[] args){
        int [][] array = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8 , 9}};
        for(int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array.length; j++) {
                if((i + j) % 2 == 0){
                    System.out.print(array[i][j] + " ");
                }else
                    System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println(Arrays.deepToString(array));
    }
}
