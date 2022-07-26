public class PrintSidePyramid {
    public static void main(String[] args) {
        int n = 14;
        int init = 0;
        for (int i = init; i < n; i++) {
            for (int j = init; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0
                        || (j > 0 && i > 0 && i < (n + 1) / 2 && j < (n - 1) / 2 && i + j < (n + 1) / 2)
                        || (i > (n - 1) / 2 && j < (n - 1) / 2) && i > (n + 1) / 2 && i - j > (n - 1) / 2)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
