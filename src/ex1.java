import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int plus = scanner.nextInt();
        int [][][] tripleArray = new int [3][3][3];
        for(int i = 0; i < tripleArray.length;i++){
            System.out.println();
            for(int j = 0; j < tripleArray.length;j++){
                for(int k = 0; k < tripleArray.length;k++){
                    tripleArray[i][j][k] = (int)(Math.random() * 10);
                    System.out.print(tripleArray[i][j][k] + " ");
                    tripleArray[i][j][k] = tripleArray[i][j][k] + plus;
                }
            }
        }
        System.out.println();
        System.out.println(Arrays.deepToString(tripleArray));
    }
}
