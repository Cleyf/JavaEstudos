package pooExer2;

public class TestEmployed {
    public static void main(String[] args) {
        Employed e = new Employed();
        e.setName("Lailo de Carvalho");
        e.setGrossySalary(6000.00);
        e.setTax(1000);

        e.netSalary();
        e.increaseSalary(10);
        System.out.println(e.toString());
    }
}
