package Day3.scannerdemo;

public class PersonDemo {
    private String name;
    private int age;
    private String gender;
    private double income;
    private double tax;

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public double getIncome() { return income; }
    public void setIncome(double income) { this.income = income; }

    public double getTax() { return tax; }
    public void setTax(double tax) { this.tax = tax; }

    @Override
    public String toString() {
        return "Person [Name=" + name + ", Age=" + age + ", Gender=" + gender +
               ", Income=" + income + ", Tax=" + tax + "]";
    }
}
