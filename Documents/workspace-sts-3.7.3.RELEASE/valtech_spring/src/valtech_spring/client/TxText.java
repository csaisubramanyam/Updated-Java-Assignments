package valtech_spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import valtech_spring.tx.CarService;

public class TxText {
	
	public static void main(String[] args) {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("hibernate3.xml");
		CarService carService = (CarService) appCtx.getBean("carService");
		carService.updatePrice(1, 254640);
	}
}
