package com.stanli.blogapp.model;

public enum Permission {
    POST_READ("post:read"),
    POST_WRITE("post:write"),
    COMMENT_READ("comment:read"),
    COMMENT_WRITE("comment:write"),
    LIKE_READ("like:read"),
    LIKE_WRITE("like:write"),
    USER_READ("user:read"),
    USER_WRITE("user:write");


    private String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
