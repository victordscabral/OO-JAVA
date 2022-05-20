package dados;

public class Macaco extends Mamifero {
	private String porte;

	public Macaco(Integer idadeAmamentacao, Integer idadeVida, String descricaoEspecie, Float tamanho, String porte) {
		super(idadeAmamentacao, idadeVida, descricaoEspecie, tamanho);
		setPorte(porte);
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String toString() {
		return String.format("%-30s%-30s%-35s%-30s%-20s%-20s%-20s", getIdadeAmamentacao(), getIdadeVida(),
				getDescricaoEspecie(), getTamanho(), getPorte(), "#", "#");
	}
}
