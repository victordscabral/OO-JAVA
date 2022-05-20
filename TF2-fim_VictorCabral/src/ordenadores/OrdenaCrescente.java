package ordenadores;

import java.util.Comparator;
import dados.Pessoa;

//Classe para ordenar de maneira crescente
public class OrdenaCrescente implements Comparator <Pessoa> {
	@Override
	public int compare(Pessoa pessoaUm, Pessoa pessoaDois) {
		return (pessoaUm.getIdentificador().compareTo(pessoaDois.getIdentificador()));
	}
}
