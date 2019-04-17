package pack2;

import com.class9.Minimum;

import pack2.Animals;

public class Application {
	
	public static void main(String[] args) {

		Animals obj1 = new Animals();
		
		System.out.println("The animal ob1");
		
		System.out.println(obj1.breed);
		System.out.println(obj1.weight);
		System.out.println(obj1.age);
		System.out.println(obj1.name);
		
		System.out.println(obj1.canBark());
		System.out.println(obj1.isWild());
		
		obj1.name="Joe";
		obj1.age=4;
		System.out.println(obj1.age);

		Animals obj2 = new Animals();
		
		System.out.println("-------------------");
		
		obj2.name="Basikara";
		
		System.out.println("The animal ob2");
		
		System.out.println(obj2.breed);
		System.out.println(obj2.weight);
		System.out.println(obj2.age);
		System.out.println(obj2.name);
		
		System.out.println(obj2.canBark());
		System.out.println(obj2.isWild());
		
		obj2.age=10;
		obj2.name="Laz Ziya";
		System.out.println(obj2.name);
		
	
		
	System.out.println("----------------------------");
	
    int my_array[] = { -1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
    System.out.println("Printing the minimum value");
    
    System.out.println(Minimum.minOfValues(my_array));
    System.out.println(Minimum.maxOfValues(array));

    Minimum min = new Minimum();
    min.print();


		
	}
	
	
		
		
	}

