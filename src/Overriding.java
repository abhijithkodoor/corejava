class Animal{
	public void speak() {
		System.out.println("No specific sound");
	}
}
class Cat extends Animal{
	public void speak() {
		System.out.println("Meow");
	}
}
class Dog extends Animal{
	public void speak() {
		System.out.println("Bark");
	}
}
class Horse extends Animal{
	public void speak() {
		System.out.println("Neigh");
	}
}
public class Overriding {

	public static void main(String[] args) {
		
		String animalName="Horse";
		invokeAnimalSound(animalName);
	}

	public static void invokeAnimalSound(String animalName) {
		Animal a=null;
		if(animalName.equals("Cat"));
			a=new Cat();
		if(animalName.equals("Dog"));
			a=new Dog();
		
			if(animalName.equals("Horse"));
			a=new Horse();
		callSound(a);
	}

	public static void callSound(Animal a) {
		
		a.speak();
	}

}
