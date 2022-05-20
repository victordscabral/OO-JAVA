package dados;

public class GrupoVendas {
	final int QTDVENDEDORES = 4;
	private Venda[][] grupoVendas;
	
	public GrupoVendas(int qtdSemanas) {
		grupoVendas = new Venda[QTDVENDEDORES][qtdSemanas];
	}
	
	public Venda[][] getGrupoVendas(int numVendedor, int numSemana) {
		return grupoVendas[numVendedor][numSemana];
	}
	
	public void setGrupoVendas(Venda venda, int numVendedor, int numSemana) {
		this.grupoVendas[numVendedor][numSemana] = venda;
	}

}