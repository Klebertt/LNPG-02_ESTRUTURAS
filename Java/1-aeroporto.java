import java.util.Scanner;

public class  aeroportoListaDeChecagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String rg = scanner.next();
            String rgNascimento = scanner.next();
            String ticket = scanner.next();
            String ticketNascimento = scanner.next();
            String assento = scanner.next();

            if (rg.equals("Nao possui")) {
                System.out.println("a saida e nessa direcao");
            } else if (ticket.equals("Nao possui")) {
                System.out.println("a recepcao e nessa direcao");
            } else if (!rgNascimento.equals(ticketNascimento)) {
                System.out.println("190");
            } else {
                System.out.println("o seu assento e " + assento + " tenha um otimo dia");
            }
        }
    }
}
