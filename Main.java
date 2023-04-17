import java.util.Scanner;

class Employee {
    private int empid;
    private String name;
    private double salary;
    private double PF;
    private double HRA;

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPF(double PF) {
        this.PF = PF;
    }

    public void setHRA(double HRA) {
        this.HRA = HRA;
    }

    public int getEmpid() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getPF() {
        return PF;
    }

    public double getHRA() {
        return HRA;
    }

    public double getTotalSalary() {
        return salary + HRA - PF;
    }
}

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number of employees: ");
            int n = scanner.nextInt();

            Employee[] employees = new Employee[n];

            for (int i = 0; i < n; i++) {
                Employee employee = new Employee();

                System.out.println("Enter details for employee " + (i + 1) + ":");
                System.out.print("Enter empid: ");
                int empid = scanner.nextInt();
                employee.setEmpid(empid);

                System.out.print("Enter name: ");
                String name = scanner.next();
                employee.setName(name);

                System.out.print("Enter salary: ");
                double salary = scanner.nextDouble();
                employee.setSalary(salary);

                System.out.print("Enter PF: ");
                double PF = scanner.nextDouble();
                employee.setPF(PF);

                System.out.print("Enter HRA: ");
                double HRA = scanner.nextDouble();
                employee.setHRA(HRA);

                employees[i] = employee;
            }

            System.out.println("\nEmployee Details:");
            System.out.printf("%-10s %-20s %-10s %-10s %-10s %s\n", "EmpID", "Name", "Salary", "PF", "HRA",
                    "Total Salary");

            for (Employee employee : employees) {
                System.out.printf("%-10d %-20s %-10.2f %-10.2f %-10.2f %.2f\n",
                        employee.getEmpid(), employee.getName(), employee.getSalary(), employee.getPF(),
                        employee.getHRA(), employee.getTotalSalary());
            }
        }
    }
}
