package ml.srajsonu.springbasic.helper;

import org.springframework.stereotype.Component;

@Component
public class Post {

    public void Hi() {
        System.out.println("Hello World!.......");
    }
    public void Bye() {
        System.out.println("Bye............");
    }

    public String Hi_again() {
        return "Hi.....again......";
    }
}
