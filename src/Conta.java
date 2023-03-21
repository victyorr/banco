import java.util.Calendar;
import java.util.Date;


// ORACLE JAVA 
// abstract na class proíbe instancia da classe ( nao da para criar no main uma conta, tem que criar conta corrente
public  abstract class Conta { // CLASSE MAE, SUPER CLASS

	protected Cliente cliente;
	protected long numeroConta;
	protected double saldo;
	protected Date dataAbertura = Calendar.getInstance().getTime();
	private static long contador; 


	public static void exibirContador(){
		System.out.println("Contas: " + contador);
		
		
	}
	
	public Conta(Cliente cliente, int numeroConta) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.dataAbertura =  new Date();
		contador++;
		
	}

	public void depositar(double valor) {
		if (valor > 0) {

			this.saldo = this.saldo + valor;
			System.out.println("Deposito de R$" + valor + " efetuado com sucesso");
		} else {
			System.out.println("Operacao n�o realizada");
		}

	}

	public boolean sacar(double valor) throws SaldoInsuficiente {

		if (this.saldo >= valor) {

			if (this.saldo >= valor) {
				this.saldo = this.saldo - valor;
				// this.Saldo -= valor; OUTRO METODO PARA O CALCULO

				System.out.println("Saque de " + valor + " efetuado com sucesso");
				return true;
			}

		} throw new SaldoInsuficiente("Saldo insuficiente");
	}

	public void transferir(Conta conta, double valor) throws SaldoInsuficiente {

		boolean teste = this.sacar(valor);
		if (teste == true) {
			conta.depositar(valor);
		}

	}

	public abstract void consultarSaldo();

		

	

}
