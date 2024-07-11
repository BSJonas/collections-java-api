package list.OperacoesBasicas.OperacaoMatematica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

	private List<Integer> numeros;

	public OrdenacaoNumeros() { //construtor vazio
		this.numeros = new ArrayList<>(); //Iniciando um array vazio
	}

	public void adicionarNumero(int numero) {
		this.numeros.add(numero);
	}

	public int calcularSoma() {
		int soma = 0;
		for (int numero : this.numeros) {
			soma += numero;
		}
		return soma;
	}

	public int encontrarMaiorNumero() {
		if (this.numeros.isEmpty()) {
			System.out.println("A lista está vazia!");
		}
		return Collections.max(this.numeros);
	}

	public int encontrarMenorNumero() {
		if (this.numeros.isEmpty()) {
			System.out.println("A lista está vazia");
		}
		return Collections.min(this.numeros);
	}

	public List<Integer> exibirNumeros() {
		return new ArrayList<>(this.numeros);
	}

	public static void main(String[] args) {
		OrdenacaoNumeros ordenaNumeros = new OrdenacaoNumeros();

		ordenaNumeros.adicionarNumero(5);
		ordenaNumeros.adicionarNumero(3);
		ordenaNumeros.adicionarNumero(8);
		ordenaNumeros.adicionarNumero(1);

		System.out.println("Lista de números: " + ordenaNumeros.exibirNumeros());
		System.out.println("Soma dos números: " + ordenaNumeros.calcularSoma());
		System.out.println("Maior número: " + ordenaNumeros.encontrarMaiorNumero());
		System.out.println("Menor número: " + ordenaNumeros.encontrarMenorNumero());
	}

}

