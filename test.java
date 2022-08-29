import java.util.Scanner;
public class test {
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
        int[][] transpose = new int[column][row];
        for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                transpose[i][j]=matrix[j][i];
            }
        }
        int add=0;
        int[][] multiply = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                for(int k=0;k<column;k++){
                }
            }
        }   
        sc.close();
    }
    
}