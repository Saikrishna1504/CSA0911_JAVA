import java.util.*;
 public class uptostar {
    public static void main(String args[]) {
            int i,uc=0,lc=0;
            char[] d1={'s','S','a','*'};
            char[] d2=new char[d1.length];
            int len = d1.length;
            for(i=0;i<len;i++){
                if(d1[i]!='*'){
                    d2[i] = d1[i];
                }else{
                    break;
                }
            }
            for(i=0;i<len;i++){
                if(d2[i]>='A' && d2[i]<='Z'){
                    uc += 1;
                }else if(d2[i]>='a' && d2[i]<='z'){
                    lc += 1;
                }else{
                    continue;
                }
            }
            System.out.println("upper count is "+uc);
            System.out.println("lower count is "+lc);
    }
}
