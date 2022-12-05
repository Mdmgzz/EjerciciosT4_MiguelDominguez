 package ejercicio03;

public class NumerosAleatorios {

	public static int aleatorio1 (int num1) {
		
		for (int i=1; i<=num1;i++) {
			System.out.println(Math.random()*1);		// genera numeros ramdoms entre 0 y 1 hasta llegar al valor introducido
		}
		return 0; 
	}
	
	public static int aleatorio1 (int num1,int num2) {		
		
		for (int i=1; i<=num1;i++) {					//genera la cantidad de numeros introducidos entre 0 y el numero introducido(num2)
			System.out.println(Math.random()*num2);
		}
		return 0;
	}
	public static int aleatorio1 (int num1,int num2,int num3) { //genera la cantidad de numeros introducidos entre el numero introducido(num3) y el numero introducido(num2)
		
		for (int i=1; i<=num1;i++) {
			System.out.println(Math.random()*num2+num3);
		}
		return 0;
	}
}
