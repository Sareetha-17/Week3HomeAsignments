package week3HomeAssignment;

public class Palindrome {

	public static void main(String[] args) {
		 String str = new String("madam");
		 String rev ="";
		 
		 for(int i=str.length()-1; i>=0;i--)

		 {
			 char[] ch =str.toCharArray();
			 rev=rev+ch[i];
			 System.out.println("The reversed string is    "+ rev);
			
		 }
		 if (str.equals(rev))
		 {
			 System.out.println("It is Palindrome");
		 }
		 else
		 {
			 System.out.println("Not Palindrome");
		 }
		
	}

}
