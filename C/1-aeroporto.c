#include <stdio.h>
#include <string.h>

void checkPassenger(int n) {
    char rg[20], rgBirth[11], ticket[20], ticketBirth[11], seat[4];

    for (int i = 0; i < n; i++) {
        scanf("%s", rg);
        scanf("%s", rgBirth);
        scanf("%s", ticket);
        scanf("%s", ticketBirth);
        scanf("%s", seat);

        if (strcmp(rg, "Nao possui") == 0) {
            printf("a saida e nessa direcao\n");
        } else if (strcmp(ticket, "Nao possui") == 0) {
            printf("a recepcao e nessa direcao\n");
        } else if (strcmp(rgBirth, ticketBirth) != 0) {
            printf("190\n");
        } else {
            printf("o seu assento e %s tenha um otimo dia\n", seat);
        }
    }
}

int main() {
    int n;
    scanf("%d", &n);
    checkPassenger(n);
    return 0;
}
