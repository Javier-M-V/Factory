package factory.com.service;

import java.time.LocalDate;

import factory.com.model.Iguana;
import factory.com.model.Treatment;

public class IguanaVetService extends AbstractVetService<Iguana>{

	@Override
	public void giveInitialTreatment(Iguana animal) {
		
		animal.setTreatment(new Treatment("Sexar", LocalDate.now(), LocalDate.now()));
	}

}
