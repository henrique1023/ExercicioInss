package controller;

import model.Funcionario;

public class FaixaDois implements IContribuicao {

	public float totalInss(Funcionario f) {
		float desconto = 1.75f;
		float aux = 0;
		if (f.getSalario() <= 3641.03f && f.getSalario() > 2427.35f) {
			aux = f.getSalario() - 2427.35f;
			aux = aux * 0.09f;
		}
		return (f.getSalario() * desconto) - aux;
	}

	public void proximaContribuicao(Funcionario f) {
		f.setSalario(totalInss(f));

		FaixaTres faixaTres = new FaixaTres();

		faixaTres.proximaContribuicao(f);
	}

}
