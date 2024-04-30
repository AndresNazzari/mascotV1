package veterinary.factory;

import veterinary.adoption.Adoption;
import veterinary.person.Adopter;
import veterinary.person.Employee;
import veterinary.pet.Pet;

import javax.swing.*;
import java.util.List;

public class AdoptionFactory {
    public static Adoption createAdoption (List<Pet> pets, List<Adopter> adopters) {
        if (pets.isEmpty() || adopters.isEmpty()) {
            throw new IllegalArgumentException("There are no pets or adopters available for adoption.");
        }

        Pet selectedPet = selectPet(pets);
        Adopter selectedAdopter = selectAdopter(adopters);
        Employee employee = new Employee("Andres", "Boss");

        return new Adoption(selectedPet, selectedAdopter, employee);
    }

    private static Pet selectPet (List<Pet> pets) {
        Object[] options = pets
                .stream()
                .map(pet -> pet.getSpecies() + ": " + pet.getName() + " (" + pet.getBreed() + ").")
                .toArray();

        String selectedOption = (String)  JOptionPane.showInputDialog(
                null,
                "Select the pet for adoption:",
                "Select Pet",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        if (selectedOption == null) {
            throw new IllegalArgumentException("No pet selected.");
        }

        int selectedOptionIndex = -1;
        for (int i = 0; i < options.length; i++) {
            if (options[i].equals(selectedOption)) {
                selectedOptionIndex = i;
                break;
            }
        }

        if (selectedOptionIndex == -1) {
            throw new IllegalArgumentException("Invalid selection.");
        }

        return pets.get(selectedOptionIndex);
    }

    private static Adopter selectAdopter(List<Adopter> adopters) {
        Object[] options = adopters
                .stream()
                .map(adopter -> adopter.getName())
                .toArray();

        String selectedOption = (String) JOptionPane.showInputDialog(
                null,
                "Select the adopter:",
                "Select Adopter",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        if (selectedOption == null) {
            throw new IllegalArgumentException("No pet selected.");
        }

        int selectedOptionIndex = -1;
        for (int i = 0; i < options.length; i++) {
            if (options[i].equals(selectedOption)) {
                selectedOptionIndex = i;
                break;
            }
        }

        if (selectedOptionIndex == -1) {
            throw new IllegalArgumentException("Invalid selection.");
        }

        return adopters.get(selectedOptionIndex);
    }
}
