package dados;

public class Feminino extends Pessoa {
	private Character foiGestante;

// Metodo Contrutor
	public Feminino(Integer identificador, String nome, Character situacaoSaude, Character foiGestante) {
		super(identificador, nome, situacaoSaude);
		setFoiGestante(foiGestante);
	}

// Getters
	public Character getFoiGestante() {
		return foiGestante;
	}

	@Override
	public Integer getIdade() {
		return null;
	}

// Setters
	public void setFoiGestante(Character historicoGestante) {
		this.foiGestante = historicoGestante;
	}

// Metodo toString
	@Override
	public String toString() {
		String pessoa = ("IDENTIFICADOR: " + getIdentificador() + "\nNOME COMPLETO: "
				+ getNome().toString().toLowerCase() + "\nSITUACAO DE SAUDE: " + getSituacaoSaudePorExtenso()
				+ "\nJA FOI GESTANTE: " + getFoiGestantePorExtenso());
		return pessoa;
	}

// Metodo para pegar se foi gestante por extenso
	public String getFoiGestantePorExtenso() {
		String historicoGestante = new String();

		switch (getFoiGestante()) {
		case 'S':
			historicoGestante = "sim";
			break;
		case 'N':
			historicoGestante = "nao";
			break;
		case 'T':
			historicoGestante = "nao tem certeza";
		}
		return historicoGestante;
	}
}
