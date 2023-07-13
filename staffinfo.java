//staff info 2a
package staffinfo;
import java.util.Scanner;
class Staff {
String StaffID, Name, Phone, Salary;
Scanner input = new Scanner(System.in);
void read() {
System.out.println("Enter StaffID");
StaffID = input.nextLine();
System.out.println("Enter Name");
Name = input.nextLine();
System.out.println("Enter Phone");
Phone = input.nextLine();
System.out.println("Enter Salary");
Salary = input.nextLine();
}
void display() {
System.out.println("STAFFID: " +StaffID);
System.out.println("NAME: "+Name);
System.out.println("PHONE:"+Phone);
 System.out.println("SALARY:"+Salary);
}
}
class Teaching extends Staff {
String Domain, Publication;
void read_Teaching() {
super.read();
System.out.println("Enter Domain");
Domain = input.nextLine();
System.out.println("Enter Publication");
Publication = input.nextLine();
}
void display() {
super.display(); 
System.out.println("DOMAIN:"+Domain);
System.out.println("PUBLICATION:"+Publication);
}
}
class Technical extends Staff {
String Skills;
void read_Technical() {
super.read(); 

System.out.println("Enter Skills");
Skills = input.nextLine();
}
void display() {
super.display();
System.out.println("SKILLS:"+Skills);
}
}
class Contract extends Staff {
String Period;
void read_Contract() {
super.read();
System.out.println("Enter Period");
Period = input.nextLine();
}
void display() {
super.display(); 
System.out.println("PERIOD:"+Period);
}
}
public class staffinfo { 
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter number of staff details to be created");
int n = input.nextInt();
Teaching steach[] = new Teaching[n];
Technical stech[] = new Technical[n];
Contract scon[] = new Contract[n];

for (int i = 0; i < n; i++) {
System.out.println("Enter Teaching staff information");
steach[i] = new Teaching();
steach[i].read_Teaching();
}
for (int i = 0; i < n; i++) {
System.out.println("Enter Technical staff information");
stech[i] = new Technical();
stech[i].read_Technical();
}
for (int i = 0; i < n; i++) {
System.out.println("Enter Contract staff information");
scon[i] = new Contract();
scon[i].read_Contract();
}

System.out.println("\n STAFF DETAILS: \n");
System.out.println("-----TEACHING STAFF DETAILS----- ");
for (int i = 0; i < n; i++) {
steach[i].display();
}
System.out.println();
System.out.println("-----TECHNICAL STAFF DETAILS-----");
for (int i = 0; i < n; i++) {
stech[i].display();
}
System.out.println();
System.out.println("-----CONTRACT STAFF DETAILS-----");
for (int i = 0; i < n; i++) {
scon[i].display();
}

}
}