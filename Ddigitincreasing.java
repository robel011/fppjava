package javajava;

public class Ddigitincreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int x=60;
      System.out.println(isDigit(x));
	}
public static int isDigit(int x) {
	int temp= x,sum=0, sum2=0;
	while(x>0) {
		//r=x%10;
		x=x/10;
		sum=(sum*10)+1;
		sum2+=sum;
	}
	if(temp%sum2==0)
		return 1;
	else return 0;
}
}
