import java.util.*;

class Hologram {
    public static void main(String args[]) {
        int i, j, h, w;
        h = 5;
        w = 5;

        for (i = 0; i < h; i++) {
            for (j = 0; j < w; j++) {
                if (i == 0 || i == h - 1 || j == 0 || j == w - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
