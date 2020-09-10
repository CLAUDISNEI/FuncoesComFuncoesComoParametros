package model.service;

import java.util.List;
import java.util.function.Predicate;

import model.entities.Produto;

public class ServicoProduto {
	
	public double filtroSoma(List<Produto> list, Predicate<Produto> criterio) {
		double soma = 0;
		for(Produto p: list) {
			if(criterio.test(p)) {
				soma += p.getPreco();
			}
		}
		
		return soma;
	}
}
