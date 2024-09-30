import java.util.Scanner;
class index {
    public static void main(String args[]){
        String data = "Sai Krishna";
        char c = 'r';
        int F=0;
        for(int i=0;i<data.length();i++){
            if(data.charAt(i)==c){
                System.out.println("present at " + i);
                F = 1;
                break;
            }
        }
        if(F==0){
            System.out.println("not available");
        }
    }
}
