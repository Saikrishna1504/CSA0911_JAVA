import java.util.Scanner;
class sorting{
    public static void main(String args[]) {
        int size;
        Scanner s = new Scanner(System.in);
        System.out.println("enter size of array");
        size = s.nextInt();
        s.nextLine();
        String[] data = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter element of array " + (i + 1));
            data[i] = s.nextLine();
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(data[j].compareTo(data[i])<0){
                    String temp="";
                    temp = data[i];
                    data[i]=data[j];
                    data[j]=temp;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }
}
