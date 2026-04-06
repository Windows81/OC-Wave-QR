package org.apache.oltu.oauth2.client.validator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.apache.oltu.oauth2.client.response.OAuthClientResponse;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.utils.OAuthUtils;

public abstract class OAuthClientValidator {

    /* renamed from: a  reason: collision with root package name */
    public Map f43520a;

    /* renamed from: b  reason: collision with root package name */
    public List f43521b;

    public void a(OAuthClientResponse oAuthClientResponse) {
        b(oAuthClientResponse);
        d(oAuthClientResponse);
    }

    public void b(OAuthClientResponse oAuthClientResponse) {
        String a2 = oAuthClientResponse.a("error");
        if (!OAuthUtils.l(a2)) {
            String a3 = oAuthClientResponse.a("error_description");
            String a4 = oAuthClientResponse.a("error_uri");
            throw OAuthProblemException.b(a2).a(a3).f(a4).d(oAuthClientResponse.b()).e(oAuthClientResponse.a("state"));
        }
    }

    public void c(OAuthClientResponse oAuthClientResponse) {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f43521b) {
            if (!OAuthUtils.l(oAuthClientResponse.a(str))) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw OAuthUtils.h(arrayList);
        }
    }

    public void d(OAuthClientResponse oAuthClientResponse) {
        e(oAuthClientResponse);
        c(oAuthClientResponse);
    }

    public void e(OAuthClientResponse oAuthClientResponse) {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : this.f43520a.entrySet()) {
            String str = (String) entry.getKey();
            if (OAuthUtils.l(oAuthClientResponse.a(str))) {
                hashSet.add(str);
            } else {
                String[] strArr = (String[]) entry.getValue();
                if (!OAuthUtils.j(strArr)) {
                    for (String str2 : strArr) {
                        if (OAuthUtils.l(oAuthClientResponse.a(str2))) {
                            hashSet.add(str2);
                        }
                    }
                }
            }
        }
        if (!hashSet.isEmpty()) {
            throw OAuthUtils.g(hashSet);
        }
    }
}
