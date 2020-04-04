package JavaInheritanceConcept;

public class MutilevelInheritance_ChildClass extends SingleInheritance_ChildClass {

	public static void main(String[] args) {
		
		// Its nothing but accesing properties of a child class which is connected with parent class
		//In multileve inheritance the 1st level prent class should only have one child class but here we are having two childs just
		//igonre that.
		
		MutilevelInheritance_ChildClass obj=new MutilevelInheritance_ChildClass();
		
		obj.sound();

	}

}
