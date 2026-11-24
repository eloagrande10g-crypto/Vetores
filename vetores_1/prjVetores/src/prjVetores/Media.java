package prjVetores;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAM = 10;
		int a[],soma=0, i;
		a = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("digite o " +(i+1)+" numero");
			a[i]= ler.nextInt();
			soma = ((a[i]+a[i])/TAM)+4;
		}
		System.out.println(soma);
		ler.close();
	}

}
