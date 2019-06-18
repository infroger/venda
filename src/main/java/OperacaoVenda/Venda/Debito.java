package OperacaoVenda.Venda;

public class Debito implements IMetodo {

	public void processaValor(float valor) {
		System.out.println("Processando " +valor +" reais no DÉBITO");
	}

}
