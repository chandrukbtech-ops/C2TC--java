package Day3.encapsulation;

public class OopsConceptDemo {

    // Private variables (Encapsulation)
    private int serialNum;
    private String name;
    private int age;

    // Getter and Setter methods
    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString method - returns object details
    @Override
    public String toString() {
        return "OopsConceptDemo [Serial Number=" + serialNum + ", name=" + name + ", age=" + age + "]";
    }

    // Main method to test the encapsulation
    public static void main(String[] args) {
        OopsConceptDemo obj = new OopsConceptDemo();
        obj.setSerialNum(1);
        obj.setName("Chandru");
        obj.setAge(22);

        System.out.println(obj.toString());
    }
}
