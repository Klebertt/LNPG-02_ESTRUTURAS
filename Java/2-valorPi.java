import java.util.Scanner;

public class valorAproximadoDePi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.printf("%.5f\n", calcularPi(n));
    }

    private static double calcularPi(int n) {
        double S = 0.0;
        for (int i = 1; i <= n; i++) {
            S += 1.0 / (i * i);
        }
        return Math.pow(S * 32, 1.0 / 3);
    }
}
