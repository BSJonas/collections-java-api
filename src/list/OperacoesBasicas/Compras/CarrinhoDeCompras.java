package list.OperacoesBasicas.Compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> itens;

	public CarrinhoDeCompras() {
		this.itens = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade){
		for (Item i : itens) {
			if (i.getNome().equals(nome)) {
				i.setQuantidade(i.getQuantidade() + quantidade);
				return;
			}
		}
		itens.add(new Item(nome, preco, quantidade));
	}

//	public void removerItem(String nome){
//		List<Item> itemRemover = new ArrayList<>();
//		for(Item i : items){
//			if(i.getNome().equalsIgnoreCase(nome)){
//				itemRemover.add(i);
//			}
//		}
//		items.removeAll(itemRemover);
//	}

	public void removerItem(String nome){
		itens.removeIf(item -> item.getNome().equals(nome));
	}

	public double calcularValorTotal(){
		double total = 0.0;
		for (Item i : itens) {
			total += i.getPreco() * i.getQuantidade();
		}
		return total;
	}

	public void exibirItens(){
		if(itens.isEmpty()) {
			System.out.println("A lista está vazia!");
		}else {
			for (Item i : itens) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		CarrinhoDeCompras compras = new CarrinhoDeCompras();

		compras.adicionarItem("arroz", 5.50, 8);
		compras.adicionarItem("feijão", 6.80, 4);
		compras.adicionarItem("macarrão", 3.20, 5);
		compras.adicionarItem("bolacha", 6.20, 3);

		System.out.println("Compras: ");
		compras.exibirItens();
		System.out.println("O total de compras é de: " + compras.calcularValorTotal());

		compras.removerItem("bolacha");
		System.out.println("Compras após remover item: ");
		compras.exibirItens();
		System.out.println("O total de compras é de: " + compras.calcularValorTotal());

		compras.adicionarItem("biscoito", 2.20, 2);
		System.out.println("Compras após adicionar item: ");
		compras.exibirItens();
		System.out.println("O total de compras é de: " + compras.calcularValorTotal());

	}

}
