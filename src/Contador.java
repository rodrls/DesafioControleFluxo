import java.util.Scanner;


public class Contador {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (Exception exception) {
			//imprimir a mensagem: 
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm > parametroDois){
			throw new ParametrosInvalidosException();
		}else {
			//for para imprimir os números com base na variável contagem
			int contagem = parametroDois - parametroUm;
			System.out.println("valor " +contagem);
			for (int i = 1; i <= contagem; i++) {
				System.out.println("imprimindo o numero " + i);
			}
		}
		
	}
}
