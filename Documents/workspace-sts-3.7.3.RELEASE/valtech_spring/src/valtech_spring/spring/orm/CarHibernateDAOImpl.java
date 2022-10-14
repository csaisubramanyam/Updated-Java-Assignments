package valtech_spring.spring.orm;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import valtechSpring.jdbc.CarDAO;
import valtech_spring.orm.Car;

public class CarHibernateDAOImpl extends HibernateDaoSupport implements CarDAO {

	@Override
	public void save(Car car) {
		getHibernateTemplate().save(car);
	}

	@Override
	public void update(Car car) {
		getHibernateTemplate().update(car);
	}

	@Override
	public void delete(Car car) {
		getHibernateTemplate().delete(car);
	}

	@Override
	public Car get(int id) {
		return getHibernateTemplate().load(Car.class,id);
	}

	@Override
	public List<Car> getAll() {
		
		return getHibernateTemplate().find("SELECT c from Car c");
	}

}
