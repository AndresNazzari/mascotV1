import veterinary.adoption.Adoption;
import veterinary.factory.AdopterFactory;
import veterinary.factory.AdoptionFactory;
import veterinary.factory.PetFactory;
import veterinary.person.Adopter;
import veterinary.person.Employee;
import veterinary.pet.Pet;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static List<Pet> pets = new ArrayList<>();
    private static List<Adopter> adopters = new ArrayList<>();
    private static List<Adoption> adoptions = new ArrayList<>();

    public static void main(String[] args) {
        List<String> menuOptions = List.of("Add Pet", "Add Adopter", "Create Adoption", "Print Tickets", "Exit");
        List<String> petOptions = List.of("Dog", "Cat");
        Employee.getInstance();

        while (true) {
            String selectedOption = (String) JOptionPane.showInputDialog(null, "Choose an option:", "Menu", JOptionPane.QUESTION_MESSAGE, null, menuOptions.toArray(), menuOptions.get(0));
            if (selectedOption == null) { // User closed the dialog or clicked cancel
                break;
            }
            try {
                switch (selectedOption) {
                    case "Add Pet" -> addPet(petOptions);
                    case "Add Adopter" -> addAdopter();
                    case "Create Adoption" -> createAdoption();
                    case "Print Tickets" -> printTickets();
                    case "Exit" -> System.exit(0);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


    private static void addPet(List<String> petOptions) {
        Pet newPet = PetFactory.createPet(petOptions);
        pets.add(newPet);
        JOptionPane.showMessageDialog(
                null,
                "Pet added successfully:\n" + newPet.toString() + newPet.getRecommendations(),
                "Pet Added",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static void addAdopter() {
        Adopter newAdopter = AdopterFactory.createAdopter();
        adopters.add(newAdopter);
        JOptionPane.showMessageDialog(null, "Adopter added successfully:\n" + newAdopter.toString(), "Adopter Added", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void createAdoption() {
        Adoption newAdoption = AdoptionFactory.createAdoption(pets, adopters);
        adoptions.add(newAdoption);
        pets.remove(newAdoption.getPet());
        JOptionPane.showMessageDialog(null, "Adoption created:\n" + newAdoption.toString(), "Adoption Created", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void printTickets() {
        if (adoptions.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No adoptions have been made yet.", "No Adoptions", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        for (Adoption adoption : adoptions) {
            StringBuilder tickets = new StringBuilder();
            tickets.append("------------------------------\n");
            tickets.append("Adoption Ticket:\n");
            tickets.append("Pet: ").append(adoption.getPet().toString()).append("\n");
            tickets.append("Adopter: ").append(adoption.getAdopter().toString()).append("\n");
            tickets.append("Employee: ").append(adoption.getEmployee().toString()).append("\n");
            tickets.append("------------------------------\n");
            JOptionPane.showMessageDialog(null, tickets.toString(), "Adoption Tickets", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}