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
	/*
	 * Finds the largest product diagonally from left to, and both from bottom to top and top to bottom in a multidimensional square matrix
	 * @param long[][] nums, int set
	 * loops through the multidimensional array horizontally and multiply values vertically
	 * @return largestproduct
	 */
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
						//System.out.print(nums[j-k][k+count] + " ");//for testing
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
	/*
	 * Finds the largest product vertically in a multidimensional square matrix
	 * @param long[][] nums, int set
	 * loops through the multidimensional array horizontally and multiply values vertically
	 * @return largestproduct
	 */
	long findlargestproductvertically(long[][] nums, int set)
	{
		long tempproduct;
		long largestproduct = 0;
		int length = nums.length;
		int width = nums[0].length;
		//go through the multidimensional array vertically and multiply values horizontally
		for(int l = 0; l<=length-1;l++)
		{
			
				int count = 0;
				for(int j=l; count<=width-set; count++)
				{
					
					int place = 0;
					tempproduct = 1;
					for(int k = 0; place<set&&k<length; k++)
					{
						tempproduct = tempproduct * nums[k+count][j];
						//System.out.print(nums[k+count][j] + " ");//for testing
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
					//place++;
					
				}	
		
		}
		return largestproduct;
	}
	/*
	 * Finds the largest product horizontally in a multidimensional square matrix
	 * @param long[][] nums, int set
	 * loops through the multidimensional array vertically and multiply values horizontally
	 * @return largestproduct
	 */
	long findlargestproducthorizontally(long[][] nums, int set)
	{
		long tempproduct;
		long largestproduct = 0;
		int length = nums.length;
		int width = nums[0].length;
		//go through the multidimensional array vertically and multiply values horizontally
		System.out.println("hi");
		for(int l = length-1; l>=0;l--)
		{
			//System.out.println(l);
				int count = 0;
				for(int j=l; count<=width-set; count++)
				{
				
					int place = 0;
					tempproduct = 1;
					for(int k = count; place<set&&k<width; k++)
					{
						tempproduct = tempproduct * nums[j][k];
						//System.out.print(nums[j][k] + " ");//for testing
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
					//place++;
					
				}	
		
		}
		return largestproduct;
	}
	//calls all other findlargestproduct methods and tests which one returns the largest number then returns that number
	long findlargestproductoverall(long[][] nums, int set)
	{	
		long largestproduct =0;
		long tempproduct = 0;
		
		tempproduct = findlargestproductdiagonally(nums, set);
		if (tempproduct>largestproduct) largestproduct = tempproduct;
		tempproduct = findlargestproducthorizontally(nums, set);
		if (tempproduct>largestproduct) largestproduct = tempproduct;
		tempproduct = findlargestproductvertically(nums, set);
		if (tempproduct>largestproduct) largestproduct = tempproduct;
		
		return largestproduct;
	}
}
