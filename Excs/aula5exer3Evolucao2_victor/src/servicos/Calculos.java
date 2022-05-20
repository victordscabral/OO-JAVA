package servicos;

import java.util.Vector;
import dados.Habitante;

public class Calculos {
	public static int menorIdade(Vector<Habitante> grupoHabitantes) {
		// Declaracoes
		int menorIdade = 200;

		// Instrucoes
		for (int aux = 0; aux < grupoHabitantes.size(); aux++) {
			Habitante habitante = (Habitante) grupoHabitantes.get(aux);
			if (habitante.getIdade() < menorIdade)
				menorIdade = habitante.getIdade();
		}
		return menorIdade;
	}

	public static float maiorSalario(Vector<Habitante> grupoHabitantes) {
		// Declaracoes
		float maiorSalario = 0f;

		// Instrucoes
		for (int aux = 0; aux < grupoHabitantes.size(); aux++) {
			Habitante habitante = (Habitante) grupoHabitantes.get(aux);
			if (habitante.getSalario() > maiorSalario)
				maiorSalario = habitante.getSalario();
		}
		return maiorSalario;
	}

	public static float mediaNumFilhos(Vector<Habitante> grupoHabitantes) {
		// Declaracoes
		float mediaNumFilhos = 0f;

		// Instrucoes
		for (int aux = 0; aux < grupoHabitantes.size(); aux++) {
			Habitante habitante = (Habitante) grupoHabitantes.get(aux);
			mediaNumFilhos += habitante.getNumeroFilhos();
		}
		return mediaNumFilhos / grupoHabitantes.size();
	}

	public static float mediaSalario(Vector<Habitante> grupoHabitantes) {
		// Declaracoes
		float mediaSalario = 0f;

		// Instrucoes
		for (int aux = 0; aux < grupoHabitantes.size(); aux++) {
			Habitante habitante = (Habitante) grupoHabitantes.get(aux);
			mediaSalario += habitante.getSalario();
		}
		return mediaSalario / grupoHabitantes.size();
	}

	// mediaHomensSalSup = Media Homens Salario Superior

	public static float mediaHomensSalSup(Vector<Habitante> grupoHabitantes) {
		// Declaracoes
		float mediaHomensSalSup = 0f;
		float quantidadeHomens = 0f;

		// Instrucoes
		for (int aux = 0; aux < grupoHabitantes.size(); aux++) {
			Habitante habitante = (Habitante) grupoHabitantes.get(aux);
			if (habitante.getSalario() > 300 && habitante.getSexo() == 'M')
				mediaHomensSalSup++;
			if (habitante.getSexo() == 'M')
				quantidadeHomens++;
		}
		if (quantidadeHomens == 0)
			return mediaHomensSalSup = 0;
		else
			return mediaHomensSalSup / quantidadeHomens;
	}

	// quantPessoasSalSup = Quantidade Pessoas Salario Superior

	public static int quantPessoasSalSup(Vector<Habitante> grupoHabitantes, float media) {
		// Declaracoes
		int quantidade = 0;

		// Instrucoes
		for (int aux = 0; aux < grupoHabitantes.size(); aux++) {
			Habitante habitante = (Habitante) grupoHabitantes.get(aux);
			if (habitante.getSalario() > media)
				quantidade++;
		}
		return quantidade;
	}

}
