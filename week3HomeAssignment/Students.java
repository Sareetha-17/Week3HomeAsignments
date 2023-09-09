package week3HomeAssignment;

public class Students {
	
	public void getStudentInfo()
	{
		System.out.println("This is normal Method w/o any Arguments");
	}
	public void getStudentInfo(int id)
	{
		System.out.println("Id is "+id);
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Id is "+id +" Name is "+name);
	}
	public void getStudentInfo(String email,long Phonenum)
	{
		System.out.println("Email is "+email);
		System.out.println("Phone Number is "+ Phonenum);
	}

	public static void main(String[] args) {
		
		Students stud = new Students();
		stud.getStudentInfo(1);
		stud.getStudentInfo();
		stud.getStudentInfo(1,"Sareetha");
		stud.getStudentInfo("saree.gmail.com", 9894567823l);
	}

}
