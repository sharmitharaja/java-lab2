package animall;
//super class animal
class Animal{
	//method to be overridden 
	public void MakeSound() {
		System.out.println("The Animal Make A Sound");
	}
}
//subclass dog
class Dog extends Animal{
	//override
	public void MakeSound() {
		System.out.println("The Dog bark");
	}
}
//subclass cat
class Cat extends Animal{
	public void MakeSound() {
		System.out.println("The Cat meows");
	}
}
//main class to test the program

public class Animal_Test {

	public static void main(String[] args) {
		//creating objects of each class
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		System.out.println("Animal Sound");
		//displaying sound
		animal.MakeSound();
		System.out.println("Dog Sound");
		dog.MakeSound();
		System.out.println("Cat Sound");
		cat.MakeSound();

	}

}
