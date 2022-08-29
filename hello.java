public class hello {
        public static void main(String[] args) throws Exception{
        System.out.println("Hello world");
        int a=35;
        System.out.println(a);
        if(a>40){
            System.out.println(a);
        }
        else{
            System.out.println("Hello");
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<9;j++){
                if(j<=i||i+j>=8){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=4;i>=0;i--){
            for(int j=0;j<9;j++){
                if(j<=i||i+j>=8){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}