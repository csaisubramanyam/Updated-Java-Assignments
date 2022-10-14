package valtech_spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import valtechSpring.aop.Arithmetic;
import valtechSpring.aop.SimpleInterest;



public class AopClient {
	
	public static void main(String[] args) {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("aop.xml");
		SimpleInterest si = (SimpleInterest) appCtx.getBean("si");
		System.out.println("Simple Interest = "+si.computeSimpleInterest(2000, 3, 2));
		Arithmetic arithmetic = (Arithmetic) appCtx.getBean("arithmetic");
		System.out.println("Arithmetic.class"+arithmetic.getClass().getName());
		arithmetic.add(2,3);
		arithmetic.add(5,3);
		arithmetic.sub(8,5);
		arithmetic.mul(2,3);
		arithmetic.mul(2,4);
		arithmetic.div(4,2);
		System.out.println("-2+-4 = " +arithmetic.add(-2,-4));
	}
}
