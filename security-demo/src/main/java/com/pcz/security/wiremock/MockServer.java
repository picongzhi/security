package com.pcz.security.wiremock;

import com.github.tomakehurst.wiremock.client.WireMock;
import org.apache.commons.io.FileUtils;
import org.springframework.core.io.ClassPathResource;

/**
 * @author picongzhi
 */
public class MockServer {
//    public static void main(String[] args) throws Exception {
//        WireMock.configureFor(8000);
//        WireMock.removeAllMappings();
//
//        mock("/order/1", "01.txt");
//        mock("/order/2", "02.txt");
//    }

    private static void mock(String url, String filename) throws Exception {
        ClassPathResource classPathResource = new ClassPathResource("mock/response/" + filename);
        String content = FileUtils.readFileToString(classPathResource.getFile(), "UTF-8");

        WireMock.stubFor(WireMock.get(WireMock.urlPathEqualTo(url))
                .willReturn(WireMock.aResponse()
                        .withBody(content)
                        .withStatus(200)));
    }
}
