package ml.srajsonu.springbasic.controllers;

import ml.srajsonu.springbasic.helper.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@Component
@RestController
public class NewController {

    @Autowired
    private Post post;

    public void test() {
        post.Hi();
        post.Bye();
        post.Hi_again();

    }
}
