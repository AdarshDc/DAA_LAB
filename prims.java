//prims 9th
package prims;
import java.util.Scanner;
public class prims {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int mincost=0,n,i,j,ne,a=0,b=0,min,u = 0,v=0;
System.out.println("Enter the number of vertices\n");
n=sc.nextInt();
int cost[][]= new int [n+1][n+1];
int visited[]=new int[n+1];
System.out.println("Enter the cost matrix\n");
for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
{
cost[i][j]=sc.nextInt();
if(cost[i][j]==0)
cost[i][j]=999;
}
}
for(i=2;i<=n;i++)
visited[i]=0;
visited[1]=1;
ne=1;
while(ne<n)
{
for(min=999,i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
{
if(cost[i][j]<min)
{
if(visited[i]==0)
continue;
else
{
min=cost[i][j];
a=u=i;
b=v=j;
}
}
}
}
if(visited[u]==0||visited[v]==0)
{
System.out.println((ne++)+"edge("+a+","+b+")="+min);
mincost+=min;
visited[v]=1;
}
cost[a][b]=cost[b][a]=999;
} //end of while
System.out.println("The minimum cost of spanning tree is "+mincost);
}
}
