package factory.com.service;

import java.time.LocalDate;

import factory.com.model.Tortoise;
import factory.com.model.Treatment;

public class TortoiseVetService extends AbstractVetService<Tortoise> {

	@Override
	public void giveInitialTreatment(Tortoise animal) {
		animal.setTreatment(new Treatment("Rayos", LocalDate.now(), LocalDate.now()));
		
	}

}
