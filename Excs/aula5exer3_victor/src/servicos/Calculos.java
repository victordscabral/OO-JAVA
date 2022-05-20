package servicos;

import java.util.Vector;
import java.text.DecimalFormat;
import dados.Habitante;

public class Calculos {
	public static int menorIdade(Vector grupoHabitantes) {
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

	public static float maiorSalario(Vector grupoHabitantes) {
		// Declaracoes
		float maiorSalario = 0F;

		// Instrucoes
		for (int aux = 0; aux < grupoHabitantes.size(); aux++) {
			Habitante habitante = (Habitante) grupoHabitantes.get(aux);
			if (habitante.getSalario() > maiorSalario)
				maiorSalario = habitante.getSalario();
		}
		return maiorSalario;
	}

	public static float mediaNumFilhos(Vector grupoHabitantes) {
		// Declaracoes
		float mediaNumFilhos = 0F;

		// Instrucoes
		for (int aux = 0; aux < grupoHabitantes.size(); aux++) {
			Habitante habitante = (Habitante) grupoHabitantes.get(aux);
			mediaNumFilhos += habitante.getNumFilhos();
		}
		return mediaNumFilhos / grupoHabitantes.size();
	}

	public static float mediaSalario(Vector grupoHabitantes) {
		// Declaracoes
		float mediaSalario = 0F;

		// Instrucoes
		for (int aux = 0; aux < grupoHabitantes.size(); aux++) {
			Habitante habitante = (Habitante) grupoHabitantes.get(aux);
			mediaSalario += habitante.getSalario();
		}
		return mediaSalario / grupoHabitantes.size();
	}

	// mediaHomensSalSup = Media Homens Salario Superior

	public static float mediaHomensSalSup(Vector grupoHabitantes) {
		// Declaracoes
		int mediaHomensSalSup = 0;
		int quantidadeHomens = 0;

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

	public static int quantPessoasSalSup(Vector grupoHabitantes, float media) {
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
