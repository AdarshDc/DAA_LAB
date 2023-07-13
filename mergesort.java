//merge sort 4th
package mergesort;
import java.util.*;
public class mergesort {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter the elements to be sort:");
int n =input.nextInt();
int [] inputArr = new int [n];
Random rand = new Random();
for(int i=0;i<n;i++)
{
inputArr[i]=rand.nextInt(10);
System.out.println(inputArr[i]+" ");
}
System.out.println();
long startTime = System.nanoTime();
mergeSort(inputArr, n);
long estimatedTime = System.nanoTime() - startTime;
System.out.println();
System.out.println("sorted elemts are:");
for (int i=0;i<n;i++)
{
System.out.println(inputArr[i]+" ");
}
System.out.println();
System.out.println("The time for sorting is"+(estimatedTime/1000000000.0)+" secs ");
}
static void mergeSort(int a[],int n)
{ 
int b[] = new int [n/2];
int c[] = new int [n-n/2];
int i, j;
if(n>1)
{ 
for(i=0;i<n/2;i++) 
{
b[i]=a[i];
}
for(i=n/2,j=0;i<n;i++,j++)
{
c[j]=a[i];
}
mergeSort(b, n/2);
mergeSort(c, n-n/2);
merge(b, c, a, n/2 ,n-n/2, n);
}
}
static void merge(int b[], int c[], int a[], int p, int q, int n)
{
int i,j,k;
i=j=k=0;
while(i<p && j<q)
{
if(b[i]<=c[j])
{
a[k]=b[i];
i++;
}
else
{
a[k]=c[j];
j++;
}
k++;
}
if(i==p)
{
while(j<q) 
{
a[k++]=c[j++];
}
}
else
{
while(i<p) 
{
a[k++]=b[i++];
}
}
}
}
