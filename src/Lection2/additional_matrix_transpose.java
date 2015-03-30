package Lection2;

/**
 * Created by Student on 3/30/2015.
 */
public class additional_matrix_transpose {
    public static void main(String[] args) {

        int[][] my2DArray = new int[4][4];//initial array
        for (int i = 0; i < 4; i++) {//i - rows
            for (int j = 0; j < 4; j++) {//j - columns
                int x = (i+1)*(j+2);
                my2DArray[i][j] = x;
                System.out.print(x + " ");
                if (j == 3) System.out.println();
            }
        }

        System.out.println();//indent
        int[][] transArray = new int[4][4];
        for (int i=0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                transArray[i][j] = my2DArray[j][i];
                System.out.print(transArray[i][j] + " ");
                if (j == 3) System.out.println();
            }
        }
    }

}
