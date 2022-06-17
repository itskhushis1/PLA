package may14;
public class addarr {
	
	public static void main (String args[]){
        int n = 5000000;
        int[] arr = new int [n];
        for (int i = 0; i < n ; i++)
              arr[i] = i;
        

      // Calculate sum in O(n) time
        long start = System.nanoTime();

        int sum = 0;
        for (int i = 0; i<n; i++)
        	 sum= sum + arr[i];
        System.out.println(sum);
        long end = System.nanoTime();

        long elapsedTime = end - start;
        System.out.println(elapsedTime);
	}

}
