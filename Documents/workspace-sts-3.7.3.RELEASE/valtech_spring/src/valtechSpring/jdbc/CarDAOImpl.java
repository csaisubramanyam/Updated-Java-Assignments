package valtechSpring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import valtech_spring.orm.Car;
import valtech_spring.orm.CarDetails;

public class CarDAOImpl implements CarDAO {
	
	private DataSource datasource;
	
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}
	
	@Override
	public void save(Car car){
		JdbcTemplate temp = new JdbcTemplate(datasource);
		temp.queryForInt("Select max(id) from car");
		temp.update("insert into car(KMS,NUMOFOWNERS,VALIDINSURANCE,COLOR,MAKE,MODEL,PRICE,YEARMANUFACTURED,VERSION,ID)" +"values(?,?,?,?,?,?,?,?,?,?)"
				, car.getCardetails().getKms(),car.getCardetails().getNumOfOwners(),car.getCardetails().isValidInsurance()
				,car.getColor(),car.getMake(),car.getModel(),car.getPrice()
				,car.getYearManufactured(),car.getVersion(),car.getId());
	}
	
    @Override
	public void update(Car car){
    	JdbcTemplate temp = new JdbcTemplate(datasource);
		temp.queryForInt("Select max(id) from car");
		temp.update("update car set KMS=?,NUMOFOWNERS=?,VALIDINSURANCE=?,COLOR=?,MAKE=?,MODEL=?,PRICE=?,VERSION=? where id=?"
				,car.getCardetails().getKms(),car.getCardetails().getNumOfOwners(),car.getCardetails().isValidInsurance(),car.getColor(),
                car.getMake(),car.getModel(),car.getPrice(),car.getYearManufactured(),car.getVersion()+1);
	}
    
    @Override
	public void delete(Car car){
    	JdbcTemplate temp = new JdbcTemplate(datasource);
    	temp.update("delete from car where id = ?",car.getId());
	}
    
    private static class CarRowMapper implements RowMapper<Car> {

		@Override
		public Car mapRow(ResultSet rs, int row) throws SQLException {
//			KMS,NUMOFOWNERS,VALIDINSURANCE,COLOR,MAKE,MODEL,PRICE,YEARMANUFACTURED,VERSION,ID
			int kms = rs.getInt(1);
			int numOfOwners = rs.getInt(2);
			boolean validInsurance = rs.getBoolean(3);
			CarDetails cd = new CarDetails(kms,validInsurance,numOfOwners);
			String color = rs.getString(4);
			String make = rs.getString(5);
			String model = rs.getString(6);
			float price = rs.getFloat(7);
			int yearMfg = rs.getInt(8);
			int version = rs.getInt(9);
			int id = rs.getInt(10);
			Car car = new Car(id,make,model,yearMfg,price,color,cd);
			car.setVersion(version);
			return car;
		}
    }
    
    @Override
	public Car get(int id) {
    	JdbcTemplate temp = new JdbcTemplate(datasource);
    	return temp.queryForObject("Select KMS,NUMOFOWNERS,VALIDINSURANCE,COLOR,MAKE,MODEL,PRICE,YEARMANUFACTURED,VERSION,ID from car where id = ?", new CarRowMapper(),id);
    }
    
    @Override
	public List<Car> getAll() {
    	JdbcTemplate temp = new JdbcTemplate(datasource);
    	return temp.query("Select KMS,NUMOFOWNERS,VALIDINSURANCE,COLOR,MAKE,MODEL,PRICE,YEARMANUFACTURED,VERSION,ID from car", new CarRowMapper());
    }
}
