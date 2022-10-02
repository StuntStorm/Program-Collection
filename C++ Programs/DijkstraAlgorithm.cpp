//DijkstraAlgorithm
#include<iostream>
#include<vector>
#include<queue>
using namespace std;
vector<pair<int, int>>adj[100001];
priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>>pq;
int dist[100001];
int main()
{
    int i, n, m, u, v, wt;
    cin>>n>>m;
    for(i=1;i<=m;i++)
    {
        cin>>u>>v>>wt;
        adj[u].push_back(make_pair(v, wt));
        adj[v].push_back(make_pair(u, wt));
    }
    for(i=0;i<100001;i++)
    dist[i]=100001;
    dist[1]=0;
    pq.push(make_pair(0, 1));
    while(pq.empty()==0)
    {
        u=pq.top().second;
        pq.pop();
        for(auto j:adj[u])
        {
            if(dist[j.first]>(dist[u]+j.second))
            {
                dist[j.first]=dist[u]+j.second;
                pq.push(make_pair(dist[j.first], j.first));
            }
        }
    }
    for(i=1;i<=n;i++)
    cout<<i<<" -> "<<dist[i]<<endl;
    return 0;
}