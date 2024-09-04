import java.util.*;
class Hollogram {
    public static void main(String args[]) {
        int i, j, h, w;
        h = 3;
        w = 3;
        for (i = 0; i < h; i++) {
            for (j = 0; j < w; j++) {
                if (i == 0 || i == h - 1 || j == 0 || j == w - 1) {
                    System.out.print("* ");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
}