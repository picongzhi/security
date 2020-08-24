package com.pcz.security.code;

import com.pcz.security.core.validate.code.image.ImageCode;
import com.pcz.security.core.validate.code.ValidateCodeGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.context.request.ServletWebRequest;

@Slf4j
//@Component("imageCodeGenerator")
public class DemoImageCodeGenerator implements ValidateCodeGenerator {
    @Override
    public ImageCode generate(ServletWebRequest request) {
        log.info("自定义图形验证码生成器");
        return null;
    }
}
