package _07_abstract_interface.thuc_hanh.Animal_Edible;

import _07_abstract_interface.thuc_hanh.Animal_Edible.Animal;
import _07_abstract_interface.thuc_hanh.Animal_Edible.Chicken;
import _07_abstract_interface.thuc_hanh.Animal_Edible.Tiger;
import _07_abstract_interface.thuc_hanh.Animal_Edible.Edible;
import _07_abstract_interface.thuc_hanh.Animal_Edible.Fruit;
import _07_abstract_interface.thuc_hanh.Animal_Edible.Apple;
import _07_abstract_interface.thuc_hanh.Animal_Edible.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edible = (Edible) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
