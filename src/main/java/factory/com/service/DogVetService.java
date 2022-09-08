package factory.com.service;

import java.time.LocalDate;

import factory.com.model.Dog;
import factory.com.model.Treatment;

public class DogVetService extends AbstractVetService<Dog> {

	@Override
	public void giveInitialTreatment(Dog animal) {
		
		
		Treatment initialTreatment = new Treatment("Revisión de dientes", 
				LocalDate.now(), 
				LocalDate.now());
		
		animal.setTreatment(initialTreatment);
		
	}
}
