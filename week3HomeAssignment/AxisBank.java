package week3HomeAssignment;

public class AxisBank extends BankInfo{
	
	public void deposit()
	{
		System.out.println("This is Child class deposit ");
	}

	public static void main(String[] args) {
		
		AxisBank Ab= new AxisBank();
		Ab.deposit();
		Ab.fixed();
		Ab.saving();

	}

}
