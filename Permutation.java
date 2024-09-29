public class Permutation {
    public static void Permutation(String str, String pos) {
        if (str.length() == 0) {
            System.out.println(pos);  
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); 
            String rem = str.substring(0, i) + str.substring(i + 1);  
            Permutation(rem, pos + ch); 
        }
    }

    public static void main(String[] args) {
        String data = "123";  
        Permutation(data, "");  
    }
}
