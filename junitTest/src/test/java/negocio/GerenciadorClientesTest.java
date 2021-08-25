package negocio;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadorClientesTest {
	
	@Test
	public void testPesquisaCliente() {
		
		// criando alguns clientes
		Cliente cliente01 = new Cliente(1, "Marcela", 28, "marcont@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(2, "Ed", 35, "edcomunica@gmail.com", 2, true);
		
		// inserindo os clientes criados na lista de clientes do banco
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
		Cliente cliente = gerClientes.pesquisaCliente(1);
		
		// Verificação por ID e email
		assertThat(cliente.getId(), is(1)); 
		assertThat(cliente.getEmail(), is("gugafarias@gmail.com"));
		
	}

}
