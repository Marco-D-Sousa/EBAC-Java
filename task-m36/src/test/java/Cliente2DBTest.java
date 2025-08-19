import dao.ClienteJpaDAO;
import dao.ClienteJpaDB2DAO;
import dao.IClienteJpaDAO;
import domain.ClienteJpa;
import exceptions.DAOException;
import exceptions.MaisDeUmRegistroException;
import exceptions.TableException;
import exceptions.TipoChaveNaoEncontradaException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class Cliente2DBTest {

    private static IClienteJpaDAO<ClienteJpa> clienteDao;

    private static IClienteJpaDAO<ClienteJpa> clienteDB2Dao;

    private Random rd;

    public void ClienteJpaDao2BancosTest() {
        this.clienteDao = new ClienteJpaDAO();
        this.clienteDB2Dao = new ClienteJpaDB2DAO();
        rd = new Random();
    }

    @AfterAll
    public static void end() throws DAOException {
        Collection<ClienteJpa> list1 = clienteDao.buscarTodos();
        excluir1(list1);

        Collection<ClienteJpa> list2 = clienteDB2Dao.buscarTodos();
        excluir2(list2);
    }

    private static void excluir1(Collection<ClienteJpa> list) {
        list.forEach(cli -> {
            try {
                clienteDao.excluir(cli);
            } catch (DAOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
    }

    private static void excluir2(Collection<ClienteJpa> list) {
        list.forEach(cli -> {
            try {
                clienteDB2Dao.excluir(cli);
            } catch (DAOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
    }

    @Test
    public void pesquisarCliente() throws TipoChaveNaoEncontradaException, DAOException, MaisDeUmRegistroException, TableException {
        ClienteJpa cliente = criarCliente();
        clienteDao.cadastrar(cliente);

        ClienteJpa clienteConsultado = clienteDao.consultar(cliente.getId());
        assertNotNull(clienteConsultado);

        cliente.setId(null);
        clienteDB2Dao.cadastrar(cliente);

        ClienteJpa clienteConsultado2 = clienteDB2Dao.consultar(cliente.getId());
        assertNotNull(clienteConsultado2);

    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TableException, DAOException {
        ClienteJpa cliente = criarCliente();
        ClienteJpa retorno = clienteDao.cadastrar(cliente);
        assertNotNull(retorno);

        ClienteJpa clienteConsultado = clienteDao.consultar(retorno.getId());
        assertNotNull(clienteConsultado);

        clienteDao.excluir(cliente);

        ClienteJpa clienteConsultado1 = clienteDao.consultar(retorno.getId());
        assertNull(clienteConsultado1);
    }

    @Test
    public void excluirCliente() throws TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TableException, DAOException {
        ClienteJpa cliente = criarCliente();
        ClienteJpa retorno = clienteDao.cadastrar(cliente);
        assertNotNull(retorno);

        ClienteJpa clienteConsultado = clienteDao.consultar(cliente.getId());
        assertNotNull(clienteConsultado);

        clienteDao.excluir(cliente);
        clienteConsultado = clienteDao.consultar(cliente.getId());
        assertNull(clienteConsultado);
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TableException, DAOException {
        ClienteJpa cliente = criarCliente();
        ClienteJpa retorno = clienteDao.cadastrar(cliente);
        assertNotNull(retorno);

        ClienteJpa clienteConsultado = clienteDao.consultar(cliente.getId());
        assertNotNull(clienteConsultado);

        clienteConsultado.setNome("Rodrigo Pires");
        clienteDao.alterar(clienteConsultado);

        ClienteJpa clienteAlterado = clienteDao.consultar(clienteConsultado.getId());
        assertNotNull(clienteAlterado);
        assertEquals("Rodrigo Pires", clienteAlterado.getNome());

        clienteDao.excluir(cliente);
        clienteConsultado = clienteDao.consultar(clienteAlterado.getId());
        assertNull(clienteConsultado);
    }

    @Test
    public void buscarTodos() throws TipoChaveNaoEncontradaException, DAOException {
        ClienteJpa cliente = criarCliente();
        ClienteJpa retorno = clienteDao.cadastrar(cliente);
        assertNotNull(retorno);

        ClienteJpa cliente1 = criarCliente();
        ClienteJpa retorno1 = clienteDao.cadastrar(cliente1);
        assertNotNull(retorno1);

        Collection<ClienteJpa> list = clienteDao.buscarTodos();
        assertTrue(list != null);
        assertTrue(list.size() == 2);

        list.forEach(cli -> {
            try {
                clienteDao.excluir(cli);
            } catch (DAOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });

        Collection<ClienteJpa> list1 = clienteDao.buscarTodos();
        assertTrue(list1 != null);
        assertTrue(list1.size() == 0);
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
