#include<stdio.h>
#include<stdlib.h>     
#include<stdbool.h>
#pragma warning(disable:4996)

//Program to find the shortest path between to stations
//Assignment Qn_3

//Three arays are used in the program : dist[], visited and parent[]
// 'dist' is an array of integer type which at the end of the program gives us the shortest distance to each node from the source node
// 'visited' is an array of boolean type which sets the visited node as TRUE and unvisited in set as FALSE. The program ends when all the nodes are visited i.e. when all the elements of the array is set to TRUE
// 'parent' array is used to print shortest path to each node

//Function to find the minimum distance in the 'dist' array(only from among the unvisited nodes)
int minimumDist(int dist[], bool visited[])
{
	int min = INT_MAX, index;

	for (int i = 0; i < 6; i++)
	{
		if (visited[i] == false && dist[i] <= min)
		{
			min = dist[i];
			index = i;
		}
	}
	return index;
}

//Function to find and display the shortest path 
//'parent' array should be updated with apppropriate nodes before passing on to this function
void printPath(int parent[], int j)
{
	// Base Case : If j is source
	if (parent[j] == -1)
		return;
	printPath(parent, parent[j]);
	j = 65 + j;
	printf("%c ", j);
}

//Dijkstra's algorithm to find the shortest distance from the source
void Dijkstra(int graph[6][6], int src, int x) // graph is the adjacency matrix [6x6], src is the source node, x is the destination node
{
	int dist[6]; // 'dist' array -> integer array to calculate minimum distance for each node.                            
	bool visited[6];// 'visited' array ->boolean array to mark visted/unvisted for each node.

	// set the nodes with infinity distance
	// except for the initial node and mark
	// them unvisited.  

	int parent[6] = { -1 };

	for (int i = 0; i < 6; i++)
	{
		dist[i] = INT_MAX;
		visited[i] = false;
	}

	dist[src] = 0;   // Source vertex distance is set to zero.             

	for(int i = 0; i < 6; i++)  //This loop is used to update the 'visited' array i.e. it will set visited nodes as TRUE
	{
		int m = minimumDist(dist, visited); // vertex not yet included.
		visited[m] = true;// m with minimum distance included in visited.
		for (int i = 0; i < 6; i++)  //this loop updates 'dist' array with the distances to adjacent modes of the node in consideration
		{
			// Updating the minimum distance for the particular node.
			if (!visited[i] && graph[m][i] && dist[m] != INT_MAX && dist[m] + graph[m][i] < dist[i]) { //V.IMP condition
				parent[i] = m;     //updates parent node of each node -> This array will later be passed onto the printPath function to print the shortest path				
				dist[i] = dist[m] + graph[m][i];
			}
		}
	}
	printf("\n\n Destination\t\tDistance from source\n\n");
		char str = 65 + x; // Ascii values for printing A,B,C..
		printf("  %c\t\t\t%d\n ",str, dist[x]);
		printf("\n\n    SHORTEST PATH: ");
		printPath(parent, x);
		printf("\n\n\tTHANK YOUU!!\t\n\n");
}

int main() {
	char source; //to store the source node
	char dest;   //to  store the destonation node
	int graph[6][6] = {           //6x6 2D array
		{0, 10, 20, 0, 0, 0},
		{10, 0, 0, 50, 10, 0},
		{20, 0, 0, 20, 33, 0},
		{0, 50, 20, 0, 20, 2},
		{0, 10, 33, 20, 0, 1},
		{0, 0, 0, 2, 1, 0} };

	printf("     WELCOME TO METRO RAIL SERVICES");
	printf("\n\n    Station(from->to)        Distance");
	printf("\n         A->B                   10");
	printf("\n         A->C                   20");
	printf("\n         B->D                   50");
	printf("\n         B->E                   10");
	printf("\n         C->D                   20");
	printf("\n         C->E                   33");
	printf("\n         D->E                   20");
	printf("\n         D->F                   2");
	printf("\n         E->F                   1");
	printf("\n\nEnter the source(Enter in Capital letter): ");
	scanf("%c", &source);
	source = source - 65;//Converting ascii value back to number 


	printf("Enter the destination(Enter in Capital letter): ");
	scanf(" %c", &dest);
	dest = dest - 65;


	Dijkstra(graph, source, dest);
	return 0;
}


