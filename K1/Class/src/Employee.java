public class Employee {
    public String name;
    public String family;
    public int age;
    public String post;
    public int salary = 0;
    public int id;
    public void printName () {
        System.out.println(name + " " + family);
    }
    public void printPost () {
        System.out.println(family + "'s Post: " + post);
    }
    public void printSalary () {
        System.out.println(family + "'s Salary: " + salary);
    }
    public void printID () {
        System.out.println(family + "'s ID: " + id);
    }
}