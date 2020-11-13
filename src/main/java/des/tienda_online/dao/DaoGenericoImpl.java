package des.tienda_online.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public abstract class DaoGenericoImpl<T> implements DaoGenerico<T>{
	
	@PersistenceContext
	protected EntityManager em;
	
	private Class<T> type;
	
	public DaoGenericoImpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class) pt.getActualTypeArguments()[0];
	}

	@Override
	public T create(final T t) {
		this.em.persist(t);
		return t;
	}

	@Override
	public T update(final T t) {
		return this.em.merge(t);
	}
	
	@Override
	public T find(final Object id) {
		return (T)this.em.find(type, id);
	}

	@Override
	public void deleteById(final Object id) {
		this.em.remove(this.em.getReference(type, id));
	}



	

}
