package list.OperacoesBasicas.ToDo;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}

	public void adicionarConvidado(String nome, int codigoConvite){
		convidadoSet.add(new Convidado(nome,codigoConvite));
	}
	public void removerConvidadoPorCodigoConvite(int codigoConvite){
		Convidado convidadoParaRemover = null;
		for(Convidado c : convidadoSet){
			if(c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
		}
		convidadoSet.remove(convidadoParaRemover);
	}
	public int contarConvidados(){
		return convidadoSet.size();
	}
	public void exibirConvidados(){
		System.out.println(convidadoSet);
	}

	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");

		conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
		conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
		conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
		conjuntoConvidados.adicionarConvidado("Convidado 4", 1237);
		conjuntoConvidados.adicionarConvidado("Convidado 5", 1238);
		conjuntoConvidados.adicionarConvidado("Convidado 6", 1239);
		conjuntoConvidados.adicionarConvidado("Convidado 7", 1240);
		conjuntoConvidados.adicionarConvidado("Convidado 8", 1241);
		conjuntoConvidados.adicionarConvidado("Convidado 9", 1242);
		conjuntoConvidados.adicionarConvidado("Convidado 10", 1243);

		conjuntoConvidados.exibirConvidados();

		System.out.println("Existe(m) " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

		conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
		System.out.println("Existe(m) " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

		conjuntoConvidados.exibirConvidados();

	}
}
