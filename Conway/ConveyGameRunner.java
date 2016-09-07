import java.util.Arrays;
import static java.lang.System.*;
public class ConveyGameRunner {

public static void main(String[] args) { 
	int[][] randomMat= new int[10][10];
	for (int r=0;r<randomMat.length;r++)
	{
			for(int c=0;c<randomMat[0].length;c++)
		{
				randomMat[r][c]=(int)(Math.random()*2);
		}
	}
	
	int[][]Mat={{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,1,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,1,1,0,1,0,0,0,0},
				{0,0,1,0,0,0,0,0,0,0},
				{0,0,1,0,0,0,0,0,0,0},
				{0,1,1,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,1,0,0},
				{0,0,0,0,0,0,0,0,0,0}};
	String output="";
    for(int[] array:Mat)
    {
        output+=Arrays.toString(array)+"\n";
    }
	//Action Phase
	Conway asd = new Conway(Mat);
	out.println(output);
	asd.Execution();
	out.println(asd.toString());
}
}
