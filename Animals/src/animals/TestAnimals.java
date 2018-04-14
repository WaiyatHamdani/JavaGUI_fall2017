/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author 00220682
 */
public class TestAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Lion();
        animals[3] = new Alligator();
        for(Animal currentAnimal:animals){
            System.out.println(currentAnimal.getName());
            System.out.println(currentAnimal.talk());
            if(currentAnimal instanceof Predator){
                Predator predator = (Predator)currentAnimal;
                System.out.println(predator.hunt());
            }
        }
        Predator[] predators = {new Lion(), new Alligator()};
        for(Predator currentPredator:predators){
            System.out.println(currentPredator.hunt());
            Animal animal = (Animal)currentPredator;
            System.out.println(animal.getName());
            System.out.println(animal.talk());
        }
    }
    
}
