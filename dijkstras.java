//dijikstras 7th
package dijkstras;
import java.util.Scanner;
public class dijkstras {
public static void main(String[] args) {
int n,source,i,j;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of vertices\n");
n=sc.nextInt();
int cost[][]=new int [n+1][n+1];
int dist[]=new int[n+1];
System.out.println("Enter the cost adjacency matrix\n");
for(i=1;i<=n;i++)
for(j=1;j<=n;j++)
{
cost[i][j]=sc.nextInt();
if(cost[i][j]==0)
cost[i][j]=999;
}
System.out.println("source\n");
source=sc.nextInt();
dijikstras(cost,dist,n,source);
for(i=1;i<=n;i++)
if(source!=i)
System.out.println(source+"->"+i+"::"+dist[i]);
}
static void dijikstras(int cost[][],int dist[],int n,int v)
{
int i,u=0,w,count,min;
int flag[]=new int[n+1];
for(i=1;i<=n;i++)
{
flag[i]=0;
dist[i]=cost[v][i];
}
flag[v]=1;
dist[v]=0;
count=2;
while(count<n)
{
for(i=1,min=999;i<=n;i++)
{
if((dist[i]<min) && (flag[i]==0))
{
min=dist[i];
u=i;
}
}
flag[u]=i;
count++;
for(w=1;w<=n;w++)
{
if((dist[u]+cost[u][w]<dist[w]) && (flag[w]==0))
dist[w]=dist[u]+cost[u][w];
}
}
}
}
