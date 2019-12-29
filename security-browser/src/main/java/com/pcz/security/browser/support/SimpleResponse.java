package com.pcz.security.browser.support;

/**
 * @author picongzhi
 */
public class SimpleResponse {
    private Object content;

    public SimpleResponse() {
    }

    public SimpleResponse(Object content) {
        this.content = content;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
