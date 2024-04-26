package veterinary.pet;

import veterinary.pet.interfaces.ICat;

import java.util.Date;

public class Cat extends Pet implements ICat {
    public Cat(String name, Date birthDate, double weight) {
        super(name, birthDate, weight);
    }

    @Override
    public void getRecommendations() {
        System.out.println("Recomendaciones para cuidar a un gato:");
        System.out.println("- Proporcionar un espacio para rascar.");
        System.out.println("- Proporcionar una caja de arena limpia.");
        System.out.println("- Visita al veterinario regularmente.");
    }
}
