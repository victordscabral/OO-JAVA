package dados;

public class Evento {
	// Declaracoes
	private Integer ano;
	private String presidente;
	private String evento;

	// Metodo construtor
	public Evento(int ano, String presidente, String evento) {
		setAno(ano);
		setPresidente(presidente);
		setEvento(evento);
	}

	// Getters e Setters
	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public Integer getAno() {
		return ano;
	}

	public String getPresidente() {
		return presidente;
	}

	public String getEvento() {
		return evento;
	}
	
	public String toString() {
		return (this.getAno() + "\t" + this.getPresidente() + "\t\t" + this.getEvento());
	}
	
}
