package week3HomeAssignment;

public class Automation  extends MultipleLangauge   implements Language,TestTool   {



	public void Selenium() {
		System.out.println("Selenium from TestTool Interface");
		
	}

	public void Java() {
	
		System.out.println("Java from language Interface");
	}

	@Override
	public void ruby() {
		 System.out.println("Ruby from MultipleLanguage Abstract class");
		 	
	}
	
	public static void main(String[] args)
	{
		Automation auto = new Automation();
		auto.Selenium();
		auto.Java();
		auto.ruby();
		auto.python(); // this is Abstract class implemented method
	}
}