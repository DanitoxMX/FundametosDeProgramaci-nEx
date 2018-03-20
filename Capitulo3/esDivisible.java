package Capitulo3;
/*
 * Héctor Daniel Díaz Rodríguez
 *ALGORITMO PARA SABER SI UNO U OTRO NÚMERO ES DIVISIBLE POR el otro
*/
import java.util.Scanner;

public class esDivisible {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0)
			System.out.println("Si son divisibles");
		else
			System.out.println("No lo son");
	}
}
