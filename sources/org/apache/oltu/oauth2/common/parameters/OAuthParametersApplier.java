package org.apache.oltu.oauth2.common.parameters;

import java.util.Map;
import org.apache.oltu.oauth2.common.message.OAuthMessage;

public interface OAuthParametersApplier {
    OAuthMessage a(OAuthMessage oAuthMessage, Map map);
}
