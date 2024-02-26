#include <stdio.h>
#include <math.h>

double calculatePi(int n) {
    double S = 0.0;
    for (int i = 1; i <= n; i++) {
        S += 1.0 / (i * i);
    }
    return pow(S * 32, 1.0 / 3);
}

int main() {
    int n;
    scanf("%d", &n);
    printf("%.5lf\n", calculatePi(n));
    return 0;
}
