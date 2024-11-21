package gestionAnimal;

public interface Omnivore<T> extends Carnivore,Herbivore {
    void eatPlantAndMeet(T food);
}
