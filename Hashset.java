import java.util.HashSet;

class Hashset {
    public static void main(String args[]) {
        int[] a = {1, 1, 2, 2, 3, 3, 4, 4};
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for (int num : a) {
            if (!s1.add(num)) {
                s2.add(num);
            }
        }

        System.out.println("Array is:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Without duplicates: " + s1);
        System.out.println("Duplicate elements: " + s2);
    }
}
