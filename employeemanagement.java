abstract class Employee{
 String Name;
 int Employeeid;
double basicsalary;
public Employee(String Name,int Employeeid,double basicsalary){
    this.Name=Name;
    this.Employeeid=Employeeid;
    this.basicsalary=basicsalary;
}
abstract double calculateSalary();
public void displaySalary(){
 System.out.println("Employee ID:"+Employeeid);
System.out.println("Employee Name:"+Name);
System.out.println("Salary:"+calculateSalary());
}
}
class FullTimeEmployee extends Employee
{
FullTimeEmployee(String Name,int Employeeid,double basicsalary)
{
super(Name,Employeeid,basicsalary);
}

public double calculateSalary()
{
return basicsalary+(0.2*basicsalary);
}
}
class PartTimeEmployee extends Employee
{
public double hourlyRate;
public int hoursworked;
PartTimeEmployee(String Name,int Employeeid,double basicsalary,double hourlyRate,int hoursworked)
{
super(Name,Employeeid,basicsalary);
this.hourlyRate=hourlyRate;
this.hoursworked=hoursworked;
}

public double calculateSalary()
{
return basicsalary+(hourlyRate*hoursworked);
}
}
public class EmployeeManagementSystem{
  public static void main(String[] args)
{
FullTimeEmployee FullTimeemp=new FullTimeEmployee("Alice",105,50000);
PartTimeEmployee PartTimeemp=new PartTimeEmployee("Bob",106,20000,20.5,8);
FullTimeemp.displaySalary();
PartTimeemp.displaySalary();
}
}
