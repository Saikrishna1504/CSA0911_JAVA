import java.util.Scanner;
class SqRoot {
    public static void main(String args[]){
        int n;
        System.out.println("enter number");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        System.out.println("square root of "+n+" is "+(Math.sqrt(n)));
    }
}

