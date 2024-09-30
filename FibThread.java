class Fib extends Thread {
    public void run() {
        int a = 0, b = 1, c;
        System.out.print(a + " ");
        for (int i = 1; i <= 10; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}

class FibThread {
    public static void main(String[] args) {
        Fib q = new Fib();
        Fib w = new Fib();
        Fib e = new Fib();

        q.start();
        w.start();
        e.start();
    }
}
