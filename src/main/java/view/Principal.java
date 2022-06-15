package view;

import controller.FaixaUm;
import controller.IContribuicao;
import model.Funcionario;

public class Principal {
	public static void main(String[] args) {
		Funcionario fu = new Funcionario();
		fu.setId(12);
		fu.setNome("João");
		fu.setSalario(1500f);
		
		IContribuicao co = new FaixaUm();
		
		co.proximaContribuicao(fu);
		System.out.println(fu);
	}
}
