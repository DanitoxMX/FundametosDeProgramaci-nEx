package Capitulo3;

public class sumaPareImpar {
	public static void main(String[] arg) {
		
		int sumPar = 0, sumImpar = 0;
		
		for (int i = 1; i<= 10 ;i ++) {
			if (i % 2 == 0)
				sumPar += i;
			else
				sumImpar += i;
		}
		
		System.out.println("La suma Par es = " +  sumPar);
		System.out.println("La suma Impar es = " +  sumImpar);
	}
}
