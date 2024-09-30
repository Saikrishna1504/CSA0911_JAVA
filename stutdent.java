import java.util.Scanner;
class student{
    public static void main(String args[]) {
        int tu,su,students,nt;
        Scanner s=new Scanner(System.in);
        System.out.println("enter total user and staff user ");
        tu = s.nextInt();
        su = s.nextInt();
        nt = su / 3;
        students = tu - su - nt;
        System.out.println("students are  "+ students);
    }
}