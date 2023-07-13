// 1b lab program(stack)
package stacks;
import java.util.Scanner;
public class stacks
{
public static void main(String[] args) 
{
int top=-1;
int ele,n,i;
Scanner s = new Scanner(System.in);
System.out.println("Enter Stack Size");
n = s.nextInt();
int a[] = new int[n+1];
System.out.println("enter your choice");
System.out.println("1.push\n 2.pop\n 3.display\n");
for(;;)
{
System.out.println("enter your choice\n");
int choice = s.nextInt();
switch (choice)
{
case 1:if(top==n)
{
System.out.println("stack overflow\n");
}
else
{
System.out.println("Enter element to be pushed");
ele = s.nextInt();
a[++top] = ele;
}
break;
case 2: if(top == -1)
{
System.out.println("Stack Underflow");
}
else
{
System.out.println("Popped element " + a[top--]);
}
break;
case 3: if(top== -1)
{
System.out.println("Stack Empty");
}
else
{
System.out.println("Elements in stack :");
for ( i = top; i >= 0; i--)
{
System.out.println(a[i]);
}
}
break;
case 4: System.exit(0);
break;
}
}
}
}
