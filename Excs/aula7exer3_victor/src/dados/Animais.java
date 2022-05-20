package dados;

import java.util.ArrayList;

public class Animais {
	private ArrayList<Mamifero> animais;
	
	public Animais() {
		animais = new ArrayList<Mamifero>();
	}
	
	public ArrayList<Mamifero> getAnimais() {
		return this.animais;
	}
	
	public void setAnimais(Mamifero mamifero) {
		this.animais.add(mamifero);
	}
}
