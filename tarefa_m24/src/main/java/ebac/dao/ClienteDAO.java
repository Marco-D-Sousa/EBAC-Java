package ebac.dao;

public class ClienteDAO implements IClienteDAO{
	
	@Override
	public String salvar() {
		throw new RuntimeException("Precisa de config de DB");
		//return "Success";
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
