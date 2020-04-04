package JAVA_Loops_Arrays_Exceptions;

public class MethodConcept {

	public static void main(String[] args) {
		
		
		MethodConcept obj=new MethodConcept();
		
		int i= obj.add(10, 10);
		System.out.println("sum:"+i);
		int j =obj.sub(15, 15);
		System.out.println("Sub:"+j);
		int k =obj.mul(10,5);
		System.out.println("mul:"+k);
		int l= obj.div(10, 5);
		System.out.println("div:"+l);
		
	}
		
	int add(int a, int b) {
		
		int result;
		
		result=a+b;
		
		return result;
		
	}
	
int sub(int a, int b) {
		
		int result;
		
		result=a-b;
		
		return result;
		
	}
int mul(int a, int b) {
	
	int result;
	
	result=a*b;
	
	return result;
	
}
int div(int a, int b) {
	
	int result;
	
	result=a/b;
	
	return result;
	
}


		
}
