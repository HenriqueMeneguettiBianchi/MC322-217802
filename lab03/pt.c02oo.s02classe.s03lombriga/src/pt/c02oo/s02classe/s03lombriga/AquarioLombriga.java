package pt.c02oo.s02classe.s03lombriga;

public class AquarioLombriga {
	private int tamanho;
	private int posicaoCabeca;
	private int tamanhoAquario;
	private String lado;
	
	public AquarioLombriga(int tamanho, int posicaoCabeca, int tamanhoAquario) {
		if(tamanho >= tamanhoAquario) {
			this.tamanho = tamanhoAquario;
		} else {
			this.tamanho = tamanho;
		}
		if(posicaoCabeca > tamanhoAquario || posicaoCabeca + tamanho > tamanhoAquario ) {
			this.posicaoCabeca = 1;	
		} else {
			this.posicaoCabeca = posicaoCabeca;
		}
		this.tamanhoAquario = tamanhoAquario;
		this.lado = "esquerda";
	}
	
	//Metodos
	public void crescer() {
		if(lado == "esquerda") {
			if(posicaoCabeca + tamanho <= tamanhoAquario) {
				tamanho += 1;
			}
		} else {
			if((tamanhoAquario - tamanho) - (tamanhoAquario - posicaoCabeca) >= 1) {
				tamanho += 1;
			}
		}
	}
	
	public void mover() {
		if(lado == "direita") { //Caso virado para a direita
			if(posicaoCabeca < tamanhoAquario) { //Apenas será movido para a direta se houver espaços vazios à direita
				posicaoCabeca += 1;
			} else {
				virar();
			}
		} else { //Caso virado para a esquerda
			if(posicaoCabeca > 1) { //Apenas será movido para a esquerda, se a cabeça não estiver no começo
				posicaoCabeca -= 1;
			} else {
				virar();
			}
		}
	}
	
	public void virar() {
		//if(posicaoCabeca > tamanho) {
			//
		//} else {
			//
		//}
			if(lado == "esquerda") {
				posicaoCabeca = posicaoCabeca + tamanho - 1;
				this.lado = "direita";
			} else {
				posicaoCabeca = (tamanhoAquario - tamanho) - (tamanhoAquario - posicaoCabeca) + 1;
				this.lado = "esquerda";
			}
	}
	
	public void apresenta() {
		String aquario = "";
		if(lado == "direita") {
			for(int i = 0; i < (tamanhoAquario - tamanho) - (tamanhoAquario - posicaoCabeca); i++) {
				aquario += '#';
			}
			for(int j = 0; j < tamanho - 1;j++) {
				aquario += '@';
			}
			aquario += 'O';
			for(int k = 0; k < (tamanhoAquario - posicaoCabeca); k++) {
				aquario += '#';
			}
		} else {
			for(int i = 0; i < posicaoCabeca - 1; i++) {
				aquario += '#';
			}
			aquario += 'O';
			for(int j = 0; j < tamanho - 1;j++) {
				aquario += '@';
			}
			for(int k = 0; k < tamanhoAquario - (posicaoCabeca + tamanho) + 1; k++) {
				aquario += '#';
			}
		}
		System.out.println("Tamanho da lombriga " + tamanho);
		System.out.println("Posição da cabeça" + posicaoCabeca);
		System.out.println("Tamanho do Aquario " + tamanhoAquario);
		System.out.println(aquario);
		System.out.println("--------------------------------");
		
	}
	//Getters and Setter
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	public void setPosicaoCabeca(int posicaoCabeca) {
		this.posicaoCabeca = posicaoCabeca;
	}
	
	public int getPosicaoCabeca() {
		return this.posicaoCabeca;
	}
	
	public void setTamanhoAquario(int tamanhoAquario) {
		this.tamanhoAquario = tamanho;
	}
	
	public int getTamanhoAquario() {
		return this.tamanhoAquario;
	}
}
