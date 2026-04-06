package org.apache.oltu.oauth2.common.parameters;

import java.util.Map;
import org.apache.oltu.oauth2.common.message.OAuthMessage;
import org.apache.oltu.oauth2.common.utils.OAuthUtils;

public class BodyURLEncodedParametersApplier implements OAuthParametersApplier {
    public OAuthMessage a(OAuthMessage oAuthMessage, Map map) {
        oAuthMessage.a(OAuthUtils.f(map.entrySet(), "UTF-8"));
        return oAuthMessage;
    }
}
