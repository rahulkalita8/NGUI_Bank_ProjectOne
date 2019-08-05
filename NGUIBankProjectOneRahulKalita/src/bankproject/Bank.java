package bankproject;

import java.util.HashMap;
import java.util.Scanner;

public class Bank implements BankUserInfo{

	String username;
	long phoneNum;
	int empID;
	float balance;
	HashMap<String, String> address; 
	
	public Bank(String username, long phoneNum, int empID, HashMap<String, String> address) {
		super();
		this.username = username;
		this.phoneNum = phoneNum;
		this.empID = empID;
		this.address = address;
	}

	public Bank() {
	}

	@Override
	public void setUsername(String username) {
		// TODO Auto-generated method stub
		this.username = username;
		
	}

	@Override
	public void phoneNumber(long phoneNum) {
		// TODO Auto-generated method stub
		this.phoneNum = phoneNum;
	}

	@Override
	public void setEmpID(int ID) {
		// TODO Auto-generated method stub
		this.empID = ID;
	}

	@Override
	public void setAddress(HashMap<String, String> hashMap) {
		// TODO Auto-generated method stub
		this.address = hashMap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Bank obj = new Bank();
		System.out.println("Enter user name: ");
		obj.setUsername(scan.nextLine());
		System.out.println("Enter phone Number: ");
		obj.phoneNumber(scan.nextLong());
		scan.nextLine();
		System.out.println("Enter your balance amount: ");
		obj.balance = scan.nextFloat();
		scan.nextLine();
		HashMap<String,String> addr=new HashMap<String,String>();
        System.out.println("Enter address:");
        System.out.println("House no: ");
        addr.put("houseno", scan.nextLine());
        System.out.println("Area: ");
        addr.put("area", scan.nextLine());
        System.out.println("City: ");
        addr.put("city", scan.nextLine());
        System.out.println("State: ");
        addr.put("state", scan.nextLine());
        System.out.println("Pin Code: ");
        addr.put("pin", scan.nextLine());
        
        System.out.println(addr);
		
		System.out.println("What loan do you want: \n"
				+ "1. Housing Loan\n"
				+ "2. Educational Loan\n"
				+ "3. Personal Loan\n"
				+ "4. Travel Loan");
		int choice = scan.nextInt();
	
		System.out.println("How much amount do you want: ");
		float amount = scan.nextFloat();
		System.out.println("For how many years: ");
		int time = scan.nextInt();
		switch (choice) {
		case 1: HousingLoan hLoan = new HousingLoan();
				if(hLoan.maxTimeLimit(time) && hLoan.minBalance(obj.balance))
					System.out.println("Total payable amount: " + hLoan.totalInterest(amount, time));
				else
					System.out.println("Invalid amount or time");
				break;
		case 2: EducationalLoan eLoan=new EducationalLoan();
				System.out.println("Enter Parent account no:");
				long accno=scan.nextLong();
				if(eLoan.maxTimeLimit(time)&& eLoan.minBalance(obj.balance))
					System.out.println("Total interest= " + eLoan.totalInterest(amount, time));
				else
					System.out.println("Invalid time/amount");
				break;
				
		case 3: PersonalLoan pLoan = new PersonalLoan();
				if(pLoan.maxTimeLimit(time) && pLoan.minBalance(amount))
					System.out.println("Total payable amount: " + pLoan.totalInterest(amount, time));
				else
					System.out.println("Invalid amount or time");
				break;
				
		case 4: TravelLoan tLoan=new TravelLoan();
        		if(tLoan.maxTimeLimit(time)&& tLoan.minBalance(obj.balance))	
        			System.out.println("Total interest= " + tLoan.totalInterest(amount, time));
        		else
        			System.out.println("Invalid time/amount");
        		break;
				
		default:
			break;
		}
		scan.close();
	}
	
	

}
