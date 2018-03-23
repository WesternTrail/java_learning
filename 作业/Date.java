import java.util.Scanner;
import java.lang.*;

public class Date{
	public static void main(String[] agrs)
	{
		System.out.print("请输入：");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input==1)
			System.out.println("星期一");
		else if(input==2)
			System.out.println("星期二");
		else if(input==3)
			System.out.println("星期三");
		else if(input==4)
			System.out.println("星期四");
		else if(input==5)
			System.out.println("星期五");
		else if(input==6)
			System.out.println("星期六");
		else if(input==7)
			System.out.println("星期日");
	}
}