package br.edu.unidep.models;

import java.util.concurrent.ThreadLocalRandom;

public class Cliente extends Pessoa {
	public double credito;

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	@Override
	public int gerarId() {
		int min = 1;
		int max = 999;
		int randomid = ThreadLocalRandom.current().nextInt(min, max + 1);
		return setId(randomid);
	}

	@Override
	public String toString() {
		return "Cliente [credito=" + credito + ", id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", idade=" + idade
				+ "]";
	}

	
}
