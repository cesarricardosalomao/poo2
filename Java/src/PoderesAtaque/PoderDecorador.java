package PoderesAtaque;

import TiposAtaque.Ataque;

public class PoderDecorador extends Ataque { 
	
	private Ataque danoDecorado;

	public PoderDecorador(Ataque danoDecorado) {
		this.danoDecorado = danoDecorado;
		
	}
	
	public int getDano() {
		return danoDecorado.getDano() + this.getDano();
	}
	
	public Ataque getDanoDecorado() {
		return danoDecorado;
	}

	public void setDanoDecorado(Ataque danoDecorado) {
		this.danoDecorado = danoDecorado;
	}

	@Override
	public void atacar() {
		
	}
	
}
