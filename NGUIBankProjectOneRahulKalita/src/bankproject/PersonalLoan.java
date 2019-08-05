package bankproject;

public class PersonalLoan implements LoanRequirements{

	@Override
	public boolean maxTimeLimit(int time) {
		// TODO Auto-generated method stub
		if(time>1 || time <0)
			return false;
		return true;
	}

	@Override
	public boolean minBalance(float amount) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public float rates() {
		// TODO Auto-generated method stub
		return 5.0f;
	}

	@Override
	public float totalInterest(float principle, int time) {
		// TODO Auto-generated method stub
		float total = principle * (float)(Math.pow(1 + this.rates()/100, time)); 
		return total;
	}

	
}
