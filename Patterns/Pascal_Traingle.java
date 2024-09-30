class Pascal_Triangle {
    public static void main(String[] args){
        int n = 5;
        for (int i = 0; i < n; i++) {
            int a = 1;
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(a + " ");
                a = a * (i - k) / (k + 1); 
            }
            System.out.println();
        }
    }
}
