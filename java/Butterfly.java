public class Butterfly {
    public static void main(String[] args) {
        int n=4;
        int m=8;
        for(int i=1;i<=n;i++){
         for(int j=1;j<=m;j++){
            if(j<=i || j>=(m-i+1)){
                System.out.print("*");
            }
            else
            System.out.print(" ");
         }
         System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=m;j++){
               if(j<=i || j>=(m-i+1)){
                   System.out.print("*");
               }
               else
               System.out.print(" ");
            }
            System.out.println();
           }
    }
}