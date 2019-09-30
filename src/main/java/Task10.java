public class Task10 {
    static void PrintRectangle(int h, int w) {
        for (int i = 0; i < h; i++) {
            System.out.println();
            for (int j = 0; j < w; j++) {
                if (i == 0 || i == h - 1 || j == 0 || j == w - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
        }
    }

    public static void main(String args[]) {
        int h = 5, w = 10;
        PrintRectangle(h, w);
    }
}
