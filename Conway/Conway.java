import java.util.Arrays;

public class Conway {
	
	private int [] [] mat;
	private int [] [] temp;
	public Conway(int[][] Mat){
		mat = new int[Mat.length][Mat[0].length];
		for (int r=0;r<Mat.length;r++)
		{
			for(int c=0;c<Mat[0].length;c++)
			{
				mat[r][c]=Mat[r][c];
			}
				
		}
		temp= new int[mat.length+2][mat[0].length+2];
		temp[0]=Mat[Mat.length-1];
		for (int r=0;r<temp.length;r++)
		{
			for(int c=0;c<temp[0].length;c++)
			{
				if (c==0)
					temp[r+1][0]=Mat[r][Mat.length-1];
				if(c==Mat[c].length)
					temp[r+1][c]=Mat[r][0];
				temp[r+1][c+1]=Mat[r][c];
			}
				
		}
		temp[temp.length-1]=Mat[0];
	}
	public void border(int r, int c)
	{
		if (r==0)
			c=0;
	}
	public void Execution()
	{
		for (int r=0;r<mat.length;r++)
		{
			for(int c=0;c<mat[0].length;c++)
			{
				//if(r==0||c==0||r==mat.length-1||c==mat[c].length-1)
					border(r,c);
				if(mat[r][c]==1)
				{
					populated(r,c);
				}
				else unpopulated(r,c);
				
			}
				
		}
	}
	public void populated(int r, int c)
	{
		int count=-1;
		for(int i=r-1;i<=r+1;i++)
		{
			for(int j=c-1;j<=c+1;j++)
			if(mat[i][j]==1)
				count++;
		}
		if(count<2)
			mat[r][c]=0;
		if(count>3)
			mat[r][c]=0;
	}
	public void unpopulated(int r, int c)
	{
		//int[][] temp= new int[mat.length+2][mat[0].length+2];
		
		int count=0;
		for(int i=r-1;i<=r+1;i++)
		{
			for(int j=c-1;j<=c+1;j++)
			if(mat[i][j]==1)
				count++;
		}
		if (count>=3)
			mat[r][c]=1;
	}
	public String toString()
	{
		String output="";
        for(int[] array:mat)
        {
            output+=Arrays.toString(array)+"\n";
          }
        return output;
	}
}
