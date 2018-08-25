package Array;

import java.util.ArrayList;

public class CommomElementInThreeArrray {

	public static void main(String[] args) 
	
	{
		int a1[] ={2,4,8};
		int a2[] ={2,3,4,8,10,16};
		int a3[] ={4,8,14,40};
		commonElemetnt(a1, a2, a3);
	}
	
	public static void commonElemetnt(int a1[],int a2[], int a3[])
	{
		ArrayList<Integer> common = new ArrayList<Integer>();
		int x = 0, y = 0, z = 0;
		while (x < a1.length && y < a2.length && z < a3.length)
		{
			if (a1[x] == a2[y] && a2[y] == a3[z])
			{
				common.add(a1[x]);
				x++;
				y++;
				z++;
			}
			else if (a1[x] < a2[y])
				x++;
			else if (a2[y] < a3[z])
				y++;
			else
				z++;
		}
		System.out.println(common);
	}
	
	

}
