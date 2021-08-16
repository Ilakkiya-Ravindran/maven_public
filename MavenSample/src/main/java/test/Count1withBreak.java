package test;

public class Count1withBreak {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=0;
int a=3;
while(count++<3)
{
	switch(count)
	{
	default:
	case 0:
		a-=1;
		break;
		
	case 1:a+=5;
	}


System.out.println(a);
	}
	}
}
