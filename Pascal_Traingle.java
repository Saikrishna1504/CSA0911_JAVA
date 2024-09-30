class Pascal_Triangle {
    public static void main(String[] args){
        int n = 5; // Number of rows
        for (int i = 0; i < n; i++) {
            int a = 1;
            // Print leading spaces for formatting
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Print Pascal's Triangle values
            for (int k = 0; k <= i; k++) {
                System.out.print(a + " ");
                a = a * (i - k) / (k + 1); // Update value for next element
            }
            System.out.println();
        }
    }
}
