package com.pcz.security.core.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * @author picongzhi
 */
public interface ValidateCodeGenerator {
    ValidateCode generate(ServletWebRequest request);
}
