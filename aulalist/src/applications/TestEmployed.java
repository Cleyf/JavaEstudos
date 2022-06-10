package applications;

import entities.Employed;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TestEmployed {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("How many employes will be registered");
    int N = sc.nextInt();

    List <Employed> list = new ArrayList<>();

    for (int i=0;i<N; i++) {

        System.out.println();
        System.out.println("Employee #" + (i + 1) + " : ");
        System.out.print("Id: ");
        Integer id = sc.nextInt();
        System.out.println("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Salary");
        Double salary = sc.nextDouble();

        Employed emp = new Employed(id, name, salary);

        list.add(emp);
    }

    System.out.println("Enter the employee id that will have salary increase: ");
    int idsalary = sc.nextInt();
    Integer pos = position(list, idsalary);
    if (pos == null) {
        System.out.println("This id does not exist! ");
    } else {
        System.out.println("Enter the percentage");
        double percent = sc.nextDouble();
        list.get(pos).aumento(percent);
    }

    System.out.println();
    System.out.println("List of employees; ");

    for (Employed emp : list) {
        System.out.println(emp);
    }

    sc.close();
    }


    public static int position(List<Employed> list, int id ) {
        for (int i = 0; i< list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
            return -1;
    }
}
