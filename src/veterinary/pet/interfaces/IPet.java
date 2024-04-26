package veterinary.pet.interfaces;

import java.util.Date;

public interface IPet {
    void getRecommendations();

    String getName();

    void setName(String name);

    Date getBirthDate();

    void setBirthDate(Date birthDate);

    double getWeight();

    void setWeight(double weight);
}
