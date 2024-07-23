package contador;

public class Contador {
	
	public int numero;
	
	Contador() {
		this.numero = 0;
	}
	/* Dois construtores para poder especificar, caso queira, o número*/
	Contador(int numero) {
		this.numero = numero;
	}
	
	public void incrementa() {
		this.numero += 1;
	}
	
	public void decrementa() {
		if(ehPositivo()) {
			this.numero -= 1;
		}
	}
	
	private boolean ehPositivo(){
		if(this.numero > 0) {
			return true;
		} else {
			return false;
		}
	}
	
}
