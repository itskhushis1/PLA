package may14;

public class Euclid {
    
	public static int euclid(int x, int y)
	{
		if(x==0||y==0)
		{
			return 1;
		}
		if (x<y)
		{
			int t=x;
			x=y;
			y=t;
			
		}
		if (x%y==0)
		{
			return y;
			
		}
		else
		{
			return euclid(y,x%y);
					
		}
	}
	public static void main(String[] args) {
	   System.out.println();

	}

}
