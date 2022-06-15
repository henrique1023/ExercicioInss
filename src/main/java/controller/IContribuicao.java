package controller;

import model.Funcionario;

public interface IContribuicao {
	
	public float totalInss(Funcionario f);
	
	public void proximaContribuicao(Funcionario f);
}
