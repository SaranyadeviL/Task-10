public class Tea {
    private boolean hasMilk;
    private boolean hasSugar;
    //constructor
    public Tea() {
        this.hasMilk = false;
        this.hasSugar = false;

    }

    //Method to prepare basic tea
    public void prepareTea() {
        System.out.println("Preparing basic tea with hot water and tea leaves.");
    }

    //Method to add milk to tea
    public void addMilk() {
        if(!hasMilk){
            hasMilk = true;
            System.out.println("Adding milk to the tea.");
        } else
        {
        System.out.println("Milk is already added");
    }
}
 // Method to add sugar to the tea
    public void addSugar() {
        if (!hasSugar) {
            hasSugar= true;
            System.out.println("Adding sugar to the tea.");
        } else {
            System.out.println("Sugar is already added.");
        }
    }

    // main method for testing
    public static void main(String[] args) {
         //Creating a Tea object
        Tea myTea = new Tea();

        //prepare a basic tea
        myTea.prepareTea();

        //Add milk
        myTea.addMilk();

        //Add Sugar
        myTea.addSugar();

    }
}
