import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ebac.dao.ClienteDAO;
import ebac.dao.IClienteDAO;
import ebac.domain.Cliente;
import ebac.exceptions.DAOException;
import ebac.exceptions.MaisDeUmRegistroException;
import ebac.exceptions.TableException;
import ebac.exceptions.TipoChaveNaoEncontradaException;

public class CLienteDAOTest {

    private IClienteDAO clienteDAO;

    public CLienteDAOTest() {
        clienteDAO = new ClienteDAO();
    }

    // @AfterAll
    // public void end() throws DAOException {
    //     Collection<Cliente> list = clienteDAO.buscarTodos();
    //     list.forEach(cli -> {
    //         try {
    //             clienteDAO.excluir(cli.getCpf());
    //         } catch (DAOException e) {
    //             // TODO Auto-generated catch block
    //             e.printStackTrace();
    //         }
    //     });
    // }

    @Test
    public void pesquisarCliente()
            throws MaisDeUmRegistroException, TableException, TipoChaveNaoEncontradaException, DAOException {
        Cliente cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Rodrigo");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
        clienteDAO.cadastrar(cliente);

        Cliente clienteConsultado = clienteDAO.consultar(cliente.getCpf());
        Assertions.assertNotNull(clienteConsultado);

        clienteDAO.excluir(cliente.getCpf());
    }

    @Test
    public void salvarCliente()
            throws TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TableException, DAOException {
        Cliente cliente = new Cliente();
        cliente.setCpf(56565656565L);
        cliente.setNome("Rodrigo");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
        Boolean retorno = clienteDAO.cadastrar(cliente);
        Assertions.assertTrue(retorno);

        Cliente clienteConsultado = clienteDAO.consultar(cliente.getCpf());
        Assertions.assertNotNull(clienteConsultado);

        clienteDAO.excluir(cliente.getCpf());
    }

    @Test
    public void excluirCliente()
            throws TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TableException, DAOException {
        Cliente cliente = new Cliente();
        cliente.setCpf(56565656565L);
        cliente.setNome("Rodrigo");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
        Boolean retorno = clienteDAO.cadastrar(cliente);
        Assertions.assertTrue(retorno);

        Cliente clienteConsultado = clienteDAO.consultar(cliente.getCpf());
        Assertions.assertNotNull(clienteConsultado);

        clienteDAO.excluir(cliente.getCpf());
        clienteConsultado = clienteDAO.consultar(cliente.getCpf());
        Assertions.assertNull(clienteConsultado);
    }

    @Test
    public void alterarCliente()
            throws TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TableException, DAOException {
        Cliente cliente = new Cliente();
        cliente.setCpf(56565656565L);
        cliente.setNome("Rodrigo");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
        Boolean retorno = clienteDAO.cadastrar(cliente);
        Assertions.assertTrue(retorno);

        Cliente clienteConsultado = clienteDAO.consultar(cliente.getCpf());
        Assertions.assertNotNull(clienteConsultado);

        clienteConsultado.setNome("Rodrigo Pires");
        clienteDAO.alterar(clienteConsultado);

        Cliente clienteAlterado = clienteDAO.consultar(clienteConsultado.getCpf());
        Assertions.assertNotNull(clienteAlterado);
        Assertions.assertEquals("Rodrigo Pires", clienteAlterado.getNome());

        clienteDAO.excluir(cliente.getCpf());
        clienteConsultado = clienteDAO.consultar(cliente.getCpf());
        Assertions.assertNull(clienteConsultado);
    }

    @Test
    public void buscarTodos() throws TipoChaveNaoEncontradaException, DAOException {
        Cliente cliente = new Cliente();
        cliente.setCpf(56565656565L);
        cliente.setNome("Rodrigo");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
        Boolean retorno = clienteDAO.cadastrar(cliente);
        Assertions.assertTrue(retorno);

        Cliente cliente1 = new Cliente();
        cliente1.setCpf(56565656569L);
        cliente1.setNome("Rodrigo");
        cliente1.setCidade("São Paulo");
        cliente1.setEnd("End");
        cliente1.setEstado("SP");
        cliente1.setNumero(10);
        cliente1.setTel(1199999999L);
        Boolean retorno1 = clienteDAO.cadastrar(cliente1);
        Assertions.assertTrue(retorno1);

        Collection<Cliente> list = clienteDAO.buscarTodos();
        assertTrue(list != null);
        assertTrue(list.size() == 2);

        list.forEach(cli -> {
            try {
                clienteDAO.excluir(cli.getCpf());
            } catch (DAOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });

        Collection<Cliente> list1 = clienteDAO.buscarTodos();
        assertTrue(list1 != null);
        assertTrue(list1.size() == 0);
    }
}
