package factory.com.factories;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.ObjectUtils;

import factory.com.model.Animal;
import factory.com.model.Cat;
import factory.com.model.Dog;
import factory.com.model.Iguana;
import factory.com.model.Tortoise;
import factory.com.model.Animal.AnimalEnum;

public class AnimalFactory {
	
	private AnimalFactory() {}
	
	static final Map <AnimalEnum, Animal> ANIMALSET = new HashMap<AnimalEnum,Animal>();
	
	static {
	
		ANIMALSET.put(AnimalEnum.DOG, new Dog());
		ANIMALSET.put(AnimalEnum.CAT, new Cat());
		ANIMALSET.put(AnimalEnum.IGUANA, new Iguana());
		ANIMALSET.put(AnimalEnum.TORTOISE, new Tortoise()); //este estilo de poblar map se puede evitar en Spring
	}
	
	public static Animal getAnimal (AnimalEnum animal) {
		
		return ObjectUtils.clone(ANIMALSET.get(animal));
	}
	
//	public static Animal getAnimalOldWay (AnimalEnum animal) throws Exception {
//		
//		switch (animal) {
//		case DOG:
//			return new Dog();
//			
//		case CAT:
//			return new Cat();
//
//		default:
//			throw new Exception("WTH!");
//		}	
//	}
}
