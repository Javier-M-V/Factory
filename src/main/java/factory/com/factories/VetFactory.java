package factory.com.factories;

import java.util.HashMap;

import factory.com.model.Animal;
import factory.com.model.Animal.AnimalEnum;
import factory.com.service.CatVetService;
import factory.com.service.DogVetService;
import factory.com.service.IguanaVetService;
import factory.com.service.TortoiseVetService;
import factory.com.service.AbstractVetService;

public class VetFactory <T extends Animal>{

	private VetFactory(){}
	
	private final static HashMap<AnimalEnum, AbstractVetService<?>> ANIMAL_VET_SET = new HashMap<AnimalEnum, AbstractVetService<?>>();
	
	static {
	
		ANIMAL_VET_SET.put(AnimalEnum.CAT, new CatVetService());
		ANIMAL_VET_SET.put(AnimalEnum.DOG, new DogVetService());
		ANIMAL_VET_SET.put(AnimalEnum.IGUANA, new IguanaVetService());//este estilo de map se puede evitar en Spring
		ANIMAL_VET_SET.put(AnimalEnum.TORTOISE, new TortoiseVetService());
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Animal> AbstractVetService<T> getVetService(T animal){
		
		return (AbstractVetService<T>) ANIMAL_VET_SET.get(animal.getType());
	}
}
