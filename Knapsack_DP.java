//knapsack_dp 6b
import java.util.Scanner;
public class Knapsack_DP 
{
public static void main(String[] args) 
{
int n,i,j,capacity;
int w;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of items: \n");
n = sc.nextInt();
 System.out.println("Enter the capacity of kanpsack \n");
capacity = sc.nextInt();
int weight[]=new int[n+1],value[] = new int[n+1];
int V[][]=new int[n+2][capacity+2];
System.out.println("\nWEIGHTS - VALUES");
for(i=1;i<=n;i++)
{
weight[i]=sc.nextInt();
value[i] = sc.nextInt();
}

for(i=0;i<=n;i++)
{
 for(j=0;j<=capacity;j++)
 {
 if(i==0 || j==0)
V[i][j]=0;
 else if ( j-weight[i]>=0 )
 V[i][j]=max(V[i-1][j] ,V[i-1][j-weight[i]]+value[i]);
 else
V[i][j]=V[i-1][j];
 System.out.print(" "+V[i][j]);
 }
System.out.print("\n");
}
w=capacity;
System.out.println("The item in the knapsack \n");
for(i=n;i>0;i--)
{
 if(V[i][w]==V[i-1][w])
continue;
 else
 {
w=w-weight[i];
System.out.println("item="+i+"and weight="+weight[i]);
 }
}
System.out.println("\n Total profit="+V[n][capacity]);
}
static int max(int a,int b)
{
if(a>b)
return a;
else
return b;
}
}
