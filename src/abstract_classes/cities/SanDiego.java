package abstract_classes.cities;

public  class SanDiego extends City {

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
	double tax = population * growthRate + (1000  * 1000);	
		// TODO Auto-generated method stub
		return tax;
	}

}
