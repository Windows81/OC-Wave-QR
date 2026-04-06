package org.apache.oltu.oauth2.common.parameters;

import java.util.Map;
import org.apache.oltu.oauth2.common.message.OAuthMessage;
import org.apache.oltu.oauth2.common.utils.OAuthUtils;

public class WWWAuthHeaderParametersApplier implements OAuthParametersApplier {
    public OAuthMessage a(OAuthMessage oAuthMessage, Map map) {
        oAuthMessage.b("WWW-Authenticate", OAuthUtils.e(map));
        return oAuthMessage;
    }
}
