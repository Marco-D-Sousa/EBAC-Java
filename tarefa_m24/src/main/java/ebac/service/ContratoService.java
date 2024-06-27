package ebac.service;

import ebac.dao.IContratoDAO;

public class ContratoService implements IContratoService{
	
	private IContratoDAO contratoDAO;
	
	public ContratoService(IContratoDAO dao) {
		this.contratoDAO = dao;
	}
	
	@Override
	public String salvar() {
		contratoDAO.salvar();
		return "";
	}
	
	@Override
	public String buscar() {
		return "Contrato buscado";
	}
	
	@Override
	public String excluir() {
		return "Contrato excluido";
	}
	
	@Override
	public String atualizar() {
		return "Contrato atualizado";
	}
}
