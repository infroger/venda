package OperacaoVenda.Venda;

public class Pagamento implements IMetodo {

	private IMetodo metodo;

	public void setMetodo(IMetodo m) {
	    metodo = m;
	  }
	
	public void processaValor(float valor) {
		metodo.processaValor(valor);
	}
	

	
}
