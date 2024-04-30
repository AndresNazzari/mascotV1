package veterinary.factory;

import veterinary.person.Adopter;

import javax.swing.*;

public class AdopterFactory {
    public static Adopter createAdopter(){
        String name = JOptionPane.showInputDialog(null, "Enter the name of the adopter:", "Add Adopter", JOptionPane.QUESTION_MESSAGE);
        int age = getIntInput("Enter the age of the adopter:", "Add Adopter");
        String address = JOptionPane.showInputDialog(null, "Enter the address of the adopter:", "Add Adopter", JOptionPane.QUESTION_MESSAGE);
        return new Adopter(name, age, address);
    }

    private static int getIntInput(String message, String title) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
                int value = Integer.parseInt(input);
                if (value < 0) {
                    throw new IllegalArgumentException("Invalid input. Please enter a non-negative integer.");
                }
                if (value < 18) {
                    throw new IllegalArgumentException("You must be at least 18 years old to adopt a pet.");
                }
                return value;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
