package org.apache.oltu.oauth2.common.parameters;

import java.util.Map;
import org.apache.oltu.oauth2.common.message.OAuthMessage;
import org.apache.oltu.oauth2.common.utils.OAuthUtils;

public class QueryParameterApplier implements OAuthParametersApplier {
    public OAuthMessage a(OAuthMessage oAuthMessage, Map map) {
        String c2 = oAuthMessage.c();
        if (c2 != null) {
            boolean contains = c2.contains("?");
            StringBuffer stringBuffer = new StringBuffer(c2);
            StringBuffer stringBuffer2 = new StringBuffer(OAuthUtils.f(map.entrySet(), "UTF-8"));
            if (!OAuthUtils.l(stringBuffer2.toString())) {
                if (contains) {
                    stringBuffer.append("&");
                    stringBuffer.append(stringBuffer2);
                } else {
                    stringBuffer.append("?");
                    stringBuffer.append(stringBuffer2);
                }
            }
            oAuthMessage.d(stringBuffer.toString());
        }
        return oAuthMessage;
    }
}
