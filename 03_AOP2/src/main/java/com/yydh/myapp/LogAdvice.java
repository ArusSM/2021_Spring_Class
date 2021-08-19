package com.yydh.myapp;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LogAdvice {
	// <aop:pointcut expression="execution(* com.yydh.myapp..*Impl.*(..))"
	// id="allPointCut"/>
	@Pointcut("execution(* com.yydh.myapp..*Impl.*(..))")
	public void allPointCut() {
	}
	
	@Pointcut("execution(* com.yydh.myapp..*Impl.insertBoard(..))")
	public void insertPointCut() {
	}

	/*
	 * <aop:aspect ref="log"> 
	 * <aop:before method="printLog" pointcut-ref="allPointCut"/> 
	 * </aop:aspect>
	 */

	@Before("allPointCut()")
	public void printLog() {
		System.out.println("[로그] 비즈니스 수행 로직 전 동작!");
	}
	
	@Around("insertPointCut()")
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("[로깅 전] 비즈니스 로직 수행 전 동작힙니다.");
		
		Object obj = pjp.proceed();
		
		System.out.println("[로깅 후] 비즈니스 로직 수행 후 동작힙니다.");
		
		return obj;
	}
	
}
