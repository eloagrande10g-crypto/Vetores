package prjVetores;

import java.util.Scanner;

public class Invertido {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAM = 10;
		int a[], b[], i, j=0;
		a = new int [TAM];
		b = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite "+(i+1)+" número");
			a[i]= ler.nextInt();
		}
		
		for (i=10; i<TAM; i--) {
			b[j]= a[i];
			System.out.println(b[j]);
		}
		
		ler.close();
	}

}
