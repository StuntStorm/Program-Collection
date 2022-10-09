#include <stdio.h>
int m, num, adj[10][10], col[10];
int canColor(int n, int c)
{
    for (int i = 0; i < n; i++)
    {
        if (adj[n][i] == 1 && col[i] == c)
            return 0;
    }
    return 1;
}
void graphColoring(int n)
{
    for (int c = 0; c < m; c++)
    {
        if (canColor(n, c))
        {
            col[n - 1] = c;
            if (n == num)
            {
                for (int i = 0; i < num; i++)
                {
                    printf("%d", col[i]);
                }
                printf("\n");
            }
            else
            {
                graphColoring(n + 1);
            }
        }
    }
}
int main()
{
    int edge, s, d;
    printf("Enter the number of vertices:");
    scanf("%d", &num);
    printf("Enter the number of edges:");
    scanf("%d", &edge);
    printf("Enter the number of colors:");
    scanf("%d", &m);
    for (int i = 0; i < num; i++)
    {
        for (int j = 0; j < num; j++)
        {
            adj[i][j] = 0;
        }
    }
    for (int i = 0; i < edge; i++)
    {
        printf("Enter the source:");
        scanf("%d", &s);
        printf("Enter the destination:");
        scanf("%d", &d);
        adj[s][d] = 1;
        adj[d][s] = 1;
        col[i] = -1;
    }
    graphColoring(0);
    return 0;
}