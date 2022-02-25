package entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenditures;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override 
	public Double tax() {
		
		double totalTax;
		if (getAnnualIncome() < 20000) {
			
			totalTax = getAnnualIncome() * 0.15 - (healthExpenditures/2);
		}
		else {
			totalTax = getAnnualIncome() * 0.25 - (healthExpenditures/2);
		}
		return totalTax;
	}
}
