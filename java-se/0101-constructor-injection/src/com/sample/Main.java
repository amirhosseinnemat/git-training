package com.sample;

public class Main {

    public static void main(String[] args) {
	var animal1 = new Dog();
	var animal2 = new Cat();
	var animalSound1 = new AnimalSound(animal1);
	var animalSound2 = new AnimalSound(animal2);
	animal1.makeSound();
	animal2.makeSound();
    } // end of main method
} // end of class
