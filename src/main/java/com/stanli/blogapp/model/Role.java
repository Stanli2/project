package com.stanli.blogapp.model;

import com.google.common.collect.Sets;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

import static com.stanli.blogapp.model.Permission.*;

public enum Role {
    ADMIN(Sets.newHashSet(POST_READ, POST_WRITE, COMMENT_READ,COMMENT_WRITE, LIKE_READ, LIKE_WRITE, USER_READ, USER_WRITE)),
    PREMIUM(Sets.newHashSet(POST_READ, COMMENT_READ, LIKE_READ, LIKE_WRITE, COMMENT_WRITE, USER_READ));

    private Set<Permission> permissions;

    Role(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public Set<SimpleGrantedAuthority> getGrantedAuthorities() {
        Set<SimpleGrantedAuthority> authorities = getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());

        authorities.add(new SimpleGrantedAuthority("ROLE_"+ this.name()));

        return authorities;
    }
}
