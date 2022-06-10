package entities;

import java.util.Scanner;

public class Employed {
    private Integer id;
    private String name;
    private Double salary;

    public Employed(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void aumento(double p){
         salary += salary*p/100;
    }

    public String toString(){
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }


}
