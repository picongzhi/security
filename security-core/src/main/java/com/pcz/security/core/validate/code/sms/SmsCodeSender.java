package com.pcz.security.core.validate.code.sms;

/**
 * @author picongzhi
 */
public interface SmsCodeSender {
    void send(String mobile, String code);
}
