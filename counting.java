import java.util.Scanner;
class counting
{
    public static void main(String[] args)
    {
        String data;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any string: ");
        data = s.nextLine();
        int cv=0,cc=0,csp=0,cd=0;
        data = data.toLowerCase();
        for(int i=0;i<data.length();i++)
        {
            if((data.charAt(i)>='a') && (data.charAt(i)<='z'))
            {
                char c = data.charAt(i);
                if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u')
                {
                    cv++;
                }
                else
                {
                    cc++;
                }
            }
            else if((data.charAt(i)>='0') && (data.charAt(i)<='9'))
            {
                cd++;
            }
            else
            {
                csp++;
            }
        }
        System.out.println("vowels: "+cv+" Consonants: "+cc+" Digits: "+cd+" Special chars: "+csp);
    }
}