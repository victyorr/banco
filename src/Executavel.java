
public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cliente clienteVictor = new Cliente("Victor","FIAP","14/11/2003");
		Cliente clienteHaoni = new Cliente("Haoni", "FIAP","24/05/2004");
		ContaCorrente contaVictor = new ContaCorrente(clienteVictor, 50);
		ContaCorrente contaHaoni = new ContaCorrente(clienteHaoni,123);
		
		
		
		contaVictor.depositar(10000);
		contaHaoni.depositar(1000);
		
		contaVictor.investir(1100, 2);
		contaVictor.consultarSaldo();
		
		
		contaVictor.exibirContador();
		
		
	}

}
