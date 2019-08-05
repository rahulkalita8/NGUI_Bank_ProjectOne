package bankproject;

public interface LoanRequirements {
	
	boolean maxTimeLimit(int time);
	boolean minBalance(float amount);
	float rates();
	float totalInterest(float principle, int time);
}
