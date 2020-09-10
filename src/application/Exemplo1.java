package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Produto;
import model.service.ServicoProduto;

public class Exemplo1 {

	public static void main(String[] args) {
		
		List<Produto> list = new ArrayList<>();
		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Tablet", 350.50));
		list.add(new Produto("HD Case", 80.90));
		
		ServicoProduto sp = new ServicoProduto();
		
		//double soma = sp.filtroSoma(list, p -> p.getNome().charAt(0)=='M');
		
		double soma = sp.filtroSoma(list, p -> p.getPreco() < 100.00);
		
		System.out.println("Soma= R$ "+ String.format("%.2f",soma));

	}

}
