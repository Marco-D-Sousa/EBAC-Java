import dao.ClienteJpaDAO;
import dao.ClienteJpaDB2DAO;
import dao.IClienteJpaDAO;
import domain.ClienteJpa;
import exceptions.DAOException;
import exceptions.MaisDeUmRegistroException;
import exceptions.TableException;
import exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.Random;

public class ClienteJpaDAO2DBTest {

	private IClienteJpaDAO<ClienteJpa> clienteDao;
	private IClienteJpaDAO<ClienteJpa> clienteDB2Dao;
	private Random rd;

	public ClienteJpaDAO2DBTest() {
		this.clienteDao = new ClienteJpaDAO();
		this.clienteDB2Dao = new ClienteJpaDB2DAO();
		rd = new Random();
	}

	private void excluir1(Collection<ClienteJpa> list) {

		list.forEach(cli -> {
			try {
				clienteDao.excluir(cli);
			} catch (DAOException e) {
				e.printStackTrace();
			}
		});
	}

	private void excluir2(Collection<ClienteJpa> list) {
		list.forEach(cli -> {
			try{
				clienteDB2Dao.excluir(cli);
			} catch (DAOException e) {
				e.printStackTrace();
			}
		});
	}

	@Test
	public void pesquisarCliente() throws TipoChaveNaoEncontradaException, DAOException, MaisDeUmRegistroException, TableException {
		ClienteJpa cliente = criarCliente();
		clienteDao.cadastrar(cliente);

		ClienteJpa clienteConsultado = clienteDao.consultar(cliente.getId());
		Assert.assertNotNull(clienteConsultado);

		cliente.setId(null);
		clienteDB2Dao.cadastrar(cliente);

		ClienteJpa clienteConsultado2 = clienteDB2Dao.consultar(cliente.getId());
		Assert.assertNotNull(clienteConsultado2);
	}

	private ClienteJpa criarCliente() {
		ClienteJpa cliente = new ClienteJpa();
		cliente.setCpf(rd.nextLong());
		cliente.setNome("Rodrigo");
		cliente.setCidade("São Paulo");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		return cliente;
	}
}
