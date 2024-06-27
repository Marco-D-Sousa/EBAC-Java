package marco.cadastro;

import javax.swing.JOptionPane;

import marco.cadastro.dao.ClienteMapDAO;
import marco.cadastro.dao.IClienteDAO;
import marco.cadastro.domain.Cliente;

/**
 *
 * @author marco
 */
public class App {

    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(
                null,
                "Digite 1 para cadastro, 2 para consultar, 3 para excluit, 4 para alterar e 5 para sair.",
                "Opções", JOptionPane.INFORMATION_MESSAGE);

        while (!isValidOption(opcao)) {
            if ("".equals(opcao)) {
                exit();
            }
            opcao = JOptionPane.showInputDialog(
                    null,
                    "Opção inválida. \n Digite 1 para cadastro, 2 para consultar, 3 para excluit, 4 para alterar e 5 para sair.",
                    "Opções", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isValidOption(opcao)) {
            if ("5".equals(opcao)) {
                exit();
            } else if ("1".equals(opcao)) {
                String dados = JOptionPane.showInputDialog(
                        null,
                        "Digite os dados desejados em ordem e separados por virgula: Nome, CPF, Telefone, Endereço, Número, Cidade, Estado",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);

                cadastrar(dados);
            } else if ("2".equals(opcao)) {
                String cpf = JOptionPane.showInputDialog(
                        null,
                        "Digite o CPF desejado para a consulta.",
                        "Consulta", JOptionPane.INFORMATION_MESSAGE);

                consultar(cpf);
            }

            opcao = JOptionPane.showInputDialog(
                    null,
                    "Opção inválida. \n Digite 1 para cadastro, 2 para consultar, 3 para excluit, 4 para alterar e 5 para sair.",
                    "Opções", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isValidOption(String option) {
        return "1".equals(option) || "2".equals(option) || "3".equals(option) || "4".equals(option) || "5".equals(option);
    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        String nome = dadosSeparados[0];
        String cpf = dadosSeparados[1];
        String telefone = dadosSeparados[2];
        String endereco = dadosSeparados[3];
        String numero = dadosSeparados[4];
        String cidade = dadosSeparados[5];
        String estado = dadosSeparados[6];

        Cliente cliente = new Cliente(nome, endereco, cidade, estado, cpf, telefone, numero);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
    }

    private static void consultar(String cpf) {
        Cliente cliente = iClienteDAO.consultar(Long.valueOf(cpf));

        if (cliente != null) {
            JOptionPane.showMessageDialog(
                null, 
                "Cliente: " + cliente.toString(), 
                "Consulta", 
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(
                null, 
                "Cliente não encontrado", 
                "Consulta", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void exit() {
        JOptionPane.showInputDialog(
                null,
                "Até logo",
                "Sair", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
