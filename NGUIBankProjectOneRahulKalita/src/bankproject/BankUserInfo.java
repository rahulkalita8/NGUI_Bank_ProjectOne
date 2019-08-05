package bankproject;

import java.util.HashMap;

public interface BankUserInfo {
	
	void setUsername(String username);
	void phoneNumber(long phoneNum);
	void setEmpID(int ID);
	void setAddress(HashMap<String, String> hashMap);
	
}
