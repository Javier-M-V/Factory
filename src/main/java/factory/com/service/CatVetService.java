package factory.com.service;

import java.time.LocalDate;

import factory.com.model.Cat;
import factory.com.model.Treatment;

public class CatVetService extends AbstractVetService<Cat> {

	@Override
	public void giveInitialTreatment(Cat animal) {
		
		Treatment initialTreatment = new Treatment("Desparasitar", 
				LocalDate.now(), 
				LocalDate.now().plusDays(7));
		
		animal.setTreatment(initialTreatment);
	}
}
