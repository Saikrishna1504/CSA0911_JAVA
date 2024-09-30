import java.util.Scanner;
class NumPalindrome {
    public static void main(String args[]){
        int n,i,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        n=s.nextInt();
        int temp = n;
        while(n>0){
            i = n % 10;
            sum = sum*10 + i;
            n= n / 10;
        }if(temp == sum){
            System.out.println("it is a palindrome");
        }else{
            System.out.println("not a palindorme");
        }
    }
}
