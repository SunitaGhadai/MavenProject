package Java_Package;

public class OverrideClass {

	public static void main(String[] args) {
	// object for Animal class created as my Animaal
    Animal myAnimal = new Animal();
    myAnimal.sound();
    //Even though the Dog class inherits from Animal, it has its own version of the sound method which is called overriding
    Dog myDog = new Dog();
    myDog.sound();
	}
}
//creation of Animal class
class Animal
{
	public void sound()
	{
		System.out.println("Animal makes sound");
	}
}
//Dog class is the subclass of Animal class
class Dog extends Animal
{
	public void sound()
	{
		System.out.println("Dog barks");
	}

}

