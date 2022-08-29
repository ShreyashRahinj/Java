import java.util.Scanner;
public class tut2 {
    public static void main(String[] args) {
        System.out.println("It works");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
        System.out.println("Enter string");
        String str1 = sc.next();
        System.out.println(str1);
        System.out.println("Enter string");
        String str2 = sc.nextLine();
        System.out.println(str2);
        sc.close();
    }
}
