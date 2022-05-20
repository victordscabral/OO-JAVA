package dados;

public class Baleia extends Mamifero {
	private Float peso;

	public Baleia(Integer idadeAmamentacao, Integer idadeVida, String descricaoEspecie, Float tamanho, Float peso) {
		super(idadeAmamentacao, idadeVida, descricaoEspecie, tamanho);
		setPeso(peso);
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public String toString() {
		return String.format("%-30s%-30s%-35s%-30s%-20s%-20s%-20s", getIdadeAmamentacao(), getIdadeVida(),
				getDescricaoEspecie(), +getTamanho(), "#", getPeso(), "#");
	}
}
