package Method_OverLoding;

public class Method_OverLoading_Concept {

	public static void main(String[] args) {
		
		
		Method_OverLoading_Concept obj = new Method_OverLoading_Concept();
		
		obj.add(7,8);
	}
	
		public void add(int a , int b)
		{
			
		}
		public void add(byte b, int a)
		{
			
		}
		
		public void add(byte b, byte a)
		{
			
		}
		
		
		
		/*below method is not possible  as w cant acive overridding with same sigatyre and different return type
		 * 
		 public int add(double var, int a)
		{
			
		}
		
		 */
		
		public void add(double var, int a)
		{
			
		}
		
		
		 
		/*below method is not possible as type is same as above method
		 
		  public void add(double var, int c)
		{
			
		}
		*/
		

	

}
