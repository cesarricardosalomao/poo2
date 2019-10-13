package TiposAtaque;

public abstract class Ataque {

	private int dano = 0;
	
	public abstract void atacar();

	public  int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}
	
}
