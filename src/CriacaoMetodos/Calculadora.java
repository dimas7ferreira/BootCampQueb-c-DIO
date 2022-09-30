package CriacaoMetodos;

public class Calculadora {
	public static void soma(double n1, double n2) {
		double resultado = n1 + n2;
		System.out.println("A soma dos numeros " + n1 + " mais " + n2 + " resulta em " + resultado);
	}

	public static void subtracao(double n1, double n2) {
		double resultado = n1 - n2;
		System.out.println("A subtracao dos numeros " + n1 + " menos " + n2 + " resulta em " + resultado);
	}

	public static void multiplicacao(double n1, double n2) {
		double resultado = n1 * n2;
		System.out.println("A multiplicacao dos numeros " + n1 + " vezes " + n2 + " resulta em " + resultado);
	}

	public static void divisao(double n1, double n2) {
		double resultado = n1 / n2;
		System.out.println("A divisão dos numeros " + n1 + " dividido " + n2 + " resulta em " + resultado);
	}
	
}
