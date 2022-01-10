package aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Scanner;

@Aspect
public class SecurityAspect {
     @Pointcut("execution(* test.Application.start(..))")
     public void startAppPointCut(){}

     @Around("startAppPointCut()")
     public void autourStart(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
          Scanner scanner=new Scanner(System.in);
          System.out.println("Username: ");
          String username=scanner.nextLine();
          System.out.println("Password: ");
          String password=scanner.nextLine();
          if(username.equals("root") && password.equals("mohamed")){
               proceedingJoinPoint.proceed();
          }else System.out.println("Access Denied ...");

     }
}
