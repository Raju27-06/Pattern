public class Hollow_pattern {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for(int j=1;j<=10;j++){
                if(j<=i || j>=10-(i-1))
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        // for inverted
        for(int i=1;i<=5;i++){
            for(int j=1;j<=10;j++){
                if(j<=i || j>=10-(i-1))
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
