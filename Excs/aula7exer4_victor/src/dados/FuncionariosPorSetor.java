package dados;

import java.util.ArrayList;

public class FuncionariosPorSetor {
	private ArrayList<FuncionarioRegular> listaRegulares;
	private ArrayList<PrestadorServicos> listaPrestadores;
	private ArrayList<GerenteEquipe> listaGerentes;

	public FuncionariosPorSetor() {
		this.listaRegulares = new ArrayList<FuncionarioRegular>();
		this.listaPrestadores = new ArrayList<PrestadorServicos>();
		this.listaGerentes = new ArrayList<GerenteEquipe>();
	}
	
	public ArrayList<FuncionarioRegular> getListaRegulares() {
		return this.listaRegulares;
	}
	
	public void setRegulares(FuncionarioRegular funcionarioRegular) {
		this.listaRegulares.add(funcionarioRegular);
	}
	
	public ArrayList<PrestadorServicos> getListaPrestadores() {
		return this.listaPrestadores;
	}
	
	public void setPrestadores(PrestadorServicos prestadorServicos) {
		this.listaPrestadores.add(prestadorServicos);
	}
	
	public ArrayList<GerenteEquipe> getListaGerente() {
		return this.listaGerentes;
	}
	
	public void setGerentes(GerenteEquipe gerenteEquipe) {
		this.listaGerentes.add(gerenteEquipe);
	}
}
