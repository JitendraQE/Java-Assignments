package assignments.stringmanipulation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindMaxandMinValue {

	public static void main(String[] args) {
		
		int []a= {3,4,6,1,2,9,4,3,7};
		
		int num=fetchDesireMaxValue(2,a);
		System.out.println("Largest number+: "+num);
	}

	public static int fetchDesireMaxValue(int n, int a[])
	{
		int value=0;
		int len= a.length;
		int tmp;	
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{		
				if(a[i]>a[j])
				{
					tmp=a[i];
					a[i]=a[j];
				    a[j]=tmp;   		
				}
			}
		}
		value=a[len-n];
		return value;
	}
	
	public static void findLargestNowithsort(int[] array, int findlargestno)
	 {
		int len=array.length;
		Arrays.sort(array);
		System.out.print(Arrays.toString(array));
		 System.out.println(findlargestno+" largest number is:: "+array[len-findlargestno]);
		 System.out.println(findlargestno+" smallest number is:: "+array[findlargestno-1]);
	 }

}
