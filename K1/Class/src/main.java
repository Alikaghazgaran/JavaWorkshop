import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int i;
        Scanner scan = new Scanner(System.in);

        Employee emp1 = new Employee();
        System.out.print("Enter 1st Employee's Name: ");
        String temp = scan.nextLine();
        emp1.name = temp;
        System.out.print("Family Name: ");
        temp = scan.nextLine();
        emp1.family = temp;
        System.out.print("Age: ");
        temp = scan.nextLine();
        int tmp = Integer.parseInt(temp);
        emp1.age = tmp;
        System.out.print("Post: ");
        temp = scan.nextLine();
        emp1.post = temp;
        System.out.print("Salary: ");
        temp = scan.nextLine();
        tmp = Integer.parseInt(temp);
        emp1.salary = tmp;
        System.out.print("ID: ");
        temp = scan.nextLine();
        tmp = Integer.parseInt(temp);
        emp1.id = tmp;

        Employee emp2 = new Employee();
        System.out.print("Enter 2nd Employee's Name: ");
        temp = scan.nextLine();
        emp2.name = temp;
        System.out.print("Family Name: ");
        temp = scan.nextLine();
        emp2.family = temp;
        System.out.print("Age: ");
        temp = scan.nextLine();
        tmp = Integer.parseInt(temp);
        emp2.age = tmp;
        System.out.print("Post: ");
        temp = scan.nextLine();
        emp2.post = temp;
        System.out.print("Salary: ");
        temp = scan.nextLine();
        tmp = Integer.parseInt(temp);
        emp2.salary = tmp;
        System.out.print("ID: ");
        temp = scan.nextLine();
        tmp = Integer.parseInt(temp);
        emp2.id = tmp;

        Employee emp3 = new Employee();
        System.out.print("Enter 3rd Employee's Name: ");
        temp = scan.nextLine();
        emp3.name = temp;
        System.out.print("Family Name: ");
        temp = scan.nextLine();
        emp3.family = temp;
        System.out.print("Age: ");
        temp = scan.nextLine();
        tmp = Integer.parseInt(temp);
        emp3.age = tmp;
        System.out.print("Post: ");
        temp = scan.nextLine();
        emp3.post = temp;
        System.out.print("Salary: ");
        temp = scan.nextLine();
        tmp = Integer.parseInt(temp);
        emp3.salary = tmp;
        System.out.print("ID: ");
        temp = scan.nextLine();
        tmp = Integer.parseInt(temp);
        emp3.id = tmp;

        System.out.println();
        emp1.printName();
        emp1.printPost();
        emp1.printSalary();
        emp1.printID();
        emp2.printName();
        emp2.printPost();
        emp2.printSalary();
        emp2.printID();
        emp3.printName();
        emp3.printPost();
        emp3.printSalary();
        emp3.printID();
        System.out.println();

        if (emp2.id==emp1.id) {
            System.out.println("Employee " + emp2.name + " " + emp2.family + " Can't Be Made!");
            System.exit(0);
        }
        if (emp3.id==emp1.id) {
            System.out.println("Employee " + emp3.name + " " + emp3.family + " Can't Be Made!");
            System.exit(0);
        }
        if (emp3.id==emp2.id) {
            System.out.println("Employee " + emp3.name + " " + emp3.family + " Can't Be Made!");
            System.exit(0);
        }
    }
}