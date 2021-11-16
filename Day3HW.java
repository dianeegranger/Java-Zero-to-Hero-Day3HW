/*
November 14, 2021

Diane Granger
dianeegranger@gmail.com

Java Programming Zero to Hero
LetsUpgrade
Instructor:  Subrat Kumar Swain

Day 3 Assignment:

Define a class "Employee" with the following members:

int eid
String name
float salary
inputDetails()
showDetails()


The data members should be private and you should use 
inputDetails() and showDetails() to set the details 
and to print the details respectively.

Define a driver class "EmployeeDetails" which will drive 
the entire program i.e. it will contain the main method.

*/

import java.util.Scanner;
class Employee {
  // Data members
  private int eid;
  private String name;
  private float salary;
  
  //Methods
  void inputDetails() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Employee ID: ");
    eid = sc.nextInt();

    sc.nextLine();

    System.out.print("Enter the Employee Name: ");
    name = sc.nextLine();

    System.out.print("Enter the Employee Salary: ");
    salary = sc.nextFloat();

    sc.close();
  }

  void showDetails() {
    System.out.println("Employee Data:");
    System.out.println("Employee ID: " + eid); 
    System.out.println("Employee Name: " + name);
    System.out.println("Employee Salary: " + salary);
  }
}

// Driver Class 
class EmployeeDetails {
  public static void main(String[] args) {

    Employee ob = new Employee();  // instantiate an Employee Object
    ob.inputDetails();
    ob.showDetails();

  }
}

/*
OUTPUT:
PS C:\Users\diane\OneDrive\Desktop\DianeGrangerWork\Java Zero to Hero> javac Day3HW.java
PS C:\Users\diane\OneDrive\Desktop\DianeGrangerWork\Java Zero to Hero> java EmployeeDetails
Enter the Employee ID: 1234
Enter the Employee Name: Jane Doe
Enter the Employee Salary: 60000
Employee Data:
Employee ID: 1234
Employee Name: Jane Doe
Employee Salary: 60000.0
PS C:\Users\diane\OneDrive\Desktop\DianeGrangerWork\Java Zero to Hero>
*/