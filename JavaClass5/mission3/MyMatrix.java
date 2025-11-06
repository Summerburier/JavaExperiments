import java.util.Random;
public class MyMatrix {
    private int[][] matrix;
    private int rows;
    private int columns;
    private int maxNumber=0;
    public MyMatrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = new Random().nextInt(1000);
                maxNumber = Math.max(maxNumber, matrix[i][j]);
            }
        }

    }
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public int maxNum() {
        return maxNumber;
    }   

}
