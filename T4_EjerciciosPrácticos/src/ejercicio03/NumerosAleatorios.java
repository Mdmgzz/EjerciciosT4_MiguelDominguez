 package ejercicio03;

public class NumerosAleatorios {

	public static int aleatorio1 (int num1) {
		
		for (int i=1; i<=num1;i++) {
			System.out.println(Math.random()*1);
		}
		return 0; 
	}
	
	public static int aleatorio1 (int num1,int num2) {
		
		for (int i=1; i<=num1;i++) {
			System.out.println(Math.random()*num2);
		}
		return 0;
	}
	public static int aleatorio1 (int num1,int num2,int num3) {
		
		for (int i=1; i<=num1;i++) {
			System.out.println(Math.random()*num2+num3);
		}
		return 0;
	}
}
