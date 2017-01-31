package exemplo.bdd;

public class Cliente {

	private double saldoAtual;

	private boolean saqueEfetuado;

	public boolean sacar(double valorDoSaque) {
		if (saldoAtual < valorDoSaque) {
			throw new RuntimeException("Saldo Insuficiente");
		}
		return true;
	}

	public double getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	public boolean isSaqueEfetuado() {
		return saqueEfetuado;
	}

	public void setSaqueEfetuado(boolean saqueEfetuado) {
		this.saqueEfetuado = saqueEfetuado;
	}

}


