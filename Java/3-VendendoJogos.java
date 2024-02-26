import java.util.Scanner;

public class  vendendoJogosEducativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jogosVendidos = scanner.nextInt();

        double preco = 19.90;
        double vendasTotal = jogosVendidos * preco;
        double bonus = (jogosVendidos / 15) * 0.08 * vendasTotal;
        double salarioTotal = 0.5 * vendasTotal + bonus;

        System.out.printf("%.2f\n%.2f\n%.2f\n", vendasTotal, bonus, salarioTotal);
    }
}
