package bankproject;

public class TravelLoan implements LoanRequirements{

	@Override
	public boolean maxTimeLimit(int time) {
		// TODO Auto-generated method stub
		if(time>1 || time<0) 
		return false;
		else return true;
	}

	@Override
	public boolean minBalance(float amount) {
		// TODO Auto-generated method stub
		if(amount <5000000)
		return false;
		else return true;
	}

	@Override
	public float rates() {
		// TODO Auto-generated method stub
		return 1.0f;
	}

	@Override
	public float totalInterest(float principle,int time) {
		// TODO Auto-generated method stub
		
		float total=(float)(principle*this.rates()*time)/100;
		return total+principle;
	}

	
}