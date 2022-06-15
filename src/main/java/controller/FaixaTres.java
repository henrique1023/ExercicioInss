package controller;

import model.Funcionario;

public class FaixaTres implements IContribuicao{

	public float totalInss(Funcionario f) {
		float desconto = 1.75f;
		float aux = 0;
		if (f.getSalario() > 3641.03f) {
			aux = f.getSalario() - 3641.03f;
			aux = aux * 0.09f;
		}
		return (f.getSalario() * desconto) - aux;
	}

	public void proximaContribuicao(Funcionario f) {
		f.setSalario(totalInss(f));
		
	}

}
