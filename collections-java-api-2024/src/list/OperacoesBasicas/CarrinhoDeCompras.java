package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

/*
 * @author Tiago Santos
 * Date: 19/05/2024
 */

public class CarrinhoDeCompras {
	
	List<Item> listaItens = new ArrayList<Item>();
	
	public CarrinhoDeCompras() {
		
	}
	
	public void addItem(String nome,double preco, int quantidade) {
		listaItens.add(new Item(nome, preco, quantidade));
	}
	
	public void removeItem(String nome) {
		List<Item> listRemoveItem = new ArrayList<Item>();
		
			for(Item it : listRemoveItem) {
				if(it.getNome().equalsIgnoreCase(nome)) {
					listRemoveItem.add(it);
				}
			}
			listRemoveItem.removeAll(listRemoveItem);
		 
	}
	
	public double sumTotalValue() {
		double total = 0;
		for(Item it: listaItens) {
			total += it.getPreco() * (double)it.getQuant();
		}
		return total;
	}
	
	public void showItens() {
		if(!this.listaItens.isEmpty()) {
			System.out.println(this.listaItens);
		}
	}
	
	public static void main(String[] args) {
		List <CarrinhoDeCompras> totalLista = new ArrayList<CarrinhoDeCompras>();
		double valorTotalLista = 0;
		
		CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();
		carrinho1.addItem("Suco", 3.10, 3);
		totalLista.add(carrinho1);
		
		CarrinhoDeCompras carrinho2 = new CarrinhoDeCompras();
		carrinho2.addItem("Uva", 4.5, 2);
		totalLista.add(carrinho2);
		
		for(CarrinhoDeCompras cr: totalLista) {
			valorTotalLista+=cr.sumTotalValue();
		}
		System.out.println("O valor total do carrinho é : R$"+valorTotalLista);
		System.out.println("E possui : "+totalLista.size()+" itens");
		
		System.out.println("");
		System.out.println("Itens in my carrinho de compras:");
		//show the list itens using foreach
		for(CarrinhoDeCompras cr: totalLista) {
			cr.showItens();
		}
	}
}