import java.util.*;
class LT{
    public static void main(String[] args){
        int i,j,r;
        System.out.println("enter no.of rows");
        Scanner s= new Scanner(System.in);
        r = s.nextInt();
        for(i=0;i<=r;i++){
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}