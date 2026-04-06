package org.apache.oltu.oauth2.common.parameters;

import java.util.Map;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.OAuthMessage;
import org.apache.oltu.oauth2.common.utils.JSONUtils;

public class JSONBodyParametersApplier implements OAuthParametersApplier {
    public OAuthMessage a(OAuthMessage oAuthMessage, Map map) {
        try {
            oAuthMessage.a(JSONUtils.a(map));
            return oAuthMessage;
        } catch (Throwable th) {
            throw new OAuthSystemException(th);
        }
    }
}
