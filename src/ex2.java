import java.util.Arrays;

public class ex2 {
    public static void main(String[] args){
        int [][] array = new int[5][5];
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                array[i][j] = (int)(Math.random() * 10);
                sum += array[i][j];
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println(sum);
    }
}
