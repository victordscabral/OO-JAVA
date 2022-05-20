package dados;

import java.util.ArrayList;

public class GrupoEventos {
	private ArrayList<Evento> grupoEventos;
	
	public GrupoEventos() {
		grupoEventos = new ArrayList<Evento>();
	}
	
	public ArrayList<Evento> getGrupoEventos() {
		return this.grupoEventos;
	}
	
	public Evento getEvento(int i) {
		return grupoEventos.get(i);
	}
	
	public void setEvento(Evento evento) {
		this.grupoEventos.add(evento);
	}
}
