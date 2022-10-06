package com.valtech.training.corejava.day5;

public class PasswordStrength {
	int upper=0;
	int lower=0;
	int dig=0;
	int SpecialChars=0;
	int occuranceNumCount=0;
	int occuranceSplCount=0;
	int total=0;
	
	int count = 0;


public boolean checkSmaller(String str) {
	 int flag = 0;
	 if (str.length() < 8)
	 return false;
	 for (char ch=0;ch<str.length();ch++)
	 {
		 if (Character.isLowerCase(ch))
		 {
			 if (flag == 0) 
			 {
				 count += 5;
				 flag = 1;
				 return true;
				 } 
			 else 
			 {
				 break;
				 }
			 }
		 }
	 return true;
}


public boolean checkCapital(String str) {
	 int flag = 0;
	 if (str.length() < 8)
		 return false;
	 for (char ch=0; ch<str.length();ch++) {
		 if (!Character.isLowerCase(ch)) {
		 if (flag == 0) {
			 count += 5;
		     flag = 1;
		     return true;
		 } 
		 else {
			 break;
			 }
		 }
    }
	 return true;
}


public boolean checkNum(String str) {
	int flag = 0;
	for (char ch = 0; ch < str.length(); ch++) {
		if (Character.isDigit(ch)) {
			if (flag == 0) {
				count += 5;
				flag = 1;
				return true;
            }
			else {
           	 count += 1;            	 
           	 }
			} 
		else {
			return true;               
			}
		}
	return false;
}


public int checkSpecialChars(String str) {
	int flag = 0;
	String specialChars = "!@#$%^&*";
	for (int i = 0; i < str.length(); i++) {
		String strChar = Character.toString(str.charAt(i));
		if(specialChars.contains(strChar)) {
			if(flag == 0) {
				count += 5;
				flag = 1;
			}
			else {
				count += 2;
			}
		}
	}
	return count;
	}


	static String a="Va$125aa";
	public long checkPassWord(String a) {
		char[]p=a.toCharArray();
		System.out.println(p.length);
		if(p.length<8) {
			total=p.length;
		}
		else {
		for(int i=0;i<=p.length-1;i++) {
			if(Character.isLowerCase(p[i])) {
				lower=5;
			}
			System.out.println("a"+lower);
			if(Character.isUpperCase(p[i])) {
				upper=5;
			}
			
			if(p[i]>='0' && p[i]<='9') {
				occuranceNumCount++;
				if(occuranceNumCount>1) {
					dig+=1;
				}
				else {
					dig=5;
				}
				
			}
			if(p[i]=='#'||p[i]=='$'|| p[i]=='@'||p[i]=='%'||p[i]=='!'||p[i]=='%'||p[i]=='&'||p[i]=='^'||p[i]=='*'||p[i]=='('||p[i]==')'||p[i]=='['||p[i]==']') {
				
				occuranceSplCount++;
				if(occuranceSplCount>1) {
					SpecialChars+=2;
				}
				else {
					SpecialChars=5;
				}
			
			}
		}
		
		total=lower+dig+SpecialChars+upper;
		
		return total;
	}
		return 0;
	}
	public String checkPasswordStrength(String a) {
		checkPassWord(a);
		if(total>25) {
			return("Strong");
		}
		if(total<=25 && total>20) {
			return ("Moderate");
		}
		if(total<=20 && total>=8) {
			return ("Weak");
		}
		return "Weak Password";
	}

}