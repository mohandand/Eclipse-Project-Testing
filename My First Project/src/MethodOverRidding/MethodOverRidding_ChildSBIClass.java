package MethodOverRidding;

public class MethodOverRidding_ChildSBIClass extends MethodOverRidding_ParentRBIClass {

	public static void main(String[] args) {
		
		MethodOverRidding_ChildSBIClass obj = new MethodOverRidding_ChildSBIClass();
		
		System.out.println(obj.getHomeLoanROI());
	}

	//overridding parent class method by using same signature and by changing implementation.
	public double getHomeLoanROI()
	
	{
		return 10.5;
	}
}
