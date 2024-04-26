package veterinary.pet;

import veterinary.pet.interfaces.IPet;

import java.util.Date;

public abstract class Pet implements IPet {
    private String name;
    private Date birthDate;
    private double weight;

    public Pet(String name, Date birthDate, double weight) {
        this.setName(name);
        this.setBirthDate(birthDate);
        this.setWeight(weight);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
