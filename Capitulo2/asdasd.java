package SegCapitulo;
import java.util.Scanner;

public class asdasd {

	public static void main(String[] args) {
		Scanner al = new Scanner(System.in);
		int a,b, divisor, resto, MCD;
		a = al.nextInt();
		b = al.nextInt();
		if (a < b) {
			int temp = a;
			a = b;
			b =temp;
		}
		
		divisor = a / b;
		resto = a % b;
		
		while(resto != 0) {
			divisor = divisor / resto;
			resto = divisor % resto;
		}
		
		MCD = divisor;
		System.out.println(MCD);
		
	}
	
}
