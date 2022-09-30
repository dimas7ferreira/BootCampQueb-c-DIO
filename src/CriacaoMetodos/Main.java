package CriacaoMetodos;

public class Main {

	public static void main(String[] args) {

		// Calculadora
		System.out.println("Exercicio calculadora: ");
		Calculadora.soma(3, 8);
		Calculadora.subtracao(5, 1.4);
		Calculadora.multiplicacao(5, 3);
		Calculadora.divisao(10, 2.5);

		
		//Emprestimo
		System.out.println("Exercicio de empréstimo: ");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000, 5);
		
		//Mensagem
		System.out.println("Exercicio de mensagem");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(16);
		Mensagem.obterMensagem(2);
	}
}
