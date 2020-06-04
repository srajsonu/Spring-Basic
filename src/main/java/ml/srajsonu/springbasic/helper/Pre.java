package ml.srajsonu.springbasic.helper;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Aspect
@Component
public class Helper {

    @Before("execution(public String mail())")
    public void logs() {
        System.out.println("Logging......");
    }
}
