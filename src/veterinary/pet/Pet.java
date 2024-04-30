package veterinary.pet;

import veterinary.pet.interfaces.IPet;

import java.util.Date;

public abstract class Pet implements IPet {
    private String name;
    private Date birthDate;
    private double weight;
    private String species;
    private String breed;
    private int vetVisits;

    public Pet(String name, Date birthDate, double weight, int vetVisits, String species, String breed) {
        this.setName(name);
        this.setBirthDate(birthDate);
        this.setWeight(weight);
        this.setVetVisits(vetVisits);
        this.setSpecies(species);
        this.setBreed(breed);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public  int getVetVisits() {
        return vetVisits;
    }
    public void setVetVisits(int vetVisits) {
        this.vetVisits = vetVisits;
    }
    public String getSpecies() {return species;}
    public void setSpecies(String species) {this.species = species;}
    public String getBreed() {return breed;}
    public void setBreed(String breed) {this.breed = breed;}

    public String toString() {
        return this.getSpecies() + ", " + getBreed() + ":\n" +
                "- Name: " + this.getName() + ".\n" +
                "- Birthdate: " + this.getBirthDate()  +".\n" +
                "- Weight: " + this.getWeight()  + " months.\n";
    }
}
