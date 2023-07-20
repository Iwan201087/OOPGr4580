package Task01_SRP;

public class Calculate {
    private int baseSalary;

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);
        return baseSalary - tax;
    }
}