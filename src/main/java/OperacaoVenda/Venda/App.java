package OperacaoVenda.Venda;

public class App 
{
    public static void main( String[] args )
    {
    	Pagamento pg = new Pagamento();
   	    pg.setMetodo( new Debito() );
   	    pg.processaValor(55);
   	    pg.setMetodo( new Credito() );
   	    pg.processaValor(77);

    }
}
