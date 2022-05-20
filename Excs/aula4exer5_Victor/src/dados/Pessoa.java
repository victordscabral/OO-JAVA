package dados;

public class Pessoa {
	// Declaracoes
	private String nomeCompleto = new String();
	
	 // Metodo construtor
	public Pessoa(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	 }
	 
	 public String getNomeCompleto() {
		 return nomeCompleto;
	 }
}
