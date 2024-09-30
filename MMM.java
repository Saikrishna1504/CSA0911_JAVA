import java.util.*;
public class MMM {
    public static void main(String args[]){
        int mean,median,mode,sum=0;
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(18);
        a.add(20);
        for(int num: a){
            sum += num;
        }
        int avg = sum/a.size();
        System.out.println("mean: "+avg);
        Collections.sort(a);
        median=(a.size())/2;
        System.out.println("Median :"+median);
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for (int num : a) {
            if (!s1.add(num)) {
                s2.add(num);
            }
        }
        System.out.println("Mode :"+s2);
    }
}