package dados;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Funcionario> todosFuncionarios;
	private ArrayList<Funcionario> grupoRegulares;
	private ArrayList<PrestadorDeServicos> grupoPrestadores;
	private ArrayList<GerenteDeEquipe> grupoGerentes;

	public Empresa() {
		this.todosFuncionarios = new ArrayList<Funcionario>();
		this.grupoRegulares = new ArrayList<Funcionario>();
		this.grupoPrestadores = new ArrayList<PrestadorDeServicos>();
		this.grupoGerentes = new ArrayList<GerenteDeEquipe>();
	}

	public ArrayList<Funcionario> getTodosFuncionarios() {
		return todosFuncionarios;
	}
	
	public ArrayList<Funcionario> getGrupoRegulares() {
		return grupoRegulares;
	}

	public ArrayList<PrestadorDeServicos> getGrupoPrestadores() {
		return grupoPrestadores;
	}
	
	public ArrayList<GerenteDeEquipe> getGrupoGerentes() {
		return grupoGerentes;
	}

	public void setTodosFuncionarios(Funcionario funcionario) {
		this.todosFuncionarios.add(funcionario);
	}
	
	public void setGrupoRegulares(Funcionario funcionario) {
		this.grupoRegulares.add(funcionario);
	}

	public void setGrupoPrestadores(PrestadorDeServicos prestadorDeServicos) {
		this.grupoPrestadores.add(prestadorDeServicos);
	}

	public void setGrupoGerentes(GerenteDeEquipe gerenteDeEquipe) {
		this.grupoGerentes.add(gerenteDeEquipe);
	}

}
