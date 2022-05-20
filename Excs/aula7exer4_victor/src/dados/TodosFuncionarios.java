package dados;

import java.util.ArrayList;

public class TodosFuncionarios {
	private ArrayList<Pessoa> funcionarios;
	
	public TodosFuncionarios() {
		funcionarios = new ArrayList<Pessoa>();
	}
	
	public ArrayList<Pessoa> getFuncionarios() {
		return this.funcionarios;
	}
	
	public void setFuncionarios(Pessoa pessoa) {
		this.funcionarios.add(pessoa);
	}
}
