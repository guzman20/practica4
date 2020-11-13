package des.tienda_online.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import des.tienda_online.entidades.Producto;

@Repository
@Component("ProductoDao")
public class ProductoDaoImpl extends DaoGenericoImpl<Producto> implements ProductoDao {

}
