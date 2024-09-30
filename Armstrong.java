import java.util.Scanner;
class Armstrong {
    public  static void main(String args[]){
        int d,n,temp,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        n=s.nextInt();
        temp = n;
        while(n!=0){
            d = n % 10;
            sum += d*d*d;
            n = n/10;
        }
        if(temp==sum){
            System.out.println("it is armstrong number");
        }
        else{
            System.out.println("it is not a armstrong number");
        }
    }
}
