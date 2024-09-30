import java.util.Scanner;

class StringPalindrome {
    public static void main(String args[]) {
        int len;
        String data, temp = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string:");
        data = s.nextLine();
        len = data.length();
        while (len > 0) {
            temp += data.charAt(len - 1);
            len--;
        }
        if (data.equals(temp)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}
