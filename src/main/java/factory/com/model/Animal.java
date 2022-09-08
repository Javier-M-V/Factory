package factory.com.model;

public abstract class Animal implements Cloneable {
	
	public enum AnimalEnum {
		DOG,
		CAT,
		IGUANA,
		TORTOISE
	}
	
	private String name;
	
	private Treatment treatment;
	
	public abstract void sound();
	
	public abstract AnimalEnum getType();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Treatment getTreatment() {
		return treatment;
	}

	public void setTreatment(Treatment treatment) {
		this.treatment = treatment;
	}
	
	@Override
	public Animal clone() throws CloneNotSupportedException {
		
		return (Animal) super.clone();
	}

	@Override
	public String toString() {
		return "[name=" + name + ", treatment=" + treatment + "]";
	}
	
}
