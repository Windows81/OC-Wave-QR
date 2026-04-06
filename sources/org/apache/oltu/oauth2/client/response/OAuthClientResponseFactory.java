package org.apache.oltu.oauth2.client.response;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import org.apache.oltu.oauth2.common.utils.OAuthUtils;

public class OAuthClientResponseFactory {
    public static OAuthClientResponse a(InputStream inputStream, String str, int i2, Map map, Class cls) {
        OAuthClientResponse oAuthClientResponse = (OAuthClientResponse) OAuthUtils.k(cls, (Class[]) null, (Object[]) null);
        if (inputStream == null) {
            inputStream = new ByteArrayInputStream(new byte[0]);
        }
        oAuthClientResponse.c(inputStream, str, i2, map);
        return oAuthClientResponse;
    }

    public static OAuthClientResponse b(String str, String str2, int i2, Map map, Class cls) {
        OAuthClientResponse oAuthClientResponse = (OAuthClientResponse) OAuthUtils.k(cls, (Class[]) null, (Object[]) null);
        oAuthClientResponse.e(str, str2, i2, map);
        return oAuthClientResponse;
    }
}
