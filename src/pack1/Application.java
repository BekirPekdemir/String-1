package pack1;

public class Application {

	public static void main(String[] args) {

		Human person1 = new Human();
		
		person1.print();
		
		person1.eyeColor="Brown";
		
		person1.print();
		

		System.out.println(person1.eyeColor);
		System.out.println(person1.height);
		System.out.println(person1.weight);
		System.out.println(person1.gender);

		System.out.println("----------------------");
		
		Human person2 = new Human();
		
		person2.print();
		
		person2.eyeColor="Blue";
		
		person2.print();

		System.out.println(person2.eyeColor);
		System.out.println(person2.height);
		System.out.println(person2.weight);
		System.out.println(person2.gender);
	}

}
