public class LessThan {
    public static void main(String[] args) {
        int n = 1, m = 10, rem;

        for (int i = n; i <= m; i++) {
            int sum = 0;
            int val = (int) Math.sqrt(i);
                     
            if (i == val * val) {
                int temp = i;
                while (temp > 0) {
                    rem = temp % 10;
                    sum += rem;
                    temp = temp / 10;
                }
                if (sum <= 10) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
