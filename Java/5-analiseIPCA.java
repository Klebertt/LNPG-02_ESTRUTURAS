import java.util.Scanner;

public class analiseDoIpca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalIpca = 0.0, minIpca = 100.0, maxIpca = -1.0;
        int monthCount = 0;

        while (true) {
            String input = scanner.next();
            if (input.equals("*")) {
                break;
            }

            String[] parts = input.split("/");
            int year = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            double ipca = scanner.nextDouble();

            if (ipca < minIpca) {
                minIpca = ipca;
            }
            if (ipca > maxIpca) {
                maxIpca = ipca;
            }

            totalIpca += ipca;
            monthCount++;
        }

        double averageIpca = totalIpca / monthCount;

        System.out.printf("(%.2f) ", minIpca);
        System.out.printf("(%.2f) ", maxIpca);
        System.out.printf("(%.2f)\n", averageIpca);
    }
}
