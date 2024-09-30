import java.util.ArrayList;
import java.util.Collections;
public class ArrListSorting {
    public static void main(String args[]) {
        ArrayList<String> data = new ArrayList<>();
        data.add("sai");
        data.add("krishna");
        data.add("vaddi");
        System.out.println("before sorting: ");
        System.out.println(data);
        Collections.sort(data);
        System.out.println("After sorting: ");
        System.out.println(data);

    }
}
