package upeu.edu.pe.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu.edu.pe.Dao.Operaciones;
import upeu.edu.pe.DaoImpl.ProductosDaoImpl;
import upeu.edu.pe.Entity.Productos;

@Service
public class ProductosService implements Operaciones<Productos>{
	
	@Autowired
	private ProductosService daoimpl;

	@Override
	public int create(Productos t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Productos t) {
		// TODO Auto-generated method stub
		return daoimpl.update(t);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return daoimpl.delete(id);
	}

	@Override
	public Productos read(int id) {
		// TODO Auto-generated method stub
		return daoimpl.read(id);
	}

	@Override
	public List<Productos> reAll() {
		// TODO Auto-generated method stub
		return  daoimpl.reAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}


}
