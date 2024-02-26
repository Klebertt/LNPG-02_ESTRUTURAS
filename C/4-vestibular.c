#include <stdio.h>
#include <string.h>

#define MAX_PARTICIPANTS 100

void calculateResults(int respostas[], char names[][50], int n) {
    int pontuacaoMax = -1, pontuacaoMin = 11, halfCorrectCount = 0;
    double pontosTotal = 0.0;

    for (int i = 0; i < n; i++) {
        int score = 0;
        for (int j = 0; j < 10; j++) {
            if (respostas[j] == names[i][j + 1] - '0') {
                score++;
            }
        }

        if (score > pontuacaoMax) {
            pontuacaoMax = score;
        }
        if (score < pontuacaoMin) {
            pontuacaoMin = score;
        }
        if (score > 5) {
            halfCorrectCount++;
        }

        pontosTotal += score;
    }

    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (strcmp(names[j], names[j + 1]) > 0) {
                char temp[50];
                strcpy(temp, names[j]);
                strcpy(names[j], names[j + 1]);
                strcpy(names[j + 1], temp);
            }
        }
    }

    for (int i = 0; i < n; i++) {
        printf("%s %d\n", names[i], pontosTotal);
    }

    printf("%d\n", pontuacaoMax);
    printf("%d\n", pontuacaoMin);
    printf("%.1lf%%\n", (double)halfCorrectCount / n * 100);
}

int main() {
    int respostas[10];
    for (int i = 0; i < 10; i++) {
        scanf("%d", &respostas[i]);
    }

    int n = 0;
    char nomes[MAX_PARTICIPANTES][50];

    while (1) {
        scanf("%s", nomes[n]);
        if (nomes[n][0] == '*') {
            break;
        }
        n++;
    }

    calculateResults(respostas, nomes, n);

    return 0;
}
