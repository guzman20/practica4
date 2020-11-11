package des.hibernate.dao;

import java.util.List;

import des.hibernate.entidades.Producto;



public interface ProductoDao extends GenericoDao<Producto> {
	
	int save(Producto producto);
	int update(Producto producto);
	int deleteById(Long id);
	List<Producto> findAll(int numero);

}
