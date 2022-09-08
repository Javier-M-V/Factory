package factory.com.model;


public class Dog extends Animal {

	@Override
	public void sound() {
		
		System.out.println("GUAU");
	}

	@Override
	public AnimalEnum getType() {
	
		return AnimalEnum.DOG;
	}
}
