package exemplo.bdd;

import org.jbehave.scenario.annotations.Given;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;
import org.jbehave.scenario.steps.Steps;
import org.junit.Assert;

public class SaqueDeClienteComSaldoNegativo extends Steps {

	private Cliente cliente;

	private boolean saqueEfetuado = false;

	private Exception exception;

	@Given("um cliente com saldo atual de $saldoAtual reais")
	public void popularCliente(double saldoAtual) {
		cliente = new Cliente();
		cliente.setSaldoAtual(saldoAtual);
	}

	@When("solicitar um saque de $valorDoSaque reais")
	public void sacar(double valorDoSaque) {

		try {
			saqueEfetuado = cliente.sacar(valorDoSaque);
		} catch (Exception e) {
			this.exception = e;
		}
	}

	@Then("não deve efetuar o saque e retornar a mensagem $msg")
	public void verificaSaldo(String msg) {
		Assert.assertFalse(saqueEfetuado);
		Assert.assertEquals(msg, exception.getMessage());

	}
}



