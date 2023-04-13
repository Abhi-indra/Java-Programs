import java.util.*;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = in.nextInt();
        System.out.println("Enter the coloumn");
        int col = in.nextInt();

        int[][] numbers = new int[row][col];
//        input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = in.nextInt();
            }
        }
//        output
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

}
