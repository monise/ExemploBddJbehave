package exemplo.bdd;

import org.jbehave.scenario.Scenario;

public class CaixaEletronicoTest extends Scenario {

	public CaixaEletronicoTest() {
		addSteps(new SaqueDeClienteComSaldoNegativo());
	}

}


