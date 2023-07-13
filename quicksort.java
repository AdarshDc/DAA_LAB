//quicksort 5th
package quicksort;
import java.util.*;
public class quicksort {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the number of elements to sort:");
int n = input.nextInt();
int inputArr[]= new int[n+1];
Random rand = new Random();
for( int i=0; i<n ; i++)
{
inputArr[i]=rand.nextInt(10);
System.out.print(inputArr[i] + " ");
}
System.out.println();
long startTime = System.nanoTime();
quicksort(inputArr, 0, n-1);
long estimatedTime = System.nanoTime() - startTime;
System.out.println();
System.out.println("After Sorting");
for( int i=0; i<n ; i++)
{
System.out.print(inputArr[i] +" ");
}
System.out.println();
System.out.println("The time for sorting is " + (estimatedTime/1000000000.0)+ " secs");
input.close();
}
static void quicksort(int a[],int low,int high)
{
int j;
if(low<high)
{
j=partition(a,low,high);
quicksort(a,low,j-1);
quicksort(a,j+1,high);
}
}
static int partition(int a[],int low,int high)
{
int i,j;
int pivot;
pivot=a[low];
i=low;
j=high+1;
do
{
do i++; while(a[i]<pivot);
do j--; while(a[j]>pivot);
if(i<j)
swap(a,i,j);
}while(i<j);
swap(a,low,j);
return j;
}
static void swap(int a[],int i,int j)
{
int temp;
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
