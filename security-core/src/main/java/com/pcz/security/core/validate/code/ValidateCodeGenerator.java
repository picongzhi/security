package com.pcz.security.core.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * @author picongzhi
 */
public interface ValidateCodeGenerator {
    ImageCode generate(ServletWebRequest request);
}
