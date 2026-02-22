package lab3H;

public class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary() { return baseSalary; }
}

interface SalaryStrategy {
    double calculate(double baseSalary);
}

class PermanentSalary implements SalaryStrategy {
    public double calculate(double baseSalary) { return baseSalary * 1.2; }
}

class ContractSalary implements SalaryStrategy {
    public double calculate(double baseSalary) { return baseSalary * 1.1; }
}

class EmployeeSalaryCalculator {
    public double calculateSalary(Employee employee, SalaryStrategy strategy) {
        return strategy.calculate(employee.getBaseSalary());
    }
}