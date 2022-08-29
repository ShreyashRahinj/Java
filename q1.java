import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("hello this program will show you grade based on your marks : ");
        // System.out.println("Enter your marks in Physics out of 100 : ");
        // int p = sc.nextInt();
        // System.out.println("Enter your marks in Chemistry out of 100 : ");
        // int c = sc.nextInt();
        // System.out.println("Enter your marks in Mathematics out of 100 : ");
        // int m = sc.nextInt();
        // if((p+c+m)/3>=90){
        //     System.out.println("Congratulations you have got O grade");
        // }
        // else if((p+c+m)/3>=80){
        //     System.out.println("Congratulations you have got A grade");
        // }
        // else if((p+c+m)/3>=70){
        //     System.out.println("Congratulations you have got B grade");
        // }
        // else if((p+c+m)/3>=60){
        //     System.out.println("Congratulations you have got C grade");
        // }
        // else if((p+c+m)/3>=50){
        //     System.out.println("Congratulations you have got D grade");
        // }
        // else if((p+c+m)/3>=40){
        //     System.out.println("Congratulations you have got E grade");
        // }
        // else{
        //     System.out.println("Sorry you have failed");
        // }
        // sc.close();
        int i = 0, j = 0;
        while(i<5){
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            i++;
            j=0;
            System.out.println();
        }
    }
}
