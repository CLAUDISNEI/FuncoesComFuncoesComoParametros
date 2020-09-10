package model.service;

import java.util.List;

import model.entities.Produto;

public class ServicoProduto {
	
	public double filtroSoma(List<Produto> list) {
		double soma = 0;
		for(Produto p: list) {
			if(p.getNome().charAt(0)=='T') {
				soma += p.getPreco();
			}
		}
		
		return soma;
	}
}
