package principal;

public class Main {

	public static void main(String[] args) {
		
		do {
			String nome;
			int idade;
			float altura;
		
			System.out.println("Digite o nome, idade de altura de uma pessoa: ");
		
			nome = Leitura.lerNome();
		
			idade = Leitura.lerIdade();
		
			altura = Leitura.lerAltura();
		
			Pessoa pessoa = new Pessoa(nome, idade, altura);
		
			Servicos.mostraDados(pessoa.nome, pessoa.idade, pessoa.altura);
		
		} while(Validacao.validaContinua());
		
	}
}
