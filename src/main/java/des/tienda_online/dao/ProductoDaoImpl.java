package des.tienda_online.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import des.tienda_online.entidades.Producto;

@Repository
@Component("ProductoDao")
public class ProductoDaoImpl extends DaoGenericoImpl<Producto> implements ProductoDao {
	
	@Override
	public List<Producto> listarProductos() {
		Query query = this.em.createQuery("FROM Producto");
		List<Producto> lProducto = query.getResultList();

		if (lProducto != null) {
			return lProducto;
		}
		return null;
	}

	

}
