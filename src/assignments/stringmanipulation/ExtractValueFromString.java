package assignments.stringmanipulation;

public class ExtractValueFromString {
	public static String result="";

	public static void main(String[] args) {
		String str="abcXYZ123@#&Kol";
		String res=extractNumber(str);
		System.out.println("Results: "+res);

	}
	public static String  extractNumber(String str)
	{
		str=str.replaceAll("[^\\d]", "").trim();	
		return str;
	}
	
	public static String  extractChar(String str)
	{
		str=str.replaceAll("[^a-z |A-Z]", "").trim();	
		return str;
	}
	public static String  removeSpecialChar(String str)
	{
		str=str.replaceAll("[^a-z |A-Z |0-9]", "").trim();	
		return str;
	}


}
