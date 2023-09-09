package week3HomeAssignment;

public class RemoveDuplicates {

	public static void main(String[] args) {
	
		String text ="We learn java basics as part of java sessions in java week1";
		String rev = "";
		
		//int count=0;
		
		for(int i=0;i<text.length();i++)
		{
			char rev1= text.charAt(i);
			
			if(text.indexOf(rev1)<0)
			{
				text=text+rev1;
			}
			
		}
		System.out.println(text);
	

	}

}
