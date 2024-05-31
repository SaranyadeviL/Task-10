public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    //constructor
    public Employee(int id, String firstName, String lastName, int salary){
        this.id=id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    //getter methods
    public int getId(){
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    //setter methods
    public void setFirstName(){
        this.firstName = firstName;
    }
    public void setLastName(){
        this.lastName = lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //method to get full name
    public String getName(){
        return firstName +"" + lastName;
    }

    //method to get annual salary
    public int getAnnualSalary(){
        return salary * 12;
    }

    // method to raise salary by a percentage
    public void raiseSalary(int percent){
        this.salary += this.salary * percent / 100;
    }

    // to String method
    public String toString(){
        return "Employee[id=" + id + ", name" + getName()+ " , salary="  + salary +"]" ;
    }

    //main method
    public static void main(String[] args) {
        Employee emp = new Employee(1243, "Abinaya", "Shree",50000);
        System.out.println(emp);  // before raise
        emp.raiseSalary(10); // raise salary by 10 percent
        System.out.println(emp); //after raised
    }
}
