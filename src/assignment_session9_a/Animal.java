package assignment_session9_a;

class Animal {
	// Data fields, constructors, and methods omitted here
}

class Chicken extends Animal implements Edible {
	public String howToEat() {
		return "Chicken: Fry it";
	}
}

class Tiger extends Animal {
}

abstract class Fruit implements Edible {
	// Data fields, constructors, and methods omitted here
}

class Apple extends Fruit {
	public String howToEat() {
		return "Apple: Make apple cider";
	}	
}

class Orange extends Fruit {
	public String howToEat() {
		return "Orange: Make orange juice";
	}
}
