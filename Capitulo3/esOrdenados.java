package Capitulo3;
import java.util.Scanner;


public class esOrdenados {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a <= b)
			System.out.println("Estan en orden creciente");
		else
			System.out.println("Estan en orden decreciente");
	}
}
