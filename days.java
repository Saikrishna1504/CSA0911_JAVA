import java.util.Scanner;
class days{
    public static void main(String args[]){
        int y,w,d,rd,num;
        Scanner s=new Scanner(System.in);
        System.out.println("enter num value");
        num = s.nextInt();
        y = num / 365;
        rd = num % 365;
        w = rd / 7;
        d = w % 7;
        System.out.println("years"+ y);
        System.out.println("weeks"+ w);
        System.out.println("days"+ d);
    }
}