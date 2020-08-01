package com.pcz.security.core.validate.code;

import org.springframework.security.core.AuthenticationException;

/**
 * @author picongzhi
 */
public class ValidateCodeException extends AuthenticationException {
    private static final long serialVersionUID = 992008379317059415L;

    public ValidateCodeException(String msg) {
        super(msg);
    }
}
