package SegCapitulo;
import java.util.Scanner;

public class MCDEuclides {

	public static void main(String[] args) {
		Scanner al = new Scanner(System.in);
		int a,b, divisor, resto, MCD, temp;
		a = al.nextInt();
		b = al.nextInt();
		if (a < b) {
			temp = a;
			a = b;
			b =temp;
		}
		
		divisor = a / b;
		resto = a % b;
		
		while(resto != 0) {
			temp = divisor;
			divisor = divisor / resto;
			resto = temp % resto;
		}
		
		MCD = MCD(a, b);
		System.out.println(MCD);
		
	}
	public static int MCD(int a,int b) {
		if (b == 0)
			return a;
		else
			return MCD(b, a % b);
	}
	
}
