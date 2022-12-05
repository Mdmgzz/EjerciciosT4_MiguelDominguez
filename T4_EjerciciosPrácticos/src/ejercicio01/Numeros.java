package ejercicio01;

public class Numeros {
	boolean esPrimo(int numero) {
		boolean esPrimo= true;
		for (int i=2;i<=numero;i++) {
			if (numero%i==0) {
				esPrimo=false;
				break;
			}
		}
		return esPrimo;
		
	}
	boolean esCapicua (int numero) {
		boolean esCapicua=true;
		int numeroini=numero;
		int num;
		int aux=0;
		int cifra;
		
		num = numero;
		
		while (num>0) {						// el bucle funciona mientras el num se mayor que 0
			cifra=num%10;					// sacamos la ultima cifra
			aux=aux*10+cifra;				//añadimos la ultima cifra a la variable aux
			num=num/10;						// y por ultimo quitamos la cifra que ya hemos añadido, así hasta que sea 0
			if (aux==numeroini) {
				esCapicua=true;
				break;
			}else {
				esCapicua=false;
			}
		}
		return esCapicua;
		}
	}

