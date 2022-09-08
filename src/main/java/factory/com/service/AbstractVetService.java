package factory.com.service;

import java.time.LocalDate;

import factory.com.model.Animal;
import factory.com.model.exotic.Exotic;
import factory.com.model.exotic.ExoticTreatment;

public abstract class AbstractVetService <T extends Animal> {
	
	public abstract void giveInitialTreatment(T animal);
	
	public void giveExoticTreatment (T animal) {
		
		if(animal instanceof Exotic) {
			this.giveExoticTreatment((Exotic) animal);
		}
	}

	private void giveExoticTreatment(Exotic animal) {
		
		animal.setExoticTreatment(new ExoticTreatment("Cuarentena", 
				LocalDate.now(), 
				LocalDate.now().plusWeeks(1)));
	}
	
}
