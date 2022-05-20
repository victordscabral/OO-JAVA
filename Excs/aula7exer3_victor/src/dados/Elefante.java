package dados;

public class Elefante extends Mamifero {
	private Float peso;
	private String habitat;

	public Elefante(Integer idadeAmamentacao, Integer idadeVida, String descricaoEspecie, Float tamanho, Float peso,
			String habitat) {
		super(idadeAmamentacao, idadeVida, descricaoEspecie, tamanho);
		setPeso(peso);
		setHabitat(habitat);
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String toString() {
		return String.format("%-30s%-30s%-35s%-30s%-20s%-20s%-20s", getIdadeAmamentacao(), getIdadeVida(),
				getDescricaoEspecie(), getTamanho(), "#", getPeso(), getHabitat());
	}
}
