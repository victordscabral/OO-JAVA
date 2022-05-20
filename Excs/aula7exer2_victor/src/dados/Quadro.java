package dados;

public class Quadro {
	private Integer codigoQuadro;
	private String nomePintor;
	private Float precoQuadro;
	private Integer anoAquisicaoQuadro;
	
	public Quadro(String nomePintor, Integer codigoQuadro, Float precoQuadro, Integer anoAquisicaoQuadro) {
		setNomePintor(nomePintor);
		setCodigoQuadro(codigoQuadro);
		setPrecoQuadro(precoQuadro);
		setAnoAquisicaoQuadro(anoAquisicaoQuadro);
	}
	
	// Setters
	public void setNomePintor(String nomePintor) {
		this.nomePintor = nomePintor;
	}
	
	public void setCodigoQuadro(Integer codigoQuadro) {
		this.codigoQuadro = codigoQuadro;
	}
	
	public void setPrecoQuadro(Float precoQuadro) {
		this.precoQuadro = precoQuadro;
	}
	
	public void setAnoAquisicaoQuadro(Integer anoAquisicaoQuadro) {
		this.anoAquisicaoQuadro = anoAquisicaoQuadro;
	}
	
	// Getters
	public String getNomePintor() {
		return nomePintor;
	}
	
	public Integer getCodigoQuadro() {
		return codigoQuadro;
	}
	
	public Float getPrecoQuadro() {
		return precoQuadro;
	}
	
	public Integer getAnoAquisicaoQuadro() {
		return anoAquisicaoQuadro;
	}
}
