package prjVetores;

import java.util.Scanner;

public class SomaDosDois {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAM = 10;
		int a[], b[], c[], i;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Insira o "+i+" número");
			a [i]= ler.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			System.out.println("Insira o "+i+" número");
			b [i]= ler.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			c[i] = b[i] + a[i];
			System.out.println(c[i]);
		}
	}

}
