package configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Aspect
public class LoggingAspect {

	private static final Logger l = LogManager.getLogger(LoggingAspect.class);

	@Before("execution(* tn.esprit.spring.service.*.*.*(..))")
	public void logMethodEntry(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		l.info("In method============================= " + name + " : ");
	}
	
	@After("execution(* tn.esprit.spring.service.*(..))")
	public void logMethodExit(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		l.info("In method============================= " + name + " : ");
	}
}
