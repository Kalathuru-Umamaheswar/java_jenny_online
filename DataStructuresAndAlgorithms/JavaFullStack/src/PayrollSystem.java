
    class Employee {
        int id = 101;
        String name = "Ravi";
    }

    class Payroll extends Employee1 {
        double salary = 50000;

        void display() {
            Employee obj=new Employee();
            System.out.println("Employee ID: " + obj.id);
            System.out.println("Employee Name: " + obj.name);
            System.out.println("Salary: " + salary);
        }
    }

    public class PayrollSystem {
        public static void main(String[] args) {
            Payroll p = new Payroll();
            p.display();
        }
    }

