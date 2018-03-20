package Capitulo3;
/**
 * Ingresada la fecha se obtenga la fecha del día siguente
 * @author Daniel Díaz
 *
 */
import java.util.Scanner;
public class SiguienteDia {
	public static void main(String[] arg) {
		Scanner sc = new  Scanner(System.in);
		
		int dia = sc.nextInt();
		int mes = sc.nextInt();
		int anio = sc.nextInt();
		
			if (dia == 31 && mes % 2 == 1 && mes < 8)	{
				dia = 1;
				mes++;
			} else if (dia == 30 && mes < 8 && mes%2==0) {
				dia = 1;
				mes++;
			} else if (dia == 31 && mes%2 == 0 && mes > 7) {
				if(mes == 12) {
					anio++;
					dia = mes = 1;
				}
				else {
					mes++;
					dia = 1;
				}
			}
			else if (dia == 30 && mes > 7 && mes%2==1) {
				dia = 1;
				mes++;
			} else if (dia <= 31)
				dia++;
			else
				System.out.println("Datos Incorrectos");
			
			System.out.println(dia + " / " + mes + " / " + anio + " / ");
		
			
	}
}
