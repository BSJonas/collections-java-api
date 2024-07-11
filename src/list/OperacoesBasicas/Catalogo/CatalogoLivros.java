package list.OperacoesBasicas.Catalogo;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	private List<Livro> livrosList;

	public CatalogoLivros() {
		this.livrosList = new ArrayList<>();
	}

	public List<Livro> getLivrosList() {
		return livrosList;
	}

	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livrosList.add(new Livro(titulo, autor, anoPublicacao));
	}

	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
		if (livrosList.isEmpty()) {
			System.out.println("Lista está vazia");
		} else {
			for (Livro l : livrosList) {
				if(l.getAutor().equalsIgnoreCase(autor)){
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}

	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosIntervaloAnos = new ArrayList<>();
		if (livrosList.isEmpty()){
			System.out.println("Lista vazia");
		}else {
			for (Livro l : livrosList) {
				if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosIntervaloAnos.add(l);
				}
			}
		}
		return livrosIntervaloAnos;
	}

	public Livro pesquisarPorTitulo(String titulo){
		Livro livroPorTitulo = null;
		if (livrosList.isEmpty()){
			System.out.println("A lista está vazia");
		}else{
			for (Livro l : livrosList){
				if(l.getTitulo().equalsIgnoreCase(titulo)){
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}

	public static void main(String[] args) {
		CatalogoLivros catalogo = new CatalogoLivros();

		catalogo.adicionarLivro("Heróis da Fé","Al Truesdale",2021);
		catalogo.adicionarLivro("A História da Vida","Michelson Borges",2021);
		catalogo.adicionarLivro("Um coração igual ao de Jesus","Max Lucado",2012);
		catalogo.adicionarLivro("Em defesa de Cristo","Lee Strobel",2019);
		catalogo.adicionarLivro("O Deus que destrói sonhos","Rodrigo Bibo",2021);
		catalogo.adicionarLivro("Heróis da Fé","Al Truesdale",2021);

		System.out.println("Pesquisa por autor:");
		System.out.println(catalogo.pesquisarPorAutor("Al Truesdale"));

		System.out.println("Pesquisa por intervalo de publicação");
		System.out.println(catalogo.pesquisarPorIntervaloAnos(2017, 2020));

		System.out.println("Pesquisa por título");
		System.out.println(catalogo.pesquisarPorTitulo("Heróis da fé"));

		System.out.println(catalogo.getLivrosList());

	}

}

