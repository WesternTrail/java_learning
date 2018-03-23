public class Sum{
	public static void main(String[] agrs)
	{
		int i = 0;
		int Sum = 0;
		for(int j = 1;j <= 100;j++)
		{
			if(j%2==0)
			{
				i++;
				Sum+=j;
			}
		}
		System.out.printf("Sum:%d,Odd:%d",Sum,i);
	}
} 
