public class half_diamond {
    public static void main(String[] args){
        int n=5,i,j;
        for(i=1;i<=n;i++)
        {
            for( j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for( i=1;i<=n;i++)
        {
            for( j=n-i-1;j>=0;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
