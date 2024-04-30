package veterinary.pet;

import veterinary.pet.interfaces.IDog;

import java.util.Date;

public class Dog extends Pet implements IDog {
    private int walksPerDay;
    private int mealsPerDay;

    public Dog(String name, Date birthDate, double weight, int vetVisits, String species, String breed, int walksPerDay, int mealsPerDay) {
        super(name, birthDate, weight, vetVisits, species, breed);
        this.setMealsPerDay(mealsPerDay);
        this.setWalksPerDay(walksPerDay);
    }
    public int getWalksPerDay() {
        return walksPerDay;
    }
    public void setWalksPerDay(int walksPerDay) {
        this.walksPerDay = walksPerDay;
    }
    public int getMealsPerDay() {
        return mealsPerDay;
    }
    public void setMealsPerDay(int mealsPerDay) {
        this.mealsPerDay = mealsPerDay;
    }

    @Override
    public String getRecommendations() {
        return "Recommendations for caring for a " + this.getSpecies()+"\n" +
                "- Daily walks: " + this.getWalksPerDay() + ".\n" +
                "- Meals per day: " + this.getMealsPerDay()  +".\n" +
                "- Vet visits every " + this.getVetVisits()  + " months.\n";
    }
}
