package pt.c02oo.s02classe.s03lombriga;

public class Animacao {
	private String animacao;
	
	public Animacao(String anima) {
		this.animacao = anima;
	}
	
	public void apresenta(AquarioLombriga lomb) {
		lomb.apresenta();
	}
	
	public void passo(AquarioLombriga lomb, char passo) {
		if(passo == 'M') {
			lomb.mover();
		}
		if(passo == 'C') {
			lomb.crescer();
		}
		if(passo == 'V') {
			lomb.virar();
		}
	}
}
