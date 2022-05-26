package may14;

public class Leadersarray {
	void printLeaders(int arr[], int size)
	{
		int max_leader= arr[size-1];
		System.out.println("leaders in array" + max_leader+"" );
		for(int i =size-2;i>=0;i--)
		{
			if(max_leader<arr[i])
			{
				max_leader = arr[i];
				System.out.println(max_leader+"");
				
			}
		}
		
	}

	public static void main(String[] args) {
		 
		        Leadersarray leadNum = new Leadersarray();
		        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
		        int n = arr.length;
		        leadNum.printLeaders(arr, n);
		    }
		}
