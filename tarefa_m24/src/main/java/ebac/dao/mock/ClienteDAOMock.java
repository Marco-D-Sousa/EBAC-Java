package ebac.dao.mock;

import ebac.dao.IClienteDAO;

public class ClienteDAOMock implements IClienteDAO {
	
	@Override
	public String salvar() {
		return "Success";
	}
	
	@Override
	public String buscar() {
		return "Cliente buscado";
	}
	
	@Override
	public String excluir() {
		return "Cliente excluido";
	}
	
	@Override
	public String atualizar() {
		return "Cliente atualizado";
	}
}
