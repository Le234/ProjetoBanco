import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
	private List<Conta> contas;
	private List<Cliente> clientes;

	public Banco() {
		this.contas = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void adicionarCliente() {

		
	}

    



    
	
}
