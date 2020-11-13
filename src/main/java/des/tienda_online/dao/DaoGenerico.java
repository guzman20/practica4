package des.tienda_online.dao;

public interface DaoGenerico<T> {
	
	T create(T objeto);
	T update(T objeto);
	T find(Object id);
	void deleteById(Object id);

}
