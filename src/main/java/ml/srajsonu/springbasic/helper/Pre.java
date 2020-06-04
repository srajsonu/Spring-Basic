package ml.srajsonu.springbasic.helper;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Aspect
@Component
public class Pre {

    @Before("execution(public void Hi())")
    public void before(JoinPoint joinPoint) {
        System.out.println("Logging......before");
        System.out.println(joinPoint.getSignature().getName());
    }
}
