public class Main {
    public static void main(String[] args) throws Exception {
        
       
        
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Leandro");
        
		Conta cc = new ContaCorrente(cliente1);
		Conta poupanca = new ContaPoupanca(cliente1);

		cc.depositar(200);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
        
        Banco banco = new Banco();
        banco.setNome("Banco Claro");
    
         banco.adicionarCliente();
        
         System.out.println("Clientes do " + banco.getNome() + ":" + cliente1.getNome());
        for (Cliente cliente : banco.getClientes()) {
            System.out.println(cliente.getNome());
        }
    }
}
