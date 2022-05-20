package dados;

public class Mamifero extends Animais {
	private Integer idadeAmamentacao;
	private Integer idadeVida;
	private String descricaoEspecie;
	private Float tamanho;

	public Mamifero(Integer idadeAmamentacao, Integer idadeVida, String descricaoEspecie, Float tamanho) {
		setIdadeAmamentacao(idadeAmamentacao);
		setIdadeVida(idadeVida);
		setDescricaoEspecie(descricaoEspecie);
		setTamanho(tamanho);
	}
	public Float getTamanho() {
		return tamanho;
	}
	
	public Integer getIdadeAmamentacao() {
		return idadeAmamentacao;
	}
	
	public Integer getIdadeVida() {
		return idadeVida;
	}
	
	public String getDescricaoEspecie() {
		return descricaoEspecie;
	}
	
	public void setTamanho(Float tamanho) {
		this.tamanho = tamanho;
	}	
	
	public void setIdadeAmamentacao(Integer idadeAmamentacao) {
		this.idadeAmamentacao = idadeAmamentacao;
	}
	
	public void setIdadeVida(Integer idadeVida) {
		this.idadeVida = idadeVida;
	}
	
	public void setDescricaoEspecie(String descricaoEspecie) {
		this.descricaoEspecie = descricaoEspecie;
	}

}
