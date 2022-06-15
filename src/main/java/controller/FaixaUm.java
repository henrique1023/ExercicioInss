package controller;

import model.Funcionario;

public class FaixaUm implements IContribuicao{

	public float totalInss(Funcionario f) {
		float desconto = 1.75f;
		float aux = 0;
		if(f.getSalario() <= 2427.35f && f.getSalario() > 1212.00f) {
			aux = f.getSalario() - 1212.00f; 
			aux = aux * 0.09f;
		}
		return (f.getSalario() * desconto) - aux ;
	}

	public void proximaContribuicao(Funcionario f) {
		f.setSalario(totalInss(f));
		
		FaixaDois faixaDdois = new FaixaDois();
		
		faixaDdois.proximaContribuicao(f);
	}

}
