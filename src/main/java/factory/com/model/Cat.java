package factory.com.model;


public class Cat extends Animal {

	@Override
	public void sound() {
		System.out.println("MAHOU");
	}

	@Override
	public AnimalEnum getType() {
		
		return AnimalEnum.CAT;
	}

}
