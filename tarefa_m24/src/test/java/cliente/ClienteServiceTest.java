package cliente;

import ebac.dao.ClienteDAO;
import ebac.dao.mock.ClienteDAOMock;
import ebac.dao.IClienteDAO;
import ebac.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {
	
	@Test
	public void salvarTeste() {
		IClienteDAO mockDAO = new ClienteDAOMock();
		ClienteService service = new ClienteService(mockDAO);
		String retorno = service.salvar();
		Assert.assertEquals("Cliente salvo", retorno);
	}
	
//	@Test()
//	public void salvarTesteErro() {
//		IClienteDAO dao = new ClienteDAOMock();
//		ClienteService service = new ClienteService(dao);
//		String retorno = service.salvar();
//		Assert.assertEquals("Cliente salvo", retorno);
//	}
	
	@Test
	public void buscarTeste() {
		IClienteDAO dao = new ClienteDAOMock();
		ClienteService service = new ClienteService(dao);
		String retorno = service.buscar();
		Assert.assertEquals("Cliente buscado", retorno);
	}
	
	@Test
	public void excluirTeste() {
		IClienteDAO dao = new ClienteDAOMock();
		ClienteService service = new ClienteService(dao);
		String retorno = service.excluir();
		Assert.assertEquals("Cliente excluido", retorno);
	}

	@Test
	public void atualizarTeste() {
		IClienteDAO dao = new ClienteDAOMock();
		ClienteService service = new ClienteService(dao);
		String retorno = service.atualizar();
		Assert.assertEquals("Cliente atualizado", retorno);
	}
}
