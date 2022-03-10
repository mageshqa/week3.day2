package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,6,7,8,9};
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (Integer i : a) {
			list.add(i);
		}
		
		for(int j=0;j<=list.size();j++)
		{
			if(j+1!=list.get(j))
			{
				System.out.println(j+1);
				break;
			}
				
			
		}	
		
	}

}
