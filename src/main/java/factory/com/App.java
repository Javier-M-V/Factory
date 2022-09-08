package factory.com;

import factory.com.factories.AnimalFactory;
import factory.com.factories.VetFactory;
import factory.com.model.Animal;
import factory.com.model.Animal.AnimalEnum;
import factory.com.service.AbstractVetService;

public class App {
	
	//https://www.youtube.com/watch?v=8bZh5LMaSmE
	
	//Una protectora debe acoger animales, ficharlos y darles una atención veterinaria inicial personalizada

	public static void main(String[] args) {

		Animal animal =  AnimalFactory.getAnimal(AnimalEnum.valueOf(args[0]));
		
		animal.sound();
		
		AbstractVetService<Animal> vetService = VetFactory.getVetService(animal);
		
		vetService.giveInitialTreatment(animal);
		vetService.giveExoticTreatment(animal);//En el caso de un Animal que no implemente Exotic no hará nada
		
		System.out.println(animal.toString());
	
	}
}
