/*
Exercise 12 - Static 
04) Create a class named Employee

Instance Variables:
- empId
- empName
-basicSalary

Add methods
- calculateAllowances() - to compute:
-- HRA = 20% of basic salary
-- DA = 10% of basic salary

-calculateDeductions() - to compute:
-- PF = 5% of bsic calary

-generatePayslip() - to print:
-- Emplyee details
-- Basic Salary
-- Allowances
-- Deductions
-- Net Salary

In the main() method:
Create an object of Employee, Asign sample values, Call the methods, Display the payslip?
 */

package On1610;

class Employee {
    int empId;
    String empName;
    double basicSalary;
    double hra, da, pf, netSalary;

    void calculateAllowances() {
        hra = 0.20 * basicSalary; // HRA = 20% of basic salary
        da = 0.10 * basicSalary;  // DA = 10% of basic salary
    }

    void calculateDeductions() {
        pf = 0.05 * basicSalary;  // PF = 5% of basic salary
    }

    void generatePayslip() {
        netSalary = basicSalary + hra + da - pf;
        System.out.println("Employee Payslip");
        System.out.println("Employee ID       : " + empId);
        System.out.println("Employee Name     : " + empName);
        System.out.println("Basic Salary      : " + basicSalary);
        System.out.println("HRA (20%)         : " + hra);
        System.out.println("DA (10%)          : " + da);
        System.out.println("PF (5%)           : " + pf);
        System.out.println("Net Salary        : " + netSalary);
        System.out.println("");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.empId = 101;
        e1.empName = "Darshan Suresh";
        e1.basicSalary = 50000;

        e1.calculateAllowances();
        e1.calculateDeductions();
        e1.generatePayslip();
    }
}
