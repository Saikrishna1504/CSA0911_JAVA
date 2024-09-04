import java.util.*;
class Diamond{
    public static void main(String args[]){
        int i,j,r;
        Scanner s=new Scanner(System.in);
        System.out.println("enter no.of rows");
        r=s.nextInt();
        for(i=0;i<r;i++){
            for(j=(r-i);j>0;j--){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=0;i<=r;i++){
            for(j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=r-i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
