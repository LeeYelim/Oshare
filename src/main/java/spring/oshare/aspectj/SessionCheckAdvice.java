package spring.oshare.aspectj;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SessionCheckAdvice { 
	
	/* @Around("execution(public * spring.oshare.controller.*.*(..))")
	 public Object around(ProceedingJoinPoint point )throws Throwable{
		 //���������� üũ�Ѵ�!!
		 Object methodParams [] = point.getArgs();
		 HttpServletRequest request =
				  (HttpServletRequest)methodParams[0];
		 
		 HttpSession session = request.getSession();
		 
		 if(session.getAttribute("loginUser")==null){
			 //�����߻�!!!
			 request.setAttribute("errorMsg", "�α����ϰ� ������!!!");
			 throw new Exception();
		 }
		 
		Object obj = point.proceed();//����Ÿ�ϴ���� ȣ��
		
		return obj;
		 
	 }*/
}






