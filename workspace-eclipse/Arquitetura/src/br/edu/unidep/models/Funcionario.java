package br.edu.unidep.models;

import java.util.concurrent.ThreadLocalRandom;


public class Funcionario extends Pessoa{
	public double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
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
		return "Funcionario [salario=" + salario + ", id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", idade=" + idade
				+ "]";
	}


}
