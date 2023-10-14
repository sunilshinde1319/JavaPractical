package shinde;

import java.util.Scanner;

public class SalaryCalculator {

    private int empno;
    private String empname;
    private double basic;
    private double DA;
    private double HRA;
    private double CCA = 240;
    private double PF;
    private double PT = 100;

    public SalaryCalculator(int empno, String empname, double basic) {
        this.empno = empno;
        this.empname = empname;
        this.basic = basic;
        calculateComponents();
    }

    private void calculateComponents() {
        this.DA = 0.50 * basic;
        this.HRA = 0.25 * basic;
        this.PF = 0.10 * basic;
    }

    public double grossSalary() {
        return basic + DA + HRA + CCA;
    }

    public double netSalary() {
        return grossSalary() - (PF + PT);
    }

    public void displaySalaryDetails() {
        System.out.println("Employee No: " + empno);
        System.out.println("Employee Name: " + empname);
        System.out.println("Gross Salary: " + grossSalary());
        System.out.println("Net Salary: " + netSalary());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee Number:");
        int empno = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        System.out.println("Enter Employee Name:");
        String empname = scanner.nextLine();

        System.out.println("Enter Basic Salary:");
        double basic = scanner.nextDouble();

        SalaryCalculator salary = new SalaryCalculator(empno, empname, basic);
        salary.displaySalaryDetails();

        scanner.close();
    }
}

