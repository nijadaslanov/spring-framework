package com.example.proxy;

import com.spring.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
