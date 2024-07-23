package contador;

public class Main {

	public static void main(String[] args) {
		
		Contador contador = new Contador();
		contador.incrementa();
		contador.decrementa();
		contador.incrementa();
		System.out.println(contador.numero);
		
	}

}
