package JavaPackage;

public class Inheritance9 extends Inheritance8 {

	public void roar() {

		System.out.println("Lion is roaring");

	}

	public static void main(String[] args) {

		Inheritance9 i9 = new Inheritance9();

		i9.eat();
		i9.run();
		i9.roar();

	}

}
