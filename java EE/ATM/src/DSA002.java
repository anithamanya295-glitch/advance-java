public class DSA002 {

	public static void main(String[] args) 
	{
		int[][] matrix= {{11,12,13,14},
				         {15,16,17,18},
				         {19,20,21,22}};
		System.out.println("Input");
		print(matrix);
		
		System.out.println("\nStep 1: Transpose");
		transpose(matrix);
		print(matrix);
		System.out.println("\nOutput:Reverse");
		
		
	}
	static void transpose(int[][] matrix)
	{
		int n=matrix.length;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
	}
	static void print(int[][] matrix)
	{
		for(int[] row : matrix)
		{
			for(int val : row)
			{
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}
}
