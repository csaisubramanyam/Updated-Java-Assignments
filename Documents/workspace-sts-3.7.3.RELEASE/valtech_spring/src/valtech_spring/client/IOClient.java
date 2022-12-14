package valtech_spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import valtechSpring.ioc.Point;

public class IOClient {
	
	public static void main(String[] args) {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("ioc.xml");
		Point p = (Point) appCtx.getBean("p");
		Point p1 = (Point) appCtx.getBean("p1");
		//System.out.println(p);
		//System.out.println(p == p1);
		System.out.println(appCtx.getBean("line"));
		//System.out.println(appCtx.getBean("line1"));
		//System.out.println(appCtx.getBean("pointFromFactory"));
		//System.out.println(appCtx.getBean("cp"));
		//System.out.println(appCtx.getBean("callMe"));
		
		
		ApplicationContext childAppCtx = new ClassPathXmlApplicationContext(new String[]{"childIOC.xml"},appCtx);
		System.out.println(childAppCtx.getBean("line"));
	}
}
