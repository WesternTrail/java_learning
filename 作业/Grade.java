import java.util.Scanner; 

class Grade{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		float Chi,Mat,Eng,sum,Ave;
		
		Chi = sc.nextFloat();	
		Mat = sc.nextFloat();	
		Eng = sc.nextFloat();	
		
		sum = Chi+Mat+Eng;
		Ave = sum/3;
		
		System.out.println("��������ܷ�Ϊ��"+String.format("%.2f",sum));
		System.out.println("�������ƽ����Ϊ��"+String.format("%.2f",Ave));
		System.out.println("������ı���ѧ�ߣ�"+String.format("%.2f",Chi-Mat)+"��");
		
	}	
}