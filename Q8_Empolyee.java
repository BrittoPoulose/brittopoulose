import java.io.*;
import java.util.Scanner;

class Q8_Employee {
    int eNo, eSalary;
    String eName;

    void read() throws IOException {
        System.out.print("\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Number: ");
        eNo = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        eName = sc.next();

        System.out.print("Enter Employee Salary: ");
        eSalary = sc.nextInt();
    }

    void Display() throws IOException {
        System.out.println("Name of the Employee: " + eName);
        System.out.println("Salary of the Employee: " + eSalary);
    }

    public static void main(String args[]) throws IOException {
        int n;
        int emp;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        n = sc.nextInt();

        Q8_Employee s[] = new Q8_Employee[n];

        for (int i = 0; i < n; i++) {
            s[i] = new Q8_Employee();
            s[i].read();
        }
        
        System.out.print("\nEnter the Employee number to search: ");
        emp = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (emp == s[i].eNo) {
                s[i].Display();
            }
        }
    }
}