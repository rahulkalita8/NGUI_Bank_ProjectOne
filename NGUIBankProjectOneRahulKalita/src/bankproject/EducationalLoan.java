/**
 * 
 */
package bankproject;

import bankproject.LoanRequirements;

/**
 * @author rkalita
 *
 */
public class EducationalLoan implements LoanRequirements{

	@Override
	public boolean maxTimeLimit(int time) {
		if(time>6 || time<1)
			return false;
		else
			return true;
	}

	@Override
	public boolean minBalance(float amount) {
		// TODO Auto-generated method stub
		if(amount > 500000 )
			return true;
		return false;
	}

	@Override
	public float rates() {
		// TODO Auto-generated method stub
		return 6.0f;
	}

	@Override
	public float totalInterest(float principle, int time) {
		// TODO Auto-generated method stub
		float total = principle * (float)(Math.pow(1 + rates()/100, time)); 
		return total;
	}

	public boolean parentHasAccount(long accountNum){
		if(accountNum>0)
			return true;
		else
			return false;
	}
	
	
	
}
