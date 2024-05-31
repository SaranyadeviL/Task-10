public class TeaTest{
    public static void main(String[] args) {
        Tea blacktea = new BlackTea();
        blacktea.prepareTea();
        blacktea.addMilk();
        blacktea.addSugar();

        Tea greenTea = new GreenTea();
        greenTea.prepareTea();
        greenTea.addSugar();

        Tea herbalTea = new HerbalTea();
        herbalTea.prepareTea();
        herbalTea.addMilk();
    }
}
