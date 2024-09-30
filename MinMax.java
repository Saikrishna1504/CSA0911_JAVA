import java.util.Scanner;
class MinMax
{
    public static void main(String[] args)
    {
        int size,m,n,i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        size=s.nextInt();
        int[] array = new int[size];
        for(i=0;i<size;i++)
        {
            System.out.println("Enter the element "+(i+1)+": ");
            array[i]=s.nextInt();
        }
        System.out.println("Enter the value of m: ");
        m=s.nextInt();
        System.out.println("Enter the value of n: ");
        n=s.nextInt();
        for(i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(array[i]>array[j])
                {
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        int sum = array[array.length-m]+array[n-1];
        int dif = array[array.length-m]-array[n-1];
        System.out.println("Sum:"+sum+" Difference: "+dif);
    }
}