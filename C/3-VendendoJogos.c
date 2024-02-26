#include <stdio.h>

int main() {
    int jogosVendidos;
    scanf("%d", &jogosVendidos);

    double precoJogo = 19.90;
    double vendaTotal = jogosVendidos * precoJogo;
    double bonus = (jogosVendidos / 15) * 0.08 * vendaTotal;
    double salarioTotal = 0.5 * vendaTotal + bonus;

    printf("%.2f\n%.2f\n%.2f\n", vendaTotal, bonus, salarioTotal);

    return 0;
}
