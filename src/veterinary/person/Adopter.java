package veterinary.person;

public class Adopter extends Person {
    private int age;
    private String address;

    public Adopter(String name, int age, String address) {
        super(name);
        this.setAge(age);
        this.setAddress(address);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Adopter information: \n" +
                "Name: " + this.getName() + ":\n" +
                "Age: " + this.getAge() + ":\n" +
                "Address: " + this.getAddress() + ".";
    }
}
