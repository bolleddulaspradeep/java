public class PrintINeuron {
    public static void main(String[] args) {
        int n = 5;
        int init = 0;
        for (int i = init; i < n; i++) {
            for (int j = init; j < n; j++) {
                if (j == (n - 1) / 2 || i == 0 || i == n - 1) // I
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.print(" ");

            for (int j = init; j < n; j++) { // N
                if (j == 0 || j == n - 1 || i == j)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.print(" ");

            for (int j = init; j < n; j++) { // E
                if (j == 0 || i == 0 || (i == (n - 1) / 2 && j < n - 1) || i == n - 1)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.print(" ");

            for (int j = init; j < n; j++) { // U
                if (j == 0 || j == n - 1  || ( i == n-1) )
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.print(" ");

            for (int j = init; j < n; j++) { // R
                if ((i == 0 && j < n - 1) || j == 0 || (i == (n - 1) / 2 && j < n - 1)
                        || ((i < (n - 1) / 2 || i > (n - 1) / 2) && j == n - 1 && i != 0))
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.print(" ");

            for (int j = init; j < n; j++) { // O
                if ((i==0 && j < n-1 && j>0) || (j==0 && i!=0 && i<n-1) || (i==n-1 && j> 0 && j<n-1) || (j==n-1 && i>0 && i<n-1))
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.print(" ");

            for (int j = init; j < n; j++) { // N
                if (j == 0 || j == n - 1 || i == j)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.print(" ");

            System.out.println();
        }
    }
}