package com.pcz.security.exception;

/**
 * @author picongzhi
 */
public class UserNotExistsException extends RuntimeException {
    private String id;

    public UserNotExistsException(String id) {
        super("user not exists");
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
