package com.capstone.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
//	@Before(value="execution(* com.stackroute.controller.UserController.adduser(..))")
//	public void beforeAddUser(JoinPoint joinPoint) {
//		logger.info("**********Logging for adduser method in the controller before advice***********");
//		logger.info(joinPoint.getSignature().getName());
//	}
//	
//	@After(value="execution(* com.stackroute.controller.UserController.adduser(..))")
//	public void afterAddUser(JoinPoint joinPoint) {
//		logger.info("**********Logging for adduser method in the controller after advice***********");
//		logger.info(joinPoint.getSignature().getName());
//		logger.info("user saved: " + Arrays.toString(joinPoint.getArgs()));
//	}
	
	@Pointcut("within(@org.springframework.stereotype.Repository *)" +
				" || within (@org.springframework.stereotype.Service *)" +
			"|| within(@org.springframework.web.bind.annotation.RestController *)")
	public void springBeanPointcut() {
		//keep the method empty
		//we only need the point cuts so we can add it in our advices
	}
	
	@Pointcut("within(com.capstone..*)" + 
				" || within(com.capstone.service..*)" +
			    "|| within(com.capstone.controller..*)")
	public void applicationPointcut() {
		//keep the method empty
		//we only need the point cuts so we can add it in our advices
	}
	
	@Around("springBeanPointcut() && applicationPointcut()")
	public Object logAroundEntireApplication(ProceedingJoinPoint joinPoint) throws Throwable {
		
		logger.info("Method name: " + joinPoint.getSignature().getDeclaringTypeName());
		logger.info("Method arguments:" +joinPoint.getArgs());
		logger.info("*************************************");
		
		//we use the object to store the output using the proceed() method
		Object result = joinPoint.proceed();
		
		logger.info("During: {}.{}() with arguments={}", joinPoint.getSignature().getDeclaringType(),
					joinPoint.getSignature().getName(),result);
		
		logger.info("*************************************");
		
		
		return result;
		
	}
	
	@AfterThrowing(pointcut="springBeanPointcut() && applicationPointcut()", throwing = "ex")
	public void afterExceptionOccured(JoinPoint joinPoint , Throwable ex) {
		logger.error("Exception message:" + ex.getMessage());
		logger.error("Exception in {}.{}() with cause = {}",joinPoint.getSignature().getDeclaringType(),
						joinPoint.getSignature().getName(),ex.getCause() !=null ? ex.getCause(): "null");
	}
	
	
	
	
	
	

}
