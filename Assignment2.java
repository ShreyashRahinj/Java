import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter the no. of columns : ");
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];
        System.out.println("Enter elements of matrix : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is : ");
        display(matrix);
        int[][] transpose = new int[column][row];
        for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                transpose[i][j]=matrix[j][i];
            }
        }
        System.out.println("The transpose of matrix is : ");
        display(transpose);
        sc.close();
    }
    public static void display(int[][] matrix) {
        for(int[] row:matrix){
            for(int column:row){
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }
}