package Assignment_01;
import java.util.Scanner;
public class Ques_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		B obj=new B(a,b);
		
		int result=a>b?obj.sum(a,b):obj.sub(a,b);
		System.out.println("Result is "+result);
	}

}

class B
{
	int a,b;
	B(int a1,int b1)
	{
		this.a=a1;
		this.b=b1;
	}
	int sum(int a,int b)
	{
		return a+b;
	}
	int sub(int a,int b)
	{
		return a-b;
	}
}