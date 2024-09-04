import java.util.Scanner;
class InvertedPyramid {
    public static void main(String argas[]){
        int i,j,k,r;
        Scanner s=new Scanner(System.in);
        System.out.println("enter ni.of rows");
        r = s.nextInt();
        for(i=0;i<=r;i++){
            for(j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(k=0;k<=r-i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
