import java.text.ParseException;

public class Executavel {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		
		Cliente clienteVictor = new Cliente("Victor","FIAP","14/11/2003");
		Cliente clienteHaoni = new Cliente("Haoni", "FIAP","24/05/2004");
		ContaCorrente contaVictor = new ContaCorrente(clienteVictor, 50);
		ContaCorrente contaHaoni = new ContaCorrente(clienteHaoni,123);
		
		CDB cdb = new CDB();
		LCI lci = new LCI();
		LCA lca = new LCA();
		Funds funds = new Funds();
		
		contaVictor.depositar(10000);
		contaHaoni.depositar(1000);
		
		try {
			contaVictor.sacar(100011);
		} catch (SaldoInsuficiente e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			contaVictor.investimento(1000, cdb);
		} catch (SaldoInsuficiente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			contaVictor.resgatar(500);
		} catch (SaldoInsuficiente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		contaVictor.consultarSaldo();
		
		
		contaVictor.exibirContador();
		
		
	}

}
