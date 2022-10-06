
public class Dog implements Animal {

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("BOWW , BOWW");

	}
	
	public static void main(String[] args) {
		Animal a = new Dog();
		a.makeSound();
	}

}
