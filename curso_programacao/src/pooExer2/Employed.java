package pooExer2;

import java.util.Scanner;

public class Employed {
    private String name;
    private double grossySalary;
    private double tax;

    Scanner leia = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossySalary() {
        return grossySalary;
    }

    public void setGrossySalary(double grossySalary) {
        this.grossySalary = grossySalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double netSalary(){
        return this.getGrossySalary() - this.getTax();
    }

    public void increaseSalary(double porcentage){
        double cal =this.grossySalary * porcentage/100;
        cal = cal + netSalary();
        System.out.println(cal);

    }

    public String toString(){
        return this.getName() + ", " + netSalary();
    }
}
