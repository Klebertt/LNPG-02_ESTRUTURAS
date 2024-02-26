#include <stdio.h>
#include <string.h>

#define MAX_MONTHS 100

int main() {
    char input[15];
    int year, month;
    double ipca, totalIpca = 0.0, minIpca = 100.0, maxIpca = -1.0;
    int monthCount = 0;

    while (1) {
        scanf("%s", input);
        if (strcmp(input, "*") == 0) {
            break;
        }

        sscanf(input, "%d/%d", &year, &month);
        scanf("%lf", &ipca);

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

    printf("(%.2lf) ", minIpca);
    printf("(%.2lf) ", maxIpca);
    printf("(%.2lf)\n", averageIpca);

    return 0;
}
