package veterinary.pet.interfaces;

import java.util.Date;

public interface IPet {
    String getName();

    void setName(String name);

    Date getBirthDate();

    void setBirthDate(Date birthDate);

    double getWeight();

    void setWeight(double weight);

    int getVetVisits();

    void setVetVisits(int vetVisits);

    String getSpecies();

    void setSpecies(String species);

    String getBreed();

    void setBreed(String breed);

    String getRecommendations();
}
