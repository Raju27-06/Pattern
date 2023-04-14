
public class Pyramid{
  public static void pattern(int n,int m){
    int k=1;
    for(int i=n;i>=1;i--){
        for(int j=1;j<=m;j++){
            if(j>=i && j<=i+(2*k)-2){
                System.out.print("*");
            }
            else
                System.out.print(" ");
            
        }
        System.out.println();
        k++;
    }
  }
  public static void inverted(int n,int m){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if(j>=i+1 && j<=(2*n)-i+1){
                System.out.print("*");
            }
            else
                System.out.print(" ");
            
        }
        System.out.println();
    }

  }
    public static void main(String[] args) {
        int n=5,m=9;
        pattern(n,m);
        inverted(4,9);
    }
}
