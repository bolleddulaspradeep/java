public class PrintNumbers {
    public static void main(String[] args) {
        int n = 5;
        int initialization = 1;
        for (int i = initialization; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(" " + i + " ");
            }
            System.out.println();
        }
    }
}