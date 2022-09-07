package com.example;

import com.example.service.CommentService;
import com.spring.model.Comment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyApplication {


    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");
        ApplicationContext context = SpringApplication.run(MyApplication.class, args);

        CommentService sc = context.getBean(CommentService.class);
        sc.publishComment(comment);
    }

}
