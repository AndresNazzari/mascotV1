package veterinary.pet;

import veterinary.pet.interfaces.ICat;

import java.util.Date;

public class Cat extends Pet implements ICat {
    private int litterBoxes;
    private int scratchers;

    public Cat(String name, Date birthDate, double weight, int vetVisits, String species, String breed, int litterBoxes, int scratchers) {
        super(name, birthDate, weight, vetVisits, species, breed);
        this.setLitterBoxes(litterBoxes);
        this.setScratchers(scratchers);
    }

    public int getLitterBoxes() {
        return litterBoxes;
    }
    public void setLitterBoxes(int litterBoxes) {
        this.litterBoxes = litterBoxes;
    }
    public int getScratchers() {
        return scratchers;
    }
    public void setScratchers(int scratchers) {
        this.scratchers = scratchers;
    }

    @Override
    public String getRecommendations() {
        return "Recommendations for caring for a " + this.getSpecies()+": \n" +
                "- Provide " + this.getScratchers()  + " scratching post(s).\n" +
                "- Provide " + this.getLitterBoxes()  + " clean litter box(es).\n" +
                "- Vet visits every " + this.getVetVisits()  + " months.\n";
    }
}
