
public class ContaCorrente extends Conta { // subclass

	private double saldoInvestimento;

	public ContaCorrente(Cliente cliente, int numeroConta) {
		super(cliente, numeroConta); // o super herda de outra classe quando se coloca extends
	}

	/*public void investir(double valor, int tipo) {
		boolean teste = this.sacar(valor);

		if (teste == true) {
			switch (tipo) {
			case 1:
				saldoInvestimento += (valor * 1.01);
			case 2:
				saldoInvestimento += (valor * 1.05);
			default:
				saldoInvestimento += (valor * 1.1);
			}

		}

	} */

	@Override // anotation informa pro compilador que o metodo esta sendo reescrito
	public void consultarSaldo() {
		System.out.println("Cliente: " + this.cliente.getNome());
		System.out.println("Data de Nascimento: " + this.cliente.getDataNasc());
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Saldo Investimento: " + this.saldoInvestimento);
		System.out.println("Saldo Total: " + (this.saldo + this.saldoInvestimento));
		System.out.println("DATA DE ABERTURA: " + dataAbertura);

	}
	
	public void investimento(double valor, Produto produto) {
		boolean teste = this.sacar(valor);
		if(teste == true) {
			saldoInvestimento += produto.investir(valor);
		}
		
		
	}
	
	

}
