public class PrintBottomPyramid {
    public static void main(String[] args) {
        int n = 14;
        int init = 0;
        for (int i = init; i < n; i++) {
            for (int j = init; j < n; j++) {
                if (i > n - 3 || (j == 0 && i > (n - 3) / 2) || (j == n - 1 && i > (n - 3) / 2)
                        || (i > (n - 1) / 2 && j < (n - 1) / 2 && i - j >= (n - 1) / 2)
                        || ((j > (n - 1) / 2 && i > (n - 1) / 2 && i + j + 1 == (n + (n - 1) / 2)))
                        || (j > (n - 1) / 2 && i > (n - 1) / 2 && i + j - 1 > (n + (n - 2) / 4)))
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
