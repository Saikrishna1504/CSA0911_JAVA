import java.util.Scanner;

class ReverseString {
    public static void main(String args[]) {
        String data, temp = "";
        int len;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string:");
        data = s.nextLine();
        len = data.length();
        while (len > 0) {
            temp = temp + data.charAt(len - 1);
            len--;
        }
        System.out.println(temp);
    }
}
