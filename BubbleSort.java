public class BubbleSort
{

	public static void main(String[] args)
  {
    int[] myNums = {12, 15, 0, 44, 13, 1, 2};
		int passes = myNums.length - 1;
		int comparisons;
		int tempNum;

		//Loop once for each pass, where passes is one less than the number of items.
		while(passes > 0)
		{
		
			//Loop once for each comparison, where comparisons are one less than the number of unsorted.
			for(int i=0; i<myNums.length-1; i++)
			{
				//If they are out of order, swap the values
				if(myNums[i] > myNums[i+1])
				{
					tempNum = myNums[i];
					myNums[i] = myNums[i+1];
					myNums[i+1] = tempNum;
				}
			//End Loop for comparisons
			}
			//The next pass will use one less comparison
			passes -= 1;
		//End Loop for passes
		}

  }
}
