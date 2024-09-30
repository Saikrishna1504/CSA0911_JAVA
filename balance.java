import java.util.Scanner;
class balance{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a,b,c,d,total;
        System.out.println("enter the number 2000 notes");
        a = s.nextInt();
        System.out.println("enter the number 500 notes");
        b = s.nextInt();
        System.out.println("enter the number 200 notes");
        c = s.nextInt();
        System.out.println("enter the number 100 notes");
        d = s.nextInt();

        total = (a * 2000) + (b * 500) + (c * 200) +  (d * 100);
        System.out.println("Total Balance is "+ total);

    }
}