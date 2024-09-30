import java.util.*;
 class twodup {
     public static void main(String[] args){
         HashSet<Integer> s1 = new HashSet<>();
         HashSet<Integer> s2 = new HashSet<>();
         s1.add(10);
         s1.add(20);
         s1.add(30);
         s2.add(10);
         s2.add(20);
         s2.add(302);
         HashSet<Integer> s3=new HashSet<>(s1);

         s3.retainAll(s2);
         System.out.println(s3);


     }

}