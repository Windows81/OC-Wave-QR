package org.apache.oltu.oauth2.client.request;

import java.util.Map;
import org.apache.oltu.oauth2.common.message.OAuthMessage;
import org.apache.oltu.oauth2.common.parameters.OAuthParametersApplier;
import org.apache.oltu.oauth2.common.utils.OAuthUtils;

public class ClientHeaderParametersApplier implements OAuthParametersApplier {
    public OAuthMessage a(OAuthMessage oAuthMessage, Map map) {
        oAuthMessage.b("Authorization", OAuthUtils.d(map));
        return oAuthMessage;
    }
}
