import java.util.HashSet;

class NameDup {
    public static void main(String args[]) {
        String[] names = {"sai", "krishna", "sai", "krishna", "vaddi"};

        HashSet<String> s1 =  new HashSet<>();
        HashSet<String> s2 = new HashSet<>();

        for (String name : names) {
            if (!s1.add(name)) {
                s2.add(name);
            }
        }

        System.out.println("Original input: ");
        for (int i=0;i<names.length;i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();

        System.out.println("Without duplicates: " + s1);
        System.out.println("Duplicate elements: " + s2);
    }
}
