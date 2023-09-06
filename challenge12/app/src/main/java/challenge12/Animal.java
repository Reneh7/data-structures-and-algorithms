package challenge12;

public class Animal<T> {
    T name;
    T species;

    public Animal(T name, T species) {
        this.name = name;
        this.species = species;
    }

    public T getName() {
        return name;
    }

    public T getSpecies() {
        return species;
    }

}
