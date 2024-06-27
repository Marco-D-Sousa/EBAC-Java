package ebac.service;

import ebac.dao.ClienteDAO;
import ebac.dao.IClienteDAO;

public class ClienteService {
	
	private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}
	
	public String salvar() {
		clienteDAO.salvar();
		return "Cliente salvo";
	}
	
	public String buscar() {
		clienteDAO.buscar();
		return "Cliente buscado";
	}
	
	public String excluir() {
		clienteDAO.excluir();
		return "Cliente excluido";
	}
	
	public String atualizar() {
		clienteDAO.atualizar();
		return "Cliente atualizado";
	}
}
