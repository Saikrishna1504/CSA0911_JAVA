import java.util.Scanner;
class perfect
{
    public static void main(String[] args)
    {
        int num,sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number: ");
        num = s.nextInt();
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum += i;
            }
        }
        if(num==sum)
        {
            System.out.println("It is a perfect number");
        }
        else
        {
            System.out.println("It is not a perfect number");
        }
    }
}