import org.junit.jupiter.api.*;
import udemy.dao.ClienteDAO;
import udemy.dao.IClienteDAO;
import udemy.domain.Cliente;
import udemy.exceptions.DAOException;
import udemy.exceptions.MaisDeUmRegistroException;
import udemy.exceptions.TableException;
import udemy.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;


public class ClienteDAOTest {

    private static IClienteDAO clienteDao;

    public ClienteDAOTest() {
        clienteDao = new ClienteDAO();
    }

    @AfterAll
    public static void end() throws DAOException {
        Collection<Cliente> list = clienteDao.buscarTodos();
        list.forEach(cli -> {
            try {
                clienteDao.excluir(cli.getCpf());
            } catch (DAOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
    }

    @Test
    public void pesquisarCliente() throws MaisDeUmRegistroException, TableException, TipoChaveNaoEncontradaException, DAOException {
        Cliente cliente = new Cliente();
        cliente.setCpf(123123324234L);
        cliente.setNome("Rodrigo");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setTipo("FISICO");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
        clienteDao.cadastrar(cliente);

        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assertions.assertNotNull(clienteConsultado);

        //clienteDao.excluir(cliente.getCpf());
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TableException, DAOException {

        Cliente cliente = new Cliente();
        cliente.setCpf(56565656565L);
        cliente.setNome("Rodrigo");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setTipo("FISICO");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);

        Boolean retorno = clienteDao.cadastrar(cliente);
        Assertions.assertTrue(retorno);

        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assertions.assertNotNull(clienteConsultado);

        //clienteDao.excluir(cliente.getCpf());
    }

    @Test
    public void excluirCliente() throws TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TableException, DAOException {

        Cliente cliente = new Cliente();
        cliente.setCpf(199991991991L);
        cliente.setNome("Rodrigo");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setTipo("FISICO");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
        Boolean retorno = clienteDao.cadastrar(cliente);
        Assertions.assertTrue(retorno);

        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assertions.assertNotNull(clienteConsultado);

        clienteDao.excluir(cliente.getCpf());
        clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assertions.assertNull(clienteConsultado);
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TableException, DAOException {

        Cliente cliente = new Cliente();
        cliente.setCpf(12155656565L);
        cliente.setNome("Rodrigo");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setTipo("FISICO");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
        Boolean retorno = clienteDao.cadastrar(cliente);
        Assertions.assertTrue(retorno);

        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assertions.assertNotNull(clienteConsultado);

        clienteConsultado.setNome("Nome Alterado");
        clienteDao.alterar(clienteConsultado);

        Cliente clienteAlterado = clienteDao.consultar(clienteConsultado.getCpf());
        Assertions.assertNotNull(clienteAlterado);
        Assertions.assertEquals("Nome Alterado", clienteAlterado.getNome());
    }

    @Test
    public void buscarTodos() throws TipoChaveNaoEncontradaException, DAOException {

        Cliente cliente = new Cliente();
        cliente.setCpf(12332165401L);
        cliente.setNome("Fulano");
        cliente.setCidade("Rio de Janeiro");
        cliente.setEnd("End");
        cliente.setTipo("FISICO");
        cliente.setEstado("RJ");
        cliente.setNumero(10);
        cliente.setTel(988772221L);
        Boolean retorno = clienteDao.cadastrar(cliente);
        Assertions.assertTrue(retorno);

        Cliente cliente1 = new Cliente();
        cliente1.setCpf(11122233399L);
        cliente1.setNome("Xunda");
        cliente1.setCidade("São Paulo");
        cliente1.setEnd("End");
        cliente1.setTipo("JURIDICO");
        cliente1.setEstado("SP");
        cliente1.setNumero(10);
        cliente1.setTel(3278921L);
        Boolean retorno1 = clienteDao.cadastrar(cliente1);
        Assertions.assertTrue(retorno1);

        Collection<Cliente> list = clienteDao.buscarTodos();
        Assertions.assertNotNull(list);
        Assertions.assertEquals(5, list.size());
    }
}
