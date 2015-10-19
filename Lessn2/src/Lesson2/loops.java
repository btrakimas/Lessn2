package Lesson2;

import java.util.Arrays;

public class loops {
	
	public static int getMaximum( int [] tempsArray )
	{
		int max = tempsArray[0];
		for (int i = 1; i< tempsArray.length; i++)
		{
			if (tempsArray[i] > max)
				max = tempsArray[i];
		}
		return max;
	}
	
	public static int getMinimum( int [] tempsArray )
	{
		int min = tempsArray[0];
		for (int i = 1; i< tempsArray.length; i++)
		{
			if (tempsArray[i] < min)
				min = tempsArray[i];
		}
		return min;
	}
	public static double getAverage( int [] tempsArray )
	{
		double numberDays = tempsArray.length;
		double totalSum = 0;
		for (int i = 0; i< tempsArray.length; i++)
		{
			totalSum += tempsArray[i];
		}
		return ((double)totalSum/(double)numberDays);
	}
	
	public static double getMedian( int [] tempsArray )
	{
		double median = 0;
		int[] sortedArray = Arrays.copyOf(tempsArray, tempsArray.length);
		Arrays.sort(sortedArray);
		int totalElements = sortedArray.length;
		int middle = totalElements/2;
		// if it is an even number of values, take average of elements at middle and middle + 1
		if (totalElements%2 == 0)
		{
			median = (sortedArray[middle] + sortedArray[middle+1])/2;
		}
		else
		{
			median = sortedArray[middle];
		}
		return median;
	}
	

}
