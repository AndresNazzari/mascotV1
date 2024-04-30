package veterinary.adoption;

import veterinary.pet.Pet;
import veterinary.person.Adopter;
import veterinary.person.Employee;

import javax.swing.*;

public class Adoption {
    private Employee employee;
    private Adopter adopter;
    private Pet pet;

    public Adoption(Pet pet, Adopter adopter, Employee employee) {
        this.setEmployee(employee);
        this.setAdopter(adopter);
        this.setPet(pet);
    }

    @Override
    public String toString() {
        return "----- Adoption Ticket -----\n" +
                "Employee: " + employee.toString() + "\n" +
                "Adopter: " + adopter.toString() + "\n" +
                "Pet: " + pet.toString() + "\n" +
                pet.getRecommendations() + "\n" +
                "---------------------------";
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
