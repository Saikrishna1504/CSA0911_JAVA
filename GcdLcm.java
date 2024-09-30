import java.util.*;
class GcdLcm {
    public static void main(String[] args){
        int n1=8,n2=6;
        int a=n1,b=n2;
        while(b>0){
            int t=b;
            b= a%b;
            a=t;
        }
        int GCD=a;
        System.out.println("GCD is "+GCD);
        int LCM=(n1*n2)/GCD;
        System.out.println("LCM is "+LCM);
    }

}
