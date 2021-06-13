package _07_abstract_interface.thuc_hanh.Animal_Edible;

public class Chicken extends Animal implements Edible{

    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
