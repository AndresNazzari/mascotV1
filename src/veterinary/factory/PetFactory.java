package veterinary.factory;

import veterinary.pet.Cat;
import veterinary.pet.Dog;
import veterinary.pet.Pet;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class PetFactory {

    public static Pet createPet(List<String> options) {
        String selectedOption = (String) JOptionPane.showInputDialog(
                null,
                "Choose the species of the pet:",
                "Select Pet Species",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options.toArray(),
                options.get(0)
        );

        if (selectedOption == null) {
            throw new IllegalArgumentException("No species selected");
        }

        return switch (selectedOption.toLowerCase()) {
            case "dog" -> createDog();
            case "cat" -> createCat();
            default -> throw new IllegalArgumentException("Species " + selectedOption + " not recognized");
        };
    }


    private static Pet createDog() {
        String name = JOptionPane.showInputDialog(null, "Enter the name of the dog:", "Create Dog", JOptionPane.QUESTION_MESSAGE);
        Date birthDate = getDateInput("Enter the birth date of the dog (dd/MM/yyyy):", "Create Dog");
        double weight = getDoubleInput("Enter the weight of the dog:", "Create Dog");
        int vetVisits = getIntInput("Enter the number of vet visits per month:", "Create Dog");
        int walksPerDay = getIntInput("Enter the number of walks per day:", "Create Dog");
        int mealsPerDay = getIntInput("Enter the number of meals per day:", "Create Dog");
        String breed = JOptionPane.showInputDialog(null, "Enter the breed of the dog:", "Create Dog", JOptionPane.QUESTION_MESSAGE);
        return new Dog(name, birthDate, weight, vetVisits, "Dog", breed, walksPerDay, mealsPerDay);
    }

    private static Cat createCat() {
        String name = JOptionPane.showInputDialog(null, "Enter the name of the cat:", "Create Cat", JOptionPane.QUESTION_MESSAGE);
        Date birthDate = getDateInput("Enter the birth date of the cat (dd/MM/yyyy):", "Create Cat");
        double weight = getDoubleInput("Enter the weight of the cat:", "Create Cat");
        int vetVisits = getIntInput("Enter the number of vet visits per month:", "Create Cat");
        int litterBoxes = getIntInput("Enter the number of litter boxes:", "Create Cat");
        int scratchers = getIntInput("Enter the number of scratchers:", "Create Cat");
        String breed = JOptionPane.showInputDialog(null, "Enter the breed of the cat:", "Create Cat", JOptionPane.QUESTION_MESSAGE);
        return new Cat(name, birthDate, weight, vetVisits, "Cat", breed, litterBoxes, scratchers);
    }

    private static Date getDateInput(String message, String title) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                return dateFormat.parse(input);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Invalid date format. Please enter date in format dd/MM/yyyy.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static double getDoubleInput(String message, String title) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
                double value = Double.parseDouble(input);
                if (value < 1) {
                    throw new IllegalArgumentException("Invalid input. Please enter a non-negative number.");
                }
                return value;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static int getIntInput(String message, String title) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
                int value = Integer.parseInt(input);
                if (value < 1) {
                    throw new IllegalArgumentException("Invalid input. Please enter a non-negative integer.");
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
