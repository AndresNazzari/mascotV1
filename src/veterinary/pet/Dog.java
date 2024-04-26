package veterinary.pet;

import java.util.Date;
import veterinary.pet.interfaces.IDog;


public class Dog extends Pet implements IDog {
    public Dog(String name, Date birthDate, double weight) {
        super(name, birthDate, weight);
    }
    @Override
    public void getRecommendations() {
        System.out.println("Recomendaciones para cuidar a un perro:");
        System.out.println("- Paseos diarios.");
        System.out.println("- Alimentación balanceada.");
        System.out.println("- Visita al veterinario regularmente.");
    }
}
