package com.hansecom.mapi.auth;

import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.request.OAuthBearerClientRequest;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.token.BasicOAuthToken;

@Metadata
public final class OAuth implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public OAuthClientRequest.TokenRequestBuilder f39108a;

    /* renamed from: b  reason: collision with root package name */
    public OAuthClient f39109b;

    /* renamed from: c  reason: collision with root package name */
    public volatile String f39110c;

    /* renamed from: d  reason: collision with root package name */
    public AccessTokenListener f39111d;

    @Metadata
    public interface AccessTokenListener {
        void a(BasicOAuthToken basicOAuthToken);
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f39112a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.hansecom.mapi.auth.OAuthFlow[] r0 = com.hansecom.mapi.auth.OAuthFlow.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.hansecom.mapi.auth.OAuthFlow r1 = com.hansecom.mapi.auth.OAuthFlow.accessCode     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.hansecom.mapi.auth.OAuthFlow r1 = com.hansecom.mapi.auth.OAuthFlow.implicit     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.hansecom.mapi.auth.OAuthFlow r1 = com.hansecom.mapi.auth.OAuthFlow.password     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.hansecom.mapi.auth.OAuthFlow r1 = com.hansecom.mapi.auth.OAuthFlow.application     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f39112a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.auth.OAuth.WhenMappings.<clinit>():void");
        }
    }

    public final Response a(Interceptor.Chain chain, boolean z2) {
        Request m2 = chain.m();
        if (m2.d("Authorization") != null) {
            return chain.b(m2);
        }
        if (this.f39110c == null) {
            b((String) null);
        }
        if (this.f39110c == null) {
            return chain.b(chain.m());
        }
        Request.Builder i2 = m2.i();
        String str = this.f39110c;
        try {
            OAuthClientRequest b2 = new OAuthBearerClientRequest(m2.k().toString()).c(str).b();
            Intrinsics.h(b2, "buildHeaderMessage(...)");
            for (Map.Entry entry : b2.f().entrySet()) {
                Object key = entry.getKey();
                Intrinsics.h(key, "<get-key>(...)");
                Object value = entry.getValue();
                Intrinsics.h(value, "<get-value>(...)");
                i2.a((String) key, (String) value);
            }
            String c2 = b2.c();
            Intrinsics.h(c2, "getLocationUri(...)");
            i2.i(c2);
            Response b3 = chain.b(i2.b());
            if ((b3.f() == 401 || b3.f() == 403) && z2) {
                try {
                    if (b(str)) {
                        ResponseBody a2 = b3.a();
                        if (a2 != null) {
                            a2.close();
                        }
                        return a(chain, false);
                    }
                } catch (Exception e2) {
                    ResponseBody a3 = b3.a();
                    if (a3 != null) {
                        a3.close();
                    }
                    throw e2;
                }
            }
            return b3;
        } catch (OAuthSystemException e3) {
            throw new IOException(e3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        if (kotlin.text.StringsKt.C(r7.f39110c, r8, false, 2, (java.lang.Object) null) == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean b(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = r7.f39110c     // Catch:{ all -> 0x0014 }
            r1 = 1
            r2 = 0
            r3 = 2
            r4 = 0
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = r7.f39110c     // Catch:{ all -> 0x0014 }
            boolean r0 = kotlin.text.StringsKt.C(r0, r8, r4, r3, r2)     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x0012
            goto L_0x0016
        L_0x0012:
            monitor-exit(r7)
            return r1
        L_0x0014:
            r8 = move-exception
            goto L_0x005f
        L_0x0016:
            org.apache.oltu.oauth2.client.OAuthClient r0 = r7.f39109b     // Catch:{ OAuthSystemException -> 0x0045, OAuthProblemException -> 0x0043 }
            org.apache.oltu.oauth2.client.request.OAuthClientRequest$TokenRequestBuilder r5 = r7.f39108a     // Catch:{ OAuthSystemException -> 0x0045, OAuthProblemException -> 0x0043 }
            org.apache.oltu.oauth2.client.request.OAuthClientRequest r5 = r5.a()     // Catch:{ OAuthSystemException -> 0x0045, OAuthProblemException -> 0x0043 }
            org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse r0 = r0.c(r5)     // Catch:{ OAuthSystemException -> 0x0045, OAuthProblemException -> 0x0043 }
            if (r0 == 0) goto L_0x0050
            java.lang.String r5 = r0.k()     // Catch:{ OAuthSystemException -> 0x0045, OAuthProblemException -> 0x0043 }
            if (r5 == 0) goto L_0x0050
            java.lang.String r5 = r0.k()     // Catch:{ OAuthSystemException -> 0x0045, OAuthProblemException -> 0x0043 }
            r7.f39110c = r5     // Catch:{ OAuthSystemException -> 0x0045, OAuthProblemException -> 0x0043 }
            com.hansecom.mapi.auth.OAuth$AccessTokenListener r5 = r7.f39111d     // Catch:{ OAuthSystemException -> 0x0045, OAuthProblemException -> 0x0043 }
            if (r5 == 0) goto L_0x0047
            org.apache.oltu.oauth2.common.token.OAuthToken r0 = r0.m()     // Catch:{ OAuthSystemException -> 0x0045, OAuthProblemException -> 0x0043 }
            java.lang.String r6 = "null cannot be cast to non-null type org.apache.oltu.oauth2.common.token.BasicOAuthToken"
            kotlin.jvm.internal.Intrinsics.g(r0, r6)     // Catch:{ OAuthSystemException -> 0x0045, OAuthProblemException -> 0x0043 }
            org.apache.oltu.oauth2.common.token.BasicOAuthToken r0 = (org.apache.oltu.oauth2.common.token.BasicOAuthToken) r0     // Catch:{ OAuthSystemException -> 0x0045, OAuthProblemException -> 0x0043 }
            r5.a(r0)     // Catch:{ OAuthSystemException -> 0x0045, OAuthProblemException -> 0x0043 }
            goto L_0x0047
        L_0x0043:
            r8 = move-exception
            goto L_0x0053
        L_0x0045:
            r8 = move-exception
            goto L_0x0059
        L_0x0047:
            java.lang.String r0 = r7.f39110c     // Catch:{ OAuthSystemException -> 0x0045, OAuthProblemException -> 0x0043 }
            boolean r8 = kotlin.text.StringsKt.C(r0, r8, r4, r3, r2)     // Catch:{ OAuthSystemException -> 0x0045, OAuthProblemException -> 0x0043 }
            if (r8 != 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r1 = r4
        L_0x0051:
            monitor-exit(r7)
            return r1
        L_0x0053:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0014 }
            r0.<init>(r8)     // Catch:{ all -> 0x0014 }
            throw r0     // Catch:{ all -> 0x0014 }
        L_0x0059:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0014 }
            r0.<init>(r8)     // Catch:{ all -> 0x0014 }
            throw r0     // Catch:{ all -> 0x0014 }
        L_0x005f:
            monitor-exit(r7)     // Catch:{ all -> 0x0014 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.auth.OAuth.b(java.lang.String):boolean");
    }

    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.i(chain, "chain");
        return a(chain, true);
    }
}
