package veterinary.person;

public class Employee extends Person {
    private static Employee instance = null;
    private String position;

    public Employee(String name, String position){
        super(name);
        this.setPosition(position);
    }

    public static Employee getInstance (String name, String position) {
        if (instance == null){
            instance = new Employee(name, position);
        }
        return instance;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {return position;}

    @Override
    public String toString(){
        return "Employee information: \n" +
                "Name: " + this.getName() + "\n" +
                "Position: " + this.getPosition() + ".";
    }

}
