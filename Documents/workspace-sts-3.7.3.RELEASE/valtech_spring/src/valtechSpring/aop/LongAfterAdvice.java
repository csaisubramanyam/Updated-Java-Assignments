package valtechSpring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LongAfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object retValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Existing"+method.getName()+"Without Any Exceptions");
		
	}
	
	
}
