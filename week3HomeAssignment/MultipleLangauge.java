package week3HomeAssignment;

public abstract class MultipleLangauge implements TestTool {
	
	public void python() 
	{
		System.out.println("This is Abstract class");
	}
	
	public abstract void ruby();
	
	// this is from Testtool interface method
	public void Selenium()
	{
		System.out.println("This is TestTool Interface's method");
	}
	

}
