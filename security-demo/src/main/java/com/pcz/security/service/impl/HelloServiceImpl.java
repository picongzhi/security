package com.pcz.security.service.impl;

import com.pcz.security.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author picongzhi
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String greeting(String name) {
        return "hello " + name;
    }
}
