package week3HomeAssignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String test ="Sareetha";
		char[] ch = test.toCharArray();
		
	for(int i=0;i<ch.length;i++)
	{
		if(i%2==0)
		{
			String s= ""+ch[i];
			System.out.println(s.toLowerCase());
				
		}
		else
		{
			String d= ""+ch[i];
			System.out.println(d.toUpperCase());
			//ch[i]=Character.toLowerCase(ch[i]);
		}
		
	
		
	}


	}

}
