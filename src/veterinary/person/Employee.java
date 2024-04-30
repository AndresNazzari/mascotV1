package veterinary.person;

import javax.swing.*;

public class Employee extends Person {
    private static Employee instance;
    private String position;

    public Employee(String name, String position) {
        super(name);
        this.setPosition(position);
    }

    public static Employee getInstance() {
        if (instance == null) {
            registerEmployee();
        }
        return instance;
    }

    public static void registerEmployee() {
        try {
            String name = JOptionPane.showInputDialog(null, "Enter the name of the employee:", "Register Employee", JOptionPane.QUESTION_MESSAGE);
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty.");
            }

            String position = JOptionPane.showInputDialog(null, "Enter the position of the employee:", "Register Employee", JOptionPane.QUESTION_MESSAGE);
            if (position == null || position.trim().isEmpty()) {
                throw new IllegalArgumentException("Position cannot be empty.");
            }

            instance = new Employee(name, position);

            JOptionPane.showMessageDialog(null, "Employee registered successfully:\n" + Employee.getInstance().toString(), "Employee Registered", JOptionPane.INFORMATION_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee information: \n" +
                "Name: " + this.getName() + "\n" +
                "Position: " + this.getPosition() + ".";
    }

}
