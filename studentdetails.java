// 1a) lab program(student details)
package studentdetails;
import java.util.Scanner;
class Student{
String USN, Name, Branch, Phone;
Scanner input = new Scanner(System.in);
void read() 
{
System.out.println("Enter Student Details");
System.out.println("Enter USN");
USN = input.nextLine();
System.out.println("Enter Name");
Name = input.nextLine();
System.out.println("Enter Branch");
Branch = input.nextLine();
System.out.println("Enter Phone");
Phone = input.nextLine();
}
void display()
{
System.out.printf( USN+" "+Name+" "+Branch+" "+Phone);
}
}
public class studentdetails 
{
public static void main(String[] args) 
{
Scanner input = new Scanner(System.in);
System.out.println("Enter number of student details to be created");
int number = input.nextInt();
Student s[] = new Student[number];
for (int i = 0; i < number; i++) 
{
s[i] = new Student();
s[i].read();
}

System.out.println("Student details :");
System.out.println(" ");
System.out.println("USN NAME BRANCH PHONE");
for (int i = 0; i < number; i++) 
{
s[i].display();
}
}
}
