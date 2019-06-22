
public class Removals {
	public String remove(String str) {
		String s="",prefix=str.substring(0, 2);
		char first=str.charAt(0),second=str.charAt(1);
		int length=str.length();
		if(length==1) {
			if(first=='A')
				s="";
			else
				s+=str;
		}
		else if(length==2) {
			if(prefix.equals("AA"))
				s="";
			if(first=='A')
				s+=second;
			else
				s+=first;
		}
		else {
			if(prefix.equals("AA"))
				s+=str.substring(2);
			else if(first=='A')
				s+=str.substring(1);
			else if(second=='A')
				s=s+first+str.substring(2);
			else
				s+=str;
		}
		return s;
	}

}
