package Day3.scannerdemo;

public class Person {

    // Fields (variables)
    private String name;
    private int income;
    private String gender;
    private int age;
    private int tax;

    // Getters and Setters
    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString() - returns object details
    @Override
    public String toString() {
        return "Person [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + ", tax=" + tax + "]";
    }

    // Main method (optional, for testing)
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Chandru");
        p.setAge(25);
        p.setGender("male");
        p.setIncome(600000);
        p.setTax(54000);

        System.out.println(p);
    }
}
