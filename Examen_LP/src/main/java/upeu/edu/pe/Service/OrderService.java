package upeu.edu.pe.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu.edu.pe.Entity.Order;
import upeu.edu.pe.Dao.Operaciones;
import upeu.edu.pe.DaoImpl.OrderDaoImpl;

@Service
public class OrderService implements Operaciones<Order> {

	@Autowired
	private OrderDaoImpl daoimpl;
	
	@Override
	public int create(Order t) {
		// TODO Auto-generated method stub
		return daoimpl.create(t);
	}

	@Override
	public int update(Order t) {
		// TODO Auto-generated method stub
		return daoimpl.update(t);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return daoimpl.delete(id);
	}

	@Override
	public Order read(int id) {
		// TODO Auto-generated method stub
		return daoimpl.read(id);
	}

	@Override
	public List<Order> reAll() {
		// TODO Auto-generated method stub
		return  daoimpl.reAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoimpl.readAll2();
	}

}
