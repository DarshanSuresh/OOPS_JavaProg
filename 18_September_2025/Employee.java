/*
Create a java class Employee with following: 
A static variable company name  
Instance variable id and salary  

A method display EmployeeDetail() that uses local variable bonus to calculate total salary. 
Create objects for multiple employees and display there details. 
 */
package On1809;

public class Employee { 
    static String companyName = "Google"; 

    int id; 
    double salary; 

    public Employee(int id, double salary) { 
        this.id = id; 
        this.salary = salary; 
    } 

    public void displayEmployeeDetail() { 
        double bonus = 5000;  
        double totalSalary = salary + bonus; 

        System.out.println("Company: " + companyName); 
        System.out.println("Employee ID: " + id); 
        System.out.println("Base Salary: " + salary); 
        System.out.println("Bonus: " + bonus); 
        System.out.println("Total Salary: " + totalSalary); 
        System.out.println("------------------------"); 
    } 

    public static void main(String[] args) { 
        
        Employee emp1 = new Employee(101, 75000); 
        Employee emp2 = new Employee(102, 85000); 
        Employee emp3 = new Employee(103, 95000); 

        emp1.displayEmployeeDetail(); 
        emp2.displayEmployeeDetail(); 
        emp3.displayEmployeeDetail(); 
    } 
} 
