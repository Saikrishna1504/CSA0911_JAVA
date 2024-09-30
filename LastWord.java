
class LastWord {
    public static void main(String args[]) {
        String data = "Sai Krishna Vaddi";
        String[] value = data.split(" ");
        System.out.println("The length of last word is " + value[value.length - 1].length());
    }
}