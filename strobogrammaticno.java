package may14;

import java.util.HashMap;
import java.util.Scanner;

public class Strobogrammaticc {

	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		String n = in.next();
		System.out.println("Is" +n+ "Is strobogrammatic"+  is_strobogrammatic(n));
	}
	public static boolean is_strobogrammatic(String n)
	{
		if (n==null || n.length()==0)
		{
			return true;
		}
		HashMap<Character,Character> map = new HashMap<Character,Character>();
		map.put('0', '0');
		map.put('1', '1');
		map.put('8', '8');
		map.put('6', '6');
		map.put('9', '9');
		
		int left =0;
		int right = n.length()-1;
		while (left<=right)
		{
			if(!map.containsKey(n.charAt(right))||(n.charAt(left)) !=map.get(n.charAt(right)))
			{
				return false;
				
			
			}
			left ++;
			right --;
		}
		return true;
		}
		
		

	}

