package packag;
/**
* FindGridProduct(base Class) for assignment 7 Programming 2
* Nathan Reynolds
* Teacher: Professor Nicholson
* Class: Computer Programming 2
* Date: 3/2/15
* Assignment Description: this is theBase class for a GitHub assignment to solve a projectEuler program in java and
* 						 post it to a GitHub repository, then have someone else make changes to the main and commit and
*						 push those changes to the repository
****************************************************************************************************************
*/


public class FindGridProduct 
{
	long findlargestproductdiagonally(long[][] nums, int set)
	{
		long tempproduct;
		long largestproduct = 0;
		int length = nums.length;
		int width = nums[0].length;
		//go through the multidimensional array diagonally from left to right and top to bottom
		for(int l = width-set; l>=0;l--)
		{
			//System.out.println(l);
				int count = 0;
				for(int j=l; count<=length-set; count++)
				{
					
					//int place = 0;
					tempproduct = 1;
					for(int k = 0; k<set; k++)
					{
						tempproduct = tempproduct * nums[j+k][k+count];
						//System.out.println(nums[j+k][k+count]);//for testing
						//System.out.println(temp);
					}
					//if (tempproduct > 1) System.out.println(tempproduct);//for testing
					if (tempproduct > largestproduct) 
					{
						largestproduct = tempproduct;
						//Next 2 lines are for testing purposes the current answer for the largest product of 13 consecutive numbers in the series 
						//then print out where the first number is that got you that product
						//System.out.println(largestproduct);
						//System.out.println(i);
					}
					//place++;
					
				}	
		
		}
		//go through the multidimensional array and multiply values diagonally from left to right and bottom to top
		for(int w = width-1; w >= set-1; w--)
		{
			//System.out.println(w);
				int count = 0;
				for(int j=w; count <= length-set; count++)
				{
					
					int place = 0;
					tempproduct = 1;
					for(int k = 0; k <set; k++)
					{
						tempproduct = tempproduct * nums[j-k][k+count];
						//System.out.println(nums[j-k][k+count]);//for testing
						//System.out.println(temp);
						place++;
					}
					//if (tempproduct > 1) System.out.println(tempproduct);//for testing
					if (tempproduct > largestproduct) 
					{
						largestproduct = tempproduct;
						//Next 2 lines are for testing purposes the current answer for the largest product of 13 consecutive numbers in the series 
						//then print out where the first number is that got you that product
						//System.out.println(largestproduct);
						//System.out.println(i);
					}
					
					
				}	
		
		}
		
		return largestproduct;
		
	}
	long findlargestproductvertically(long[][] nums, int set)
	{
		long tempproduct;
		long largestproduct = 0;
		int length = nums.length;
		int width = nums[0].length;
		//go through the multidimensional array horizontally and multiply values vertically
		for(int l = width-set; l>=0;l--)
		{
			//System.out.println(l);
				int count = 0;
				for(int j=l; count<=length-set; count++)
				{
					
					//int place = 0;
					tempproduct = 1;
					for(int k = 0; k<set; k++)
					{
						tempproduct = tempproduct * nums[j][k+count];
						//System.out.println(nums[j+k][k+count]);//for testing
						//System.out.println(temp);
					}
					//if (tempproduct > 1) System.out.println(tempproduct);//for testing
					if (tempproduct > largestproduct) 
					{
						largestproduct = tempproduct;
						//Next 2 lines are for testing purposes the current answer for the largest product of 13 consecutive numbers in the series 
						//then print out where the first number is that got you that product
						//System.out.println(largestproduct);
						//System.out.println(i);
					}
					//place++;
					
				}	
		
		}
		
		
		return largestproduct;
	}
	long findlargestproducthorizontally(long[][] nums, int set)
	{
		long tempproduct;
		long largestproduct = 0;
		int length = nums.length;
		int width = nums[0].length;
		//go through the multidimensional array vertically and multiply values horizontally
		for(int l = length; l>=0;l--)
		{
			//System.out.println(l);
				int count = 0;
				for(int j=l; count<=width-set; count++)
				{
					
					//int place = 0;
					tempproduct = 1;
					for(int k = count; k<width; k++)
					{
						tempproduct = tempproduct * nums[j][k];
						//System.out.println(nums[j+k][k+count]);//for testing
						//System.out.println(temp);
					}
					//if (tempproduct > 1) System.out.println(tempproduct);//for testing
					if (tempproduct > largestproduct) 
					{
						largestproduct = tempproduct;
						//Next 2 lines are for testing purposes the current answer for the largest product of 13 consecutive numbers in the series 
						//then print out where the first number is that got you that product
						//System.out.println(largestproduct);
						//System.out.println(i);
					}
					//place++;
					
				}	
		
		}
		return largestproduct;
	}
}
