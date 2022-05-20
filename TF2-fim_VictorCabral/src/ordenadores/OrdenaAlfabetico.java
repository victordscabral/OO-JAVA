package ordenadores;

import java.util.Comparator;
import dados.Pessoa;

// Classe para ordenar de maneira alfabetica
public class OrdenaAlfabetico implements Comparator <Pessoa> {
	@Override
	public int compare(Pessoa pessoaUm, Pessoa pessoaDois) {
		return (pessoaUm.getNome().toString().compareTo(pessoaDois.getNome().toString()));
	}
}
