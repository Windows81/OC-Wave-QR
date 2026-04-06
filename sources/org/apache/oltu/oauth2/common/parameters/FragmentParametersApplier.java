package org.apache.oltu.oauth2.common.parameters;

import java.util.Map;
import org.apache.oltu.oauth2.common.message.OAuthMessage;
import org.apache.oltu.oauth2.common.utils.OAuthUtils;

public class FragmentParametersApplier implements OAuthParametersApplier {
    public OAuthMessage a(OAuthMessage oAuthMessage, Map map) {
        String c2 = oAuthMessage.c();
        if (c2 != null) {
            StringBuilder sb = new StringBuilder(c2);
            if (map.containsKey("refresh_token")) {
                map.remove("refresh_token");
            }
            String f2 = OAuthUtils.f(map.entrySet(), "UTF-8");
            if (!OAuthUtils.l(f2) && map.size() > 0) {
                sb.append("#");
                sb.append(f2);
            }
            oAuthMessage.d(sb.toString());
        }
        return oAuthMessage;
    }
}
