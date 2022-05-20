package dados;

import java.util.ArrayList;

import validacao.Validacao;

public class Galeria {
	private ArrayList<Quadro> galeria;
	
	// Metodo Construtor
	public Galeria() {
		galeria = new ArrayList<Quadro>();
	}
	
	// Metodos Acessores
	public ArrayList<Quadro> getGaleria() {
		return this.galeria;
	}
	
	public Quadro getQuadro(int i) {
		return galeria.get(i);
	}
	
	//Metodo para adicionar quadro
	public void adicionaQuadro(Quadro quadro) {
		this.galeria.add(quadro);
	}
	
	//Metodo para cadastrar quadro
	public void cadastraQuadro(Galeria galeria) {
		Quadro quadro = new Quadro(Validacao.validaNomePintor(), Validacao.validaCodigoQuadro(galeria),
				Validacao.validaPrecoQuadro(), Validacao.validaAnoAquisicaoQuadro());
		adicionaQuadro(quadro);
	}
}
