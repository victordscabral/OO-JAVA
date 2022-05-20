/** Síntese
 * Conteúdo: nome da cidade, ddd
 * - getNome(),getDdd(),setNome(String),setDdd(int)
 * - toString(), compareTo(Object)
 */
package dados;

public class Cidade implements Comparable<Cidade> {
	// DECLARACOES
	private String nome;
	private Integer ddd;

	// CONSTRUTOR
	public Cidade(String nome, int ddd) {
		setNome(nome);
		setDDD(ddd);
	}

	// ASSESSORES
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getDDD() {
		return ddd;
	}

	public void setDDD(int ddd) {
		this.ddd = ddd;
	}

	public boolean equals(Object obj) {
		Cidade outro = (Cidade) obj;
		if (this.getNome().equalsIgnoreCase(outro.getNome()) && this.getDDD().equals(outro.getDDD())) {
			return true;
		}
		return false;
	}

	public String toString() {
		return ("" + this.getDDD() + "\t" + this.getNome());
	}

	public int compareTo(Cidade objeto) {
		if (this.getDDD() > objeto.getDDD())
			return 1;
		else if (getDDD() < objeto.getDDD())
			return -1;
		else
			return 0;
	}
}