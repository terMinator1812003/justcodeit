class Emp {
    int salary;
    int empid;

    static String ceo;
    static {
        ceo = "ADARSH";

    }

    public void show() {
        System.out.println(salary + ":" + empid + ":" + ceo);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Emp harsh = new Emp();
        harsh.salary = 20;
        harsh.empid = 1;
        // Emp.ceo = "ADARSH";

        Emp chiransh = new Emp();
        chiransh.salary = 30;
        chiransh.empid = 2;
        // Emp.ceo = "ADARSH";

        harsh.show();
        chiransh.show();
    }
}
