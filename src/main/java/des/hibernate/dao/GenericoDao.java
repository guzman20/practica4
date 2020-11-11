package des.hibernate.dao;

public interface GenericoDao<T> {
	
	int save(T objeto);
	int update(T objeto);
	int deleteById(Long id);

}
