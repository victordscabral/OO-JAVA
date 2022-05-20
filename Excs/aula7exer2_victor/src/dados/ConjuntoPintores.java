package dados;

import java.util.ArrayList;

import validacao.Validacao;

public class ConjuntoPintores {
	private ArrayList<Pintor> conjuntoPintores;
	
	// Metodo Construtor
	public ConjuntoPintores() {
		conjuntoPintores = new ArrayList<Pintor>();
	}
	
	// Metodos Acessores
	public ArrayList<Pintor> getConjuntoPintores() {
		return this.conjuntoPintores;
	}
	
	public Pintor getPintor(int i) {
		return conjuntoPintores.get(i);
	}
	
	//Metodo para adicionar pintor
	public void adicionaPintor(Pintor pintor) {
		this.conjuntoPintores.add(pintor);
	}
	
	//Metodo para cadastrar pintor
	public void cadastraPintor(ConjuntoPintores conjuntoPintores) {
		Pintor pintor = new Pintor(Validacao.validaNomePintor(), Validacao.validaCodigoPintor(conjuntoPintores),
				Validacao.validaAnoNascimento());
		adicionaPintor(pintor);
	}
}
