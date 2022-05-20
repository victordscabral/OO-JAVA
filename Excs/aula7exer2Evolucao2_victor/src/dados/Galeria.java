package dados;

import java.util.ArrayList;

public class Galeria {
	private ArrayList<Pintor> listaPintores;
	private ArrayList<Quadro> listaQuadros;
	
	public Galeria () {
		this.listaPintores = new ArrayList<Pintor>();
		this.listaQuadros = new ArrayList<Quadro>();
	}

	public ArrayList<Pintor> getListaPintores () {
		return listaPintores;
	}

	public void setPintor (Pintor pintor) {
		this.listaPintores.add(pintor);
	}

	public ArrayList<Quadro> getListaQuadros () {
		return listaQuadros;
	}

	public void setQuadro (Quadro quadro) {
		this.listaQuadros.add(quadro);
	}
}
