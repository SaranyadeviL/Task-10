public class Person {
    private String name;
    private int age;

    //constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //getter method for name and age
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Person p1= new Person("peter", 40 );
        System.out.println(" Name: " + p1.getName());
        System.out.println(" Age: " + p1.getAge());
    }
}
