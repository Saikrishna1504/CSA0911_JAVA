import java.util.Scanner;
interface Student {
    void marks(int m1, int m2, int m3);
    void display();
}
class Calculation implements Student {
    int ma1, ma2, ma3, total, avg;
    public void marks(int m1, int m2, int m3) {
        this.ma1 = m1;
        this.ma2 = m2;
        this.ma3 = m3;
    }
    public void display() {
        total = ma1 + ma2 + ma3;
        avg = total / 3;
        if (avg >= 75) {
            System.out.println("Distinction");
        } else if (avg >= 60) {
            System.out.println("1st Division");
        } else if (avg >= 50) {
            System.out.println("2nd Division");
        } else {
            System.out.println("Failed");
        }
    }
}
public class StudentGrading {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks for 3 subjects:");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        Calculation calc = new Calculation();
        calc.marks(a, b, c);
        calc.display();
    }
}
