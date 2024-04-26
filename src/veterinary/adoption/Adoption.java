package veterinary.adoption;

import veterinary.pet.Pet;
import veterinary.person.Adopter;
import veterinary.person.Employee;

public class Adoption {
    private Employee employee;
    private Adopter adopter;
    private Pet pet;

    public Adoption(Employee employee, Adopter adopter, Pet pet) {
        this.setEmployee(employee);
        this.setAdopter(adopter);
        this.setPet(pet);
    }

    public void printTicket() {
        /*
        System.out.println("----- Adoption Ticket -----");

        System.out.println("------------------------------");
        */
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
