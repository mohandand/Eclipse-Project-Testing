package javaPractice;

public class ArrayThreeDimension {

	public static void main(String[] args) {
		
		int[][][] array1 =new int[2][3][4];
		
		for(int i=0;i<array1.length;i++)
			
		{
			for(int j=0;j<array1[i].length;j++)
				
				for(int k=0;k<array1[i][j].length;k++)
				{
					array1[i][j][k]=(int)(Math.random()*100);
					
					System.out.print(array1[i][j][k]+" ");
				}
			System.out.println();
		}
		
		System.out.println();

	}

}
