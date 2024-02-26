import java.util.Arrays;
import java.util.Scanner;

public class vestibular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] respostas = new int[10];
        for (int i = 0; i < 10; i++) {
            respostas[i] = scanner.nextInt();
        }

        int n = 0;
        String[] nomes = new String[100];

        while (true) {
            nomes[n] = scanner.next();
            if (nomes[n].equals("*")) {
                break;
            }
            n++;
        }

        calculateResults(respostas, nomes, n);
    }

    private static void calculateResults(int[] respostas, String[] nomes, int n) {
        int pontuacaoMax = -1, pontuacaoMin = 11, halfCorrectCount = 0;
        double pontuacaoTotal = 0.0;

        for (int i = 0; i < n; i++) {
            int pontuacao = 0;
            for (int j = 0; j < 10; j++) {
                if (respostas[j] == Character.getNumericValue(nomes[i].charAt(j + 1))) {
                    pontuacao++;
                }
            }

            if (pontuacao > pontuacaoMax) {
                pontuacaoMax = pontuacao;
            }
            if (pontuacao < pontuacaoMin) {
                pontuacaoMin = pontuacao;
            }
            if (pontuacao > 5) {
                halfCorrectCount++;
            }

            pontuacaoTotal += pontuacao;
        }

        Arrays.sort(nomes, 0, n);

        for (int i = 0; i < n; i++) {
            System.out.println(nomes[i] + " " + (int) pontuacaoTotal);
        }

        System.out.println(pontuacaoMax);
        System.out.println(pontuacaoMin);
        System.out.printf("%.1f%%\n", ((double) halfCorrectCount / n) * 100);
    }
}
