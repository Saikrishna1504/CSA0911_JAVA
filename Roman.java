import java.util.*;
public class Roman {
    public static void main(String args[]){
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        Scanner s=new Scanner(System.in);
        System.out.println("enter input");
        String data;
        data = s.nextLine();
        data = data.replace("IV","IIII");
        data = data.replace("IX","VIIII");
        data = data.replace("XL","XXXX");
        data = data.replace("XC","LXXXX");
        data = data.replace("CD","CCCC");
        data = data.replace("CM","DCCCC");

        int sum =0;
        for(int i=0;i<data.length();i++){
            sum = sum + map.get(data.charAt(i));
        }
        System.out.println(sum);


    }
}
