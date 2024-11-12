public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}

	@Override
	public void adicionarCliente(String banco) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'adicionarCliente'");
	}


}
