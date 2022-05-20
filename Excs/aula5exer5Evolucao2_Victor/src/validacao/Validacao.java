package validacao;

import java.util.ArrayList;
import java.util.InputMismatchException;

import dados.Aluno;
import dados.GrupoAlunos;
import leitura.Leitura;
import saida.Visao;

public class Validacao {
	public static String validaNome() {
		String nome;
		
		System.out.println("\n-------------------------------CADASTRO-------------------------------");
		do {
			System.out.print("Digite o nome completo do aluno: ");
			nome = Leitura.leString();
			
			if (nome.isEmpty() || nome.isBlank()) 
				System.out.println("\nNome invalido !! Nao e aceito deixar esse campo em branco");
		} while(nome.isEmpty() || nome.isBlank());
		return nome;
	}
	
	public static int validaMatricula(GrupoAlunos grupoAlunos) {
		int matricula = 0;
		boolean erro;
		final int MAX = 1000;
		
		System.out.print("Digite a matricula do aluno (deve ser maior que " + MAX +"): ");
	
		do {
			try {
				erro = false;
				matricula = Leitura.leInteiro();
				
				if(matricula < MAX) {
					Visao.limpaConsole(1);
					System.out.println("Valor fora do intervalo esperado (deve ser maior que " + MAX + ")\nDigite novamente: ");
					erro = true;
				}
				else {
					for(int i = 0; i < grupoAlunos.getGrupoAlunos().size(); i++) {
						if(grupoAlunos.getGrupoAlunos().get(i).getMatricula() == matricula) {
							System.out.println("\nMatricula ja existente !! Impossivel cadastrar outro aluno com a mesma matricula.");
							erro = true;
						}
						else {
							erro = false;
						}
					}
				}
				
			} catch (InputMismatchException e) {
				System.out.println("\nFormato de matricula invalido !! Digite somente os numeros da matricula");
				erro = true;
			}
		}while(erro);
		
		return matricula;
	}
	
	public static float validaMedia() {
		float media = -1f;
		boolean erro;
		
		do {
			try {
				erro = false;
				System.out.print("Digite a media final do aluno: ");
				media = Leitura.leFloat();
				
				if(media < 0 || media > 10) {
					System.out.println("\nMedia invalida !! O valor deve estar entre 0 e 10 !!");
					erro = true;
				}
			} catch(InputMismatchException e) {
				System.out.println("Formato invalido de media !! Se atente ao numero inserido. Caso escreva numero decimal utilize ',' e nao '.' !!\n");
				erro = true;
			}
		}while(erro);
		Visao.limpaConsole(1);
		
		return media;
		
	}
	
	public static boolean isContinuaCadastro(){
		char continua;
		boolean erro;
		
		do {
			erro = false;
			System.out.print("Deseja cadastrar mais um aluno ? Digite 'Sim' ou 'Nao' para escolher: ");
			continua = Leitura.leCaracter();
			
			if(continua != 'S' && continua != 'N') {
				System.out.println("Opcao invalida !!\n");
				erro = true;
			}
		}while(erro);
		
		if(continua == 'S') {
			Visao.limpaConsole(20);
			return true;
		}
		return false;
	}
	
	public static float validaMediaGeral(GrupoAlunos grupoAlunos) {
		float soma = 0F;
		ArrayList<Aluno> alunosCadastrados = grupoAlunos.getGrupoAlunos();
		
		for(int i=0; i < alunosCadastrados.size(); i++)
			soma += alunosCadastrados.get(i).getMediaAritmetica();
		
		return soma/alunosCadastrados.size();
	}
}











