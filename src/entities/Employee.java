package entities;

public class Employee {
    private String name;
    private Double grossSalary;

    public Employee(){
    }
    public Employee(String name, Double grossSalary) {
        this.grossSalary = grossSalary;
        this.name = name;
    }

    public Double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(Double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", grossSalary=" + grossSalary +
                '}';
    }
}
