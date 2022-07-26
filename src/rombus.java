public class rombus {
    public static void main(String[] args) {
        int n = 11;
        int init = 0;
        for (int i = init; i < n; i++) {
            for (int j = init; j < n; j++) {
                if (i == (n - 1) / 2 || j == (n - 1) / 2
                        || (i < (n - 1) / 2) && j < (n - 1) / 2 && i + j >= (n - 1) / 2 // l1
                        || (j > (n - 1) / 2 && i > 0 && i < (n - 1) / 2 && j - i <= (n - 1) / 2) // l2
                        || (i > (n - 1) / 2 && j < (n - 1) / 2 && i - j <= (n - 1) / 2) // l3
                        || (i > (n - 1) / 2 && j > (n - 1) / 2 && i + j < n + (n) / 2) // l4
                )
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
