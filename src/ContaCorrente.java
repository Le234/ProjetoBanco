public class ContaCorrente extends Conta {
   
    public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	     public void imprimirExtrato() {
		 System.out.println("=== Extrato Conta Corrente ===");
		 super.imprimirInfosComuns();
	}

	@Override
	public void adicionarCliente(String banco) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'adicionarCliente'");
	}   

}
