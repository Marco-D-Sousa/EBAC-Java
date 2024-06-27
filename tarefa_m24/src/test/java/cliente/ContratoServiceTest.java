package cliente;

import ebac.dao.ContratoDAO;
import ebac.dao.IContratoDAO;
import ebac.dao.mock.ContratoDAOMock;
import ebac.service.ContratoService;
import ebac.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {
	
	@Test
	public void salvarTest() {
		IContratoDAO dao = new ContratoDAOMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.salvar();
		Assert.assertEquals("", retorno);
	}
	
	@Test(expected = RuntimeException.class)
	public void erroAoSalvarNoDB() {
		IContratoDAO dao = new ContratoDAO();
		IContratoService service = new ContratoService(dao);
		String retorno = service.salvar();
	}
	
	@Test
	public void buscarTest() {
		IContratoDAO dao = new ContratoDAOMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.buscar();
		Assert.assertEquals("Contrato buscado", retorno);
	}
	
	@Test
	public void excluirTest() {
		IContratoDAO dao = new ContratoDAOMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.excluir();
		Assert.assertEquals("Contrato excluido", retorno);
	}
	
	@Test
	public void atualizarTest() {
		IContratoDAO dao = new ContratoDAOMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.atualizar();
		Assert.assertEquals("Contrato atualizado", retorno);
	}
}
