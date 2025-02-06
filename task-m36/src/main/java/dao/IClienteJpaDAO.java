package dao;

import dao.generic.IGenericJpaDAO;
import domain.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJpaDAO<T, Long> {
}
