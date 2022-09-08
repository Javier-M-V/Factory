package factory.com.model;

import factory.com.model.exotic.Exotic;
import factory.com.model.exotic.ExoticTreatment;

public class Tortoise extends Animal implements Exotic {

	private ExoticTreatment exoticTreatment;
	
	public void setExoticTreatment(ExoticTreatment treat) {
		
		this.exoticTreatment = treat;
	}

	public ExoticTreatment getExoticTreatmen() {
		
		return exoticTreatment;
	}

	@Override
	public void sound() {

	}

	@Override
	public AnimalEnum getType() {
		
		return AnimalEnum.TORTOISE;
	}

	@Override
	public String toString() {
		return "Tortoise"+super.toString() +" [exoticTreatment=" + exoticTreatment + "]";
	}
	

}
