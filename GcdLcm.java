import java.util.*;
class GcdLcm {
    public static void main(String[] args){
        int n1=8,n2=6,gcd=1,lcm,i;
        for(i=1;i<=n1 & i<=n2;i++){
             if(n1%i==0 && n2%i==0){
            gcd = i;
             }
        }
        System.out.println("GCD is "+GCD);
        int lcm=(n1*n2)/Ggcd;
        System.out.println("LCM is "+LCM);
    }

}
