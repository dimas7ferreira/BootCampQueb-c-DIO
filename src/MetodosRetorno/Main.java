package MetodosRetorno;

import MetodosRetorno.Quadrilatero;

public class Main {
	public static void main(String args[]) {
		System.out.println("Exercicio de retornos");
		
		double areaQuadrado = Quadrilatero.area(3);
		System.out.println("Area do quadrado: " + areaQuadrado);
		
		double areaRetangulo = Quadrilatero.area(5,5);
		System.out.println("Area do retangulo: " + areaRetangulo);
		
		double areaTrapezio = Quadrilatero.area(7,8,9);
		System.out.println("Area do trapezio: " + areaTrapezio);
	}
}
